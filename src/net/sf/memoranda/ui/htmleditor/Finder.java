/**
 * Finder.java
 * Created on 18.03.2003, 13:57:20 Alex
 * Package: net.sf.memoranda.ui.htmleditor
 *
 * @author Alex V. Alishevskikh, alex@openmechanics.net
 * Copyright (c) 2003 OpenMechanics.org
 */
package net.sf.memoranda.ui.htmleditor;
import java.awt.Dimension;
import java.awt.Point;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import net.sf.memoranda.ui.htmleditor.util.Local;

public class Finder extends Thread {

    Pattern pattern;
    String find_1 = null;
    String dispText = "";
    String replace_1 = null;
    HTMLEditor editor;

    /**
     * Constructor for Finder.
     */
    public Finder(
        HTMLEditor theEditor,
        String find,
        boolean wholeWord,
        boolean matchCase,
        boolean regexp,
        String replace) {
        super();
        editor = theEditor;
        dispText = find;
        int flags = Pattern.DOTALL;
        if (!matchCase)
            flags = flags + Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE;
        find_1 = find;
        if (!regexp)
            find_1 = "\\Q" + find_1 + "\\E";
        if (wholeWord)
            find_1 = "[\\s\\p{Punct}]" + find_1 + "[\\s\\p{Punct}]";
        try {
            pattern = Pattern.compile(find_1, flags);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            pattern = null;
        }
        replace_1 = replace;
    }

    public Finder(HTMLEditor theEditor, String find, boolean wholeWord, boolean matchCase, boolean regexp) {
        this(theEditor, find, wholeWord, matchCase, regexp, null);
    }

    public void findAll() {
        if (pattern == null)
            return;
        String text = "";
        try {
            text = editor.editor.getDocument().getText(0, editor.editor.getDocument().getLength() - 1);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
        ContinueSearchDialog cdlg = new ContinueSearchDialog(this, dispText);
        boolean replaceAll = false;
        boolean showCdlg = false;
        int start = 0;
        Matcher matcher = pattern.matcher(text);
        while (matcher.find(start)) {
            editor.editor.requestFocus();
            editor.editor.setCaretPosition(matcher.end());
            editor.editor.select(matcher.start(), matcher.end());
            if (replace_1 != null) {
                if (!replaceAll) {
                    ReplaceOptionsDialog dlg = new ReplaceOptionsDialog(Local.getString("Replace this occurence?"));
                    Dimension dlgSize = new Dimension(400, 150);
                    dlg.setSize(400, 150);
                    Dimension frmSize = editor.getParent().getSize();
                    Point loc = editor.getLocationOnScreen();
                    dlg.setLocation(
                        (frmSize.width - dlgSize.width) / 2 + loc.x,
                        (frmSize.height - dlgSize.height) / 2 + loc.y);
                    dlg.setModal(true);
                    dlg.setVisible(true);
                    int op = dlg.option;
                    if (op == ReplaceOptionsDialog.YES_OPTION) {
                        editor.editor.replaceSelection(replace_1);
                        start = matcher.start() + replace_1.length();
                    }
                    else if (op == ReplaceOptionsDialog.YES_TO_ALL_OPTION) {
                        editor.editor.replaceSelection(replace_1);
                        start = matcher.start() + replace_1.length();
                        replaceAll = true;
                    }
                    else if (op == ReplaceOptionsDialog.CANCEL_OPTION)
                        return;
                    else
                        start = matcher.end();
                }
                else {
                    editor.editor.replaceSelection(replace_1);
                    start = matcher.start() + replace_1.length();
                }
            }
            else {
                /*int n = JOptionPane.showConfirmDialog(null, "Continue search?", "Find", JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.NO_OPTION)
                    return;*/
                cdlg.cont = false;
                cdlg.cancel = false;
                if (!showCdlg) {
                    editor.showToolsPanel();
                    editor.toolsPanel.addTab(Local.getString("Find"), cdlg);
                    showCdlg = true;
                }                
                this.suspend();

                if (cdlg.cancel) {
                    editor.toolsPanel.remove(cdlg);
                    if (editor.toolsPanel.getTabCount() == 0)
                        editor.hideToolsPanel();
                    return;
                }
                start = matcher.end();
            }
            try {
                text = editor.editor.getDocument().getText(0, editor.editor.getDocument().getLength() - 1);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return;
            }
            matcher = pattern.matcher(text);
        }

        JOptionPane.showMessageDialog(null, Local.getString("Search complete")+".");
        if (showCdlg) {
            editor.toolsPanel.remove(cdlg);
            if (editor.toolsPanel.getTabCount() == 0)
                editor.hideToolsPanel();
        }

    }

    public void run() {
        findAll();
    }
}
