package net.sf.memoranda.ui;

import java.util.Vector;
import java.util.HashMap;

import net.sf.memoranda.util.Configuration;
import net.sf.memoranda.util.CurrentStorage;
import net.sf.memoranda.util.Local;
import net.sf.memoranda.util.MimeTypesList;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.File;

import net.miginfocom.swing.MigLayout;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class PreferencesDialog extends JDialog {
	private static final long serialVersionUID = -8014591076036422134L;

	GridBagConstraints gbc;

	ButtonGroup closeGroup = new ButtonGroup();

	Border rstPanelBorder;

	TitledBorder rsbpBorder;

	TitledBorder titledBorder1;

	ButtonGroup soundGroup = new ButtonGroup();
	Vector<String> fontnames = getFontNames();
	private JTextField tf_browser;
	private JTextField tf_soundFile;
	private JComboBox<String> cmb_theme;
	private JComboBox<String> cmb_language;
	private JComboBox<String> cmb_closeAction;
	private JRadioButton rb_default;
	private JRadioButton rb_beep;
	private JRadioButton rb_custom;
	private JComboBox<String> cmb_normalFont;
	private JComboBox<String> cmb_headerFont;
	private JComboBox<String> cmb_monoFont;
	private JSpinner cmb_fontSize;
	private JComboBox<String> cmb_firstDay;
	private JCheckBox cb_locale;
	private JCheckBox cb_splash;
	private JCheckBox cb_trayIcon;
	private JCheckBox cb_startMin;
	private JCheckBox cb_AskOnExit;
	private JCheckBox cb_notifications;
	private JCheckBox cb_antialiasing;
	private JLabel lbl_soundFile;
	private Vector<String> fontNames = getFontNames();
	private JButton but_browser;
	private JComboBox<String> cmb_minimizeAction;
	private JButton but_apply;
	private JButton but_soundFile;

	public PreferencesDialog(Frame frame) {
		super(frame, Local.getString("Preferences"), true);
		try {
			jbInit();
		} catch (Exception ex) {
			new ExceptionDialog(ex);
		}
	}

	public PreferencesDialog() {
		this(null);
	}

	void jbInit() throws Exception {
		titledBorder1 = new TitledBorder(BorderFactory.createEtchedBorder(
				Color.white, new Color(156, 156, 158)), Local
				.getString("Sound"));
		this.setResizable(false);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel General = new JPanel();
		tabbedPane.addTab("General", null, General, null);
		tabbedPane.setEnabledAt(0, true);
		GridBagLayout gbl_General = new GridBagLayout();
		gbl_General.columnWidths = new int[]{120, 100, 11, 142, 100, 0};
		gbl_General.rowHeights = new int[]{0, 26, 0, 0, 0, 26, 12, 0};
		gbl_General.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_General.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		General.setLayout(gbl_General);

		JLabel lbl_system = new JLabel("System:");
		GridBagConstraints gbc_lbl_system = new GridBagConstraints();
		gbc_lbl_system.anchor = GridBagConstraints.WEST;
		gbc_lbl_system.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_system.gridx = 0;
		gbc_lbl_system.gridy = 0;
		General.add(lbl_system, gbc_lbl_system);

		JLabel lbl_lookAndFeel = new JLabel("Look and Feel:");
		GridBagConstraints gbc_lbl_lookAndFeel = new GridBagConstraints();
		gbc_lbl_lookAndFeel.anchor = GridBagConstraints.WEST;
		gbc_lbl_lookAndFeel.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_lookAndFeel.gridx = 3;
		gbc_lbl_lookAndFeel.gridy = 0;
		General.add(lbl_lookAndFeel, gbc_lbl_lookAndFeel);

		JLabel lbl_minimizeAction = new JLabel("Minimize Action:");
		GridBagConstraints gbc_lbl_minimizeAction = new GridBagConstraints();
		gbc_lbl_minimizeAction.anchor = GridBagConstraints.EAST;
		gbc_lbl_minimizeAction.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_minimizeAction.gridx = 0;
		gbc_lbl_minimizeAction.gridy = 1;
		General.add(lbl_minimizeAction, gbc_lbl_minimizeAction);

		cmb_minimizeAction = new JComboBox<String>();
		cmb_minimizeAction.addItem(Local.getString("Minimize to taskbar"));
		cmb_minimizeAction.addItem(Local.getString("Hide"));
		cmb_minimizeAction.setSelectedIndex(0);
		cmb_minimizeAction.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				applyChangeActionPerformed();
			}
		});


		GridBagConstraints gbc_cmb_minimizeAction = new GridBagConstraints();
		gbc_cmb_minimizeAction.insets = new Insets(0, 0, 5, 5);
		gbc_cmb_minimizeAction.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmb_minimizeAction.gridx = 1;
		gbc_cmb_minimizeAction.gridy = 1;
		General.add(cmb_minimizeAction, gbc_cmb_minimizeAction);

		JLabel lbl_theme = new JLabel("Theme:");
		GridBagConstraints gbc_lbl_theme = new GridBagConstraints();
		gbc_lbl_theme.anchor = GridBagConstraints.EAST;
		gbc_lbl_theme.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_theme.gridx = 3;
		gbc_lbl_theme.gridy = 1;
		General.add(lbl_theme, gbc_lbl_theme);

		cmb_theme = new JComboBox<String>();
		cmb_theme.addItem("System Theme");
		cmb_theme.addItem("Java Theme");
		cmb_theme.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				applyChangeActionPerformed();
			}
		});

		GridBagConstraints gbc_cmb_theme = new GridBagConstraints();
		gbc_cmb_theme.insets = new Insets(0, 0, 5, 0);
		gbc_cmb_theme.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmb_theme.gridx = 4;
		gbc_cmb_theme.gridy = 1;
		General.add(cmb_theme, gbc_cmb_theme);

		JLabel lbl_closeAction = new JLabel("Close Action:");
		GridBagConstraints gbc_lbl_closeAction = new GridBagConstraints();
		gbc_lbl_closeAction.anchor = GridBagConstraints.EAST;
		gbc_lbl_closeAction.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_closeAction.gridx = 0;
		gbc_lbl_closeAction.gridy = 2;
		General.add(lbl_closeAction, gbc_lbl_closeAction);

		cmb_closeAction = new JComboBox<String>();
		cmb_closeAction.addItem("Close and exit");
		cmb_closeAction.addItem("Hide");
		cmb_closeAction.setSelectedIndex(0);
		cmb_closeAction.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				applyChangeActionPerformed();
			}
		});

		GridBagConstraints gbc_cmb_closeAction = new GridBagConstraints();
		gbc_cmb_closeAction.insets = new Insets(0, 0, 5, 5);
		gbc_cmb_closeAction.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmb_closeAction.gridx = 1;
		gbc_cmb_closeAction.gridy = 2;
		General.add(cmb_closeAction, gbc_cmb_closeAction);

		JLabel lbl_locale = new JLabel("Localization");
		GridBagConstraints gbc_lbl_locale = new GridBagConstraints();
		gbc_lbl_locale.anchor = GridBagConstraints.EAST;
		gbc_lbl_locale.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_locale.gridx = 3;
		gbc_lbl_locale.gridy = 2;
		General.add(lbl_locale, gbc_lbl_locale);

		cb_locale = new JCheckBox("");
		cb_locale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cb_locale_actionPerformed(e);
			}
		});
		GridBagConstraints gbc_cb_locale = new GridBagConstraints();
		gbc_cb_locale.anchor = GridBagConstraints.WEST;
		gbc_cb_locale.insets = new Insets(0, 0, 5, 0);
		gbc_cb_locale.gridx = 4;
		gbc_cb_locale.gridy = 2;
		General.add(cb_locale, gbc_cb_locale);

		JLabel lbl_trayIcon = new JLabel("System Tray Icon:");
		GridBagConstraints gbc_lbl_trayIcon = new GridBagConstraints();
		gbc_lbl_trayIcon.anchor = GridBagConstraints.EAST;
		gbc_lbl_trayIcon.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_trayIcon.gridx = 0;
		gbc_lbl_trayIcon.gridy = 3;
		General.add(lbl_trayIcon, gbc_lbl_trayIcon);

		cb_trayIcon = new JCheckBox("");
		cb_trayIcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyChangeActionPerformed();
			}
		});
		GridBagConstraints gbc_cb_trayIcon = new GridBagConstraints();
		gbc_cb_trayIcon.anchor = GridBagConstraints.WEST;
		gbc_cb_trayIcon.insets = new Insets(0, 0, 5, 5);
		gbc_cb_trayIcon.gridx = 1;
		gbc_cb_trayIcon.gridy = 3;
		General.add(cb_trayIcon, gbc_cb_trayIcon);

		JLabel lbl_language = new JLabel("Language:");
		GridBagConstraints gbc_lbl_language = new GridBagConstraints();
		gbc_lbl_language.anchor = GridBagConstraints.EAST;
		gbc_lbl_language.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_language.gridx = 3;
		gbc_lbl_language.gridy = 3;
		General.add(lbl_language, gbc_lbl_language);

		cmb_language = new JComboBox<String>();
		cmb_language.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				applyChangeActionPerformed();
			}
		});
		GridBagConstraints gbc_cmb_language = new GridBagConstraints();
		gbc_cmb_language.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmb_language.insets = new Insets(0, 0, 5, 0);
		gbc_cmb_language.gridx = 4;
		gbc_cmb_language.gridy = 3;
		General.add(cmb_language, gbc_cmb_language);

		JLabel lbl_startMin = new JLabel("Start Minimized:");
		GridBagConstraints gbc_lbl_startMin = new GridBagConstraints();
		gbc_lbl_startMin.anchor = GridBagConstraints.EAST;
		gbc_lbl_startMin.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_startMin.gridx = 0;
		gbc_lbl_startMin.gridy = 4;
		General.add(lbl_startMin, gbc_lbl_startMin);

		cb_startMin = new JCheckBox("");
		cb_startMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyChangeActionPerformed();
			}
		});
		GridBagConstraints gbc_cb_startMin = new GridBagConstraints();
		gbc_cb_startMin.anchor = GridBagConstraints.WEST;
		gbc_cb_startMin.insets = new Insets(0, 0, 5, 5);
		gbc_cb_startMin.gridx = 1;
		gbc_cb_startMin.gridy = 4;
		General.add(cb_startMin, gbc_cb_startMin);

		JLabel lbl_splash = new JLabel("Show Splash Screen:");
		GridBagConstraints gbc_lbl_splash = new GridBagConstraints();
		gbc_lbl_splash.anchor = GridBagConstraints.EAST;
		gbc_lbl_splash.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_splash.gridx = 0;
		gbc_lbl_splash.gridy = 5;
		General.add(lbl_splash, gbc_lbl_splash);

		cb_splash = new JCheckBox("");
		cb_splash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyChangeActionPerformed();
			}
		});
		GridBagConstraints gbc_cb_splash = new GridBagConstraints();
		gbc_cb_splash.anchor = GridBagConstraints.WEST;
		gbc_cb_splash.insets = new Insets(0, 0, 5, 5);
		gbc_cb_splash.gridx = 1;
		gbc_cb_splash.gridy = 5;
		General.add(cb_splash, gbc_cb_splash);

		JLabel lbl_firstDay = new JLabel("First Day of the Week:");
		GridBagConstraints gbc_lbl_firstDay = new GridBagConstraints();
		gbc_lbl_firstDay.anchor = GridBagConstraints.EAST;
		gbc_lbl_firstDay.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_firstDay.gridx = 3;
		gbc_lbl_firstDay.gridy = 5;
		General.add(lbl_firstDay, gbc_lbl_firstDay);

		cmb_firstDay = new JComboBox<String>();
		cmb_firstDay.addItem("First day of week - Monday");
		cmb_firstDay.addItem("First day of week - Sunday");
		cmb_firstDay.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				applyChangeActionPerformed();
			}
		});

		GridBagConstraints gbc_cmb_firstDay = new GridBagConstraints();
		gbc_cmb_firstDay.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmb_firstDay.insets = new Insets(0, 0, 5, 0);
		gbc_cmb_firstDay.gridx = 4;
		gbc_cmb_firstDay.gridy = 5;
		General.add(cmb_firstDay, gbc_cmb_firstDay);

		JLabel lbl_AskOnExit = new JLabel(Local.getString("Ask on Exit"));
		GridBagConstraints gbc_lbl_AskOnExit = new GridBagConstraints();
		gbc_lbl_AskOnExit.anchor = GridBagConstraints.EAST;
		gbc_lbl_AskOnExit.insets = new Insets(0, 0, 0, 5);
		gbc_lbl_AskOnExit.gridx = 0;
		gbc_lbl_AskOnExit.gridy = 6;
		General.add(lbl_AskOnExit, gbc_lbl_AskOnExit);

		cb_AskOnExit = new JCheckBox("");
		cb_AskOnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyChangeActionPerformed();
			}
		});
		GridBagConstraints gbc_cb_AskOnExit = new GridBagConstraints();
		gbc_cb_AskOnExit.anchor = GridBagConstraints.WEST;
		gbc_cb_AskOnExit.insets = new Insets(0, 0, 0, 5);
		gbc_cb_AskOnExit.gridx = 1;
		gbc_cb_AskOnExit.gridy = 6;
		General.add(cb_AskOnExit, gbc_cb_AskOnExit);

		JPanel Resources = new JPanel();
		tabbedPane.addTab("Resources", null, Resources, null);
		Resources.setLayout(new MigLayout("", "[535.00px,grow]", "[196.00px][35px,grow]"));

		ResourceTypePanel resourceTypePanel = new ResourceTypePanel();
		Resources.add(resourceTypePanel, "cell 0 0,grow");
		resourceTypePanel.setBorder(rstPanelBorder);

		JPanel panel_1 = new JPanel();
		Resources.add(panel_1, "cell 0 1,grow");
		panel_1.setLayout(new MigLayout("", "[89px][326px][110px]", "[46px]"));

		JLabel lbl_browser = new JLabel();
		lbl_browser.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lbl_browser, "cell 0 0,alignx left,aligny center");
		lbl_browser.setText("Web Browser Path:");

		tf_browser = new JTextField();
		panel_1.add(tf_browser, "cell 1 0,growx,aligny center");
		tf_browser.setPreferredSize(new Dimension(250, 25));

		but_browser = new JButton();
		but_browser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				but_browser_actionPerformed(e);
			}
		});
		but_browser.setText(Local.getString("Browse"));
		but_browser.setPreferredSize(new Dimension(110, 25));
		panel_1.add(but_browser, "cell 2 0,alignx left,aligny center");


		JPanel Sound = new JPanel();
		tabbedPane.addTab("Sound", null, Sound, null);
		GridBagLayout gbl_Sound = new GridBagLayout();
		gbl_Sound.columnWidths = new int[]{151, 0};
		gbl_Sound.rowHeights = new int[]{0, 194, 0};
		gbl_Sound.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_Sound.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		Sound.setLayout(gbl_Sound);

		cb_notifications = new JCheckBox();
		cb_notifications.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cb_notifications_actionPerformed(e);
			}
		});
		cb_notifications.setText(Local.getString("Enable sound notifications"));

		GridBagConstraints gbc_cb_notifications = new GridBagConstraints();
		gbc_cb_notifications.anchor = GridBagConstraints.WEST;
		gbc_cb_notifications.insets = new Insets(0, 0, 5, 0);
		gbc_cb_notifications.gridx = 0;
		gbc_cb_notifications.gridy = 0;
		Sound.add(cb_notifications, gbc_cb_notifications);

		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 1;
		Sound.add(panel_5, gbc_panel_5);
		panel_5.setBorder(titledBorder1);
		GridLayout gl_panel_5 = new GridLayout();
		gl_panel_5.setColumns(1);
		gl_panel_5.setRows(4);
		panel_5.setLayout(gl_panel_5);

		rb_default = new JRadioButton();
		rb_default.setText(Local.getString("Default"));
		rb_default.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rb_default_actionPerformed(e);
			}
		});
		soundGroup.add(rb_default);
		panel_5.add(rb_default);


		rb_beep = new JRadioButton();
		rb_beep.setText(Local.getString("System beep"));
		rb_beep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rb_beep_actionPerformed(e);
			}
		});
		soundGroup.add(rb_beep);
		panel_5.add(rb_beep);

		rb_custom = new JRadioButton();
		rb_custom.setText(Local.getString("Custom"));
		rb_custom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rb_custom_actionPerformed(e);
			}
		});
		soundGroup.add(rb_custom);
		panel_5.add(rb_custom);


		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		panel_6.setLayout(new MigLayout("", "[51px][231.00px][67px]", "[23px]"));

		lbl_soundFile = new JLabel();
		lbl_soundFile.setText(Local.getString("Sound file") + ":");

		panel_6.add(lbl_soundFile, "cell 0 0,alignx left,aligny center");

		tf_soundFile = new JTextField();
		tf_soundFile.setHorizontalAlignment(SwingConstants.CENTER);
		tf_soundFile.setEnabled(true);
		panel_6.add(tf_soundFile, "cell 1 0,growx,aligny center");

		but_soundFile = new JButton();
		but_soundFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				but_soundFile_actionPerformed(e);
			}
		});
		but_soundFile.setText(Local.getString("Browse"));
		but_soundFile.setEnabled(false);
		panel_6.add(but_soundFile, "cell 2 0,alignx left,aligny top");

		JPanel Editor = new JPanel();
		tabbedPane.addTab("Editor", null, Editor, null);
		GridBagLayout gbl_Editor = new GridBagLayout();
		gbl_Editor.columnWidths = new int[]{105, 0, 0};
		gbl_Editor.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_Editor.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_Editor.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Editor.setLayout(gbl_Editor);

		JLabel lbl_normalFont = new JLabel("Normal Font:");
		GridBagConstraints gbc_lbl_normalFont = new GridBagConstraints();
		gbc_lbl_normalFont.anchor = GridBagConstraints.EAST;
		gbc_lbl_normalFont.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_normalFont.gridx = 0;
		gbc_lbl_normalFont.gridy = 0;
		Editor.add(lbl_normalFont, gbc_lbl_normalFont);

		cmb_normalFont = new JComboBox<String>(fontNames);
		cmb_normalFont.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				applyChangeActionPerformed();
			}
		});
		GridBagConstraints gbc_cmb_normalFont = new GridBagConstraints();
		gbc_cmb_normalFont.anchor = GridBagConstraints.WEST;
		gbc_cmb_normalFont.insets = new Insets(0, 0, 5, 0);
		gbc_cmb_normalFont.gridx = 1;
		gbc_cmb_normalFont.gridy = 0;
		Editor.add(cmb_normalFont, gbc_cmb_normalFont);

		JLabel lbl_headerFont = new JLabel("Header Font:");
		GridBagConstraints gbc_lbl_headerFont = new GridBagConstraints();
		gbc_lbl_headerFont.anchor = GridBagConstraints.EAST;
		gbc_lbl_headerFont.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_headerFont.gridx = 0;
		gbc_lbl_headerFont.gridy = 1;
		Editor.add(lbl_headerFont, gbc_lbl_headerFont);

		cmb_headerFont = new JComboBox<String>(fontNames);
		cmb_headerFont.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				applyChangeActionPerformed();
			}
		});
		GridBagConstraints gbc_cmb_headerFont = new GridBagConstraints();
		gbc_cmb_headerFont.anchor = GridBagConstraints.WEST;
		gbc_cmb_headerFont.insets = new Insets(0, 0, 5, 0);
		gbc_cmb_headerFont.gridx = 1;
		gbc_cmb_headerFont.gridy = 1;
		Editor.add(cmb_headerFont, gbc_cmb_headerFont);

		JLabel lbl_monoFont = new JLabel("Monospaced Font:");
		GridBagConstraints gbc_lbl_monoFont = new GridBagConstraints();
		gbc_lbl_monoFont.anchor = GridBagConstraints.EAST;
		gbc_lbl_monoFont.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_monoFont.gridx = 0;
		gbc_lbl_monoFont.gridy = 2;
		Editor.add(lbl_monoFont, gbc_lbl_monoFont);

		cmb_monoFont = new JComboBox<String>(fontNames);
		cmb_monoFont.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				applyChangeActionPerformed();
			}
		});
		GridBagConstraints gbc_cmb_monoFont = new GridBagConstraints();
		gbc_cmb_monoFont.anchor = GridBagConstraints.WEST;
		gbc_cmb_monoFont.insets = new Insets(0, 0, 5, 0);
		gbc_cmb_monoFont.gridx = 1;
		gbc_cmb_monoFont.gridy = 2;
		Editor.add(cmb_monoFont, gbc_cmb_monoFont);

		JLabel lbl_fontSize = new JLabel("Font Size:");
		GridBagConstraints gbc_lbl_fontSize = new GridBagConstraints();
		gbc_lbl_fontSize.anchor = GridBagConstraints.EAST;
		gbc_lbl_fontSize.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_fontSize.gridx = 0;
		gbc_lbl_fontSize.gridy = 3;
		Editor.add(lbl_fontSize, gbc_lbl_fontSize);

		cmb_fontSize = new JSpinner();
		cmb_fontSize.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				applyChangeActionPerformed();
			}
		});
		GridBagConstraints gbc_cmb_fontSize = new GridBagConstraints();
		gbc_cmb_fontSize.insets = new Insets(0, 0, 5, 0);
		gbc_cmb_fontSize.anchor = GridBagConstraints.WEST;
		gbc_cmb_fontSize.gridx = 1;
		gbc_cmb_fontSize.gridy = 3;
		Editor.add(cmb_fontSize, gbc_cmb_fontSize);

		JLabel lbl_antialiasing = new JLabel("Antialiasing:");
		GridBagConstraints gbc_lbl_antialiasing = new GridBagConstraints();
		gbc_lbl_antialiasing.anchor = GridBagConstraints.EAST;
		gbc_lbl_antialiasing.insets = new Insets(0, 0, 0, 5);
		gbc_lbl_antialiasing.gridx = 0;
		gbc_lbl_antialiasing.gridy = 4;
		Editor.add(lbl_antialiasing, gbc_lbl_antialiasing);

		cb_antialiasing = new JCheckBox("");
		cb_antialiasing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyChangeActionPerformed();
			}
		});
		GridBagConstraints gbc_cb_antialiasing = new GridBagConstraints();
		gbc_cb_antialiasing.anchor = GridBagConstraints.WEST;
		gbc_cb_antialiasing.gridx = 1;
		gbc_cb_antialiasing.gridy = 4;
		Editor.add(cb_antialiasing, gbc_cb_antialiasing);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);

		JButton but_OK = new JButton("OK");
		closeGroup.add(but_OK);
		but_OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent okClicked) {
				okBtn_actionPerformed(okClicked);
			}
		});
		panel.add(but_OK);

		JButton but_cancel = new JButton(Local.getString("Cancel"));
		but_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelBtn_actionPerformed(e);
			}
		});
		closeGroup.add(but_cancel);
		panel.add(but_cancel);

		but_apply = new JButton("Apply");
		but_apply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				but_apply_actionPerformed(e);
			}
		});
		closeGroup.add(but_apply);
		panel.add(but_apply);

		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.insets = new Insets(2, 0, 0, 10);
		gbc.anchor = GridBagConstraints.WEST;
		// populate with languages
		HashMap<String, String> languageTags = Local.languageTags;
		
		//Safety
		assert(languageTags.size() > 0) : "Empty language tags has been detected";
		for (String s : languageTags.keySet()) {
			cmb_language.addItem(s);
			//Safety
			assert(cmb_language.getItemCount() > 0) : "Empty language tags has been detected";
		}

		// Build Tab2
		rstPanelBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		rsbpBorder = new TitledBorder(BorderFactory.createEmptyBorder(5, 5, 5,
				5), Local.getString("Web browser executable"));

		// set all config-values
		setValues();

	}

	void setValues() {
		// language
		String item;
		for (int i = 0; i < cmb_language.getItemCount(); i++) {
			item = (String) cmb_language.getItemAt(i);
			if (Local.languageTags.get(item).equalsIgnoreCase(Configuration.get("LANGUAGE").toString())) {
				cmb_language.setSelectedIndex(i);
				break;
			}
		}

		if (!Configuration.get("DISABLE_L10N").toString().equalsIgnoreCase("yes")) {
			cb_locale.setSelected(true);
			cmb_language.setEnabled(false);
		}else{
			cb_locale.setSelected(false);
			cmb_language.setEnabled(true);
		}

//		enableCustomLF(false);
		String lf = Configuration.get("LOOK_AND_FEEL").toString();
		if (lf.equalsIgnoreCase("system"))
			cmb_theme.setSelectedIndex(0);	//System theme
		else if (lf.equalsIgnoreCase("default")){
			cmb_theme.setSelectedIndex(1);	//Java theme
//		else if (lf.length() > 0) {
//
//			cmb_theme.setSelectedIndex(2);
//			enableCustomLF(true);
//			lfClassName.setText(lf);
		} else
			cmb_theme.setSelectedIndex(1);
		String onclose = Configuration.get("ON_CLOSE").toString();
		if (onclose.equals("exit")) {
			this.cmb_closeAction.setSelectedIndex(0);	//Close and exit
			// this.askConfirmChB.setEnabled(true);
		} else {
			this.cmb_closeAction.setSelectedIndex(1);	//Hide
			// this.askConfirmChB.setEnabled(false);
		}

		String onmin = Configuration.get("ON_MINIMIZE").toString();
		if(onmin.equals("minimize")){
			this.cmb_minimizeAction.setSelectedIndex(0);
		}else if(onmin.equals("hide")){
			this.cmb_minimizeAction.setSelectedIndex(1);
		}

		if (!System.getProperty("os.name").startsWith("Win"))
			this.tf_browser.setText(MimeTypesList.getAppList()
					.getBrowserExec());

		String antialias = Configuration.get("ANTIALIAS_TEXT").toString();
		if(antialias.equals("yes")){
			cb_antialiasing.setSelected(true);
		}else if(antialias.equals("no")){
			cb_antialiasing.setSelected(false);
		}


		String sysTray = Configuration.get("DISABLE_SYSTRAY").toString();
		if(sysTray.equals("no")){
			cb_trayIcon.setSelected(true);
		}else if (sysTray.equals("yes")){
			cb_trayIcon.setSelected(false);
		}

		String startMin = Configuration.get("START_MINIMIZED").toString();
		if(startMin.equals("yes")){
			cb_startMin.setSelected(true);
		}else if(startMin.equals("no")){
			cb_startMin.setSelected(false);
		}

		String showSplash = Configuration.get("SHOW_SPLASH").toString();
		if(showSplash.equals("yes")){
			cb_splash.setSelected(true);
		}else if(showSplash.equals("no")){
			cb_splash.setSelected(false);
		}

		String askOnExit = Configuration.get("ASK_ON_EXIT").toString();
		if(askOnExit.equals("yes")){
			cb_AskOnExit.setSelected(true);
		}else if(askOnExit.equals("no")){
			cb_AskOnExit.setSelected(false);
		}

		String firstDay = Configuration.get("FIRST_DAY_OF_WEEK").toString();
		if(firstDay.equals("mon")){
			cmb_firstDay.setSelectedIndex(0);
		}else if(firstDay.equals("sun")){
			cmb_firstDay.setSelectedIndex(1);
		}

		String enableSnd = Configuration.get("NOTIFY_SOUND").toString();

		this.enableSound(true);
		cb_notifications.setSelected(true);
		if(enableSnd.equals("DISABLED")){
			this.enableSound(false);
			cb_notifications.setSelected(false);
		}
		else if (enableSnd.equals("DEFAULT")) {

			this.rb_default.setSelected(true);
			this.enableCustomSound(false);
		} else if (enableSnd.equals("BEEP")) {
			this.rb_beep.setSelected(true);
			this.enableCustomSound(false);
		} else {
			System.out.println(enableSnd);
			this.rb_custom.setSelected(true);
			this.tf_soundFile.setText(enableSnd);
			this.enableCustomSound(true);
		}


		if (Configuration.get("NORMAL_FONT").toString().length() >0)
			cmb_normalFont.setSelectedItem(Configuration.get("NORMAL_FONT").toString());
		else
			cmb_normalFont.setSelectedItem("serif");
		if (Configuration.get("HEADER_FONT").toString().length() >0)
			cmb_headerFont.setSelectedItem(Configuration.get("HEADER_FONT").toString());
		else
			cmb_headerFont.setSelectedItem("sans-serif");
		if (Configuration.get("MONO_FONT").toString().length() >0)
			cmb_monoFont.setSelectedItem(Configuration.get("MONO_FONT").toString());
		else
			cmb_monoFont.setSelectedItem("monospaced");
		if (Configuration.get("BASE_FONT_SIZE").toString().length() >0)
			cmb_fontSize.setValue(Integer.decode(Configuration.get("BASE_FONT_SIZE").toString()));
		else
			cmb_fontSize.setValue(new Integer(16));
	}

	void apply() {
		if (this.cmb_firstDay.getSelectedIndex() == 0){
			Configuration.put("FIRST_DAY_OF_WEEK", "mon");
		}
		else{
			Configuration.put("FIRST_DAY_OF_WEEK", "sun");
		}
		assert(!Configuration.get("FIRST_DAY_OF_WEEK").toString().isEmpty()):"Empty value in FIRST_DAY_OF_WEEK";

		if (this.cb_locale.isSelected()){
			Configuration.put("DISABLE_L10N", "no");
		}
		else{
			Configuration.put("DISABLE_L10N", "yes");
		}
		assert(!Configuration.get("DISABLE_L10N").toString().isEmpty()):"Empty value in DISABLE_L10N";
		
		if (this.cb_splash.isSelected()){
			Configuration.put("SHOW_SPLASH", "yes");
		}
		else{
			Configuration.put("SHOW_SPLASH", "no");
		}
		assert(!Configuration.get("SHOW_SPLASH").toString().isEmpty()):"Empty value in SHOW_SPLASH";
		
		if (this.cb_trayIcon.isSelected()){
			Configuration.put("DISABLE_SYSTRAY", "no");
		}
		else{
			Configuration.put("DISABLE_SYSTRAY", "yes");
		}
		assert(!Configuration.get("DISABLE_SYSTRAY").toString().isEmpty()):"Empty value in DISABLE_SYSTRAY";
		
		if (this.cb_startMin.isSelected()){
			Configuration.put("START_MINIMIZED", "yes");
		}
		else{
			Configuration.put("START_MINIMIZED", "no");
		}
		assert(!Configuration.get("START_MINIMIZED").toString().isEmpty()):"Empty value in START_MINIMIZED";
		
		if (this.cb_AskOnExit.isSelected()){
			Configuration.put("ASK_ON_EXIT", "yes");
		}
		else{
			Configuration.put("ASK_ON_EXIT", "no");
		}
		assert(!Configuration.get("ASK_ON_EXIT").toString().isEmpty()):"Empty value in ASK_ON_EXIT";
		
		if (this.cmb_closeAction.getSelectedIndex() == 0){
			Configuration.put("ON_CLOSE", "exit");
		}
		else{
			Configuration.put("ON_CLOSE", "minimize");
		}
		assert(!Configuration.get("ON_CLOSE").toString().isEmpty()):"Empty value in ON_CLOSE";
		
		if(this.cmb_minimizeAction.getSelectedIndex() == 0){
			Configuration.put("ON_MINIMIZE", "minimize");
		}else{
			Configuration.put("ON_MINIMIZE", "hide");
		}
		assert(!Configuration.get("ON_MINIMIZE").toString().isEmpty()):"Empty value in ON_MINIMIZE";
		
		String lf = Configuration.get("LOOK_AND_FEEL").toString();
		String newlf = "";

		if (this.cmb_theme.getSelectedIndex() == 0){
			newlf = "system";
		}
		else if (this.cmb_theme.getSelectedIndex() == 1){
			newlf = "default";
		}
		assert(!Configuration.get("LOOK_AND_FEEL").toString().isEmpty()):"Empty value in LOOK_AND_FEEL";
//		else if (this.cmb_theme.getSelectedIndex() == 2){
//
////			newlf = this.lfClassName.getText();
//		}

		if (!lf.equalsIgnoreCase(newlf)) {
			Configuration.put("LOOK_AND_FEEL", newlf);
			try {
				if (Configuration.get("LOOK_AND_FEEL").equals("system"))
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
				else if (Configuration.get("LOOK_AND_FEEL").equals("default"))
					UIManager.setLookAndFeel(UIManager
							.getCrossPlatformLookAndFeelClassName());
				else if (Configuration.get("LOOK_AND_FEEL").toString().length() > 0)
					UIManager.setLookAndFeel(Configuration.get("LOOK_AND_FEEL")
							.toString());

				SwingUtilities.updateComponentTreeUI(App.getFrame());

			} catch (Exception e) {
				Configuration.put("LOOK_AND_FEEL", lf);
				new ExceptionDialog(
						e,
						"Error when initializing a pluggable look-and-feel. Default LF will be used.",
						"Make sure that specified look-and-feel library classes are on the CLASSPATH.");
			}
		}
		String brPath = this.tf_browser.getText();
		if (new java.io.File(brPath).isFile()) {
			MimeTypesList.getAppList().setBrowserExec(brPath);
			CurrentStorage.get().storeMimeTypesList();
		}

		if (!this.cb_notifications.isSelected()){
			Configuration.put("NOTIFY_SOUND", "DISABLED");
		}
		else if (this.rb_default.isSelected()){
			Configuration.put("NOTIFY_SOUND", "DEFAULT");
		}
		else if (this.rb_beep.isSelected()){
			Configuration.put("NOTIFY_SOUND", "BEEP");
		}
		else if ((this.rb_custom.isSelected())
				&& (this.tf_soundFile.getText().trim().length() > 0)){
			Configuration.put("NOTIFY_SOUND", this.tf_soundFile.getText().trim());
		}
		assert(!Configuration.get("NOTIFY_SOUND").toString().isEmpty()):"Empty value in NOTIFY_SOUND";

		if (cb_antialiasing.isSelected())
			Configuration.put("ANTIALIAS_TEXT", "yes");
		else
			Configuration.put("ANTIALIAS_TEXT", "no");

		if (cb_locale.isSelected()) {
			Configuration.put("DISABLE_L10N", "no");
		}
		else {
			Configuration.put("DISABLE_L10N", "yes");
		}
		Configuration.put("LANGUAGE", Local.languageTags.get(cmb_language.getSelectedItem().toString()));

		Configuration.put("NORMAL_FONT", cmb_normalFont.getSelectedItem());
		Configuration.put("HEADER_FONT", cmb_headerFont.getSelectedItem());
		Configuration.put("MONO_FONT", cmb_monoFont.getSelectedItem());
		Configuration.put("BASE_FONT_SIZE", cmb_fontSize.getValue());
		App.getFrame().workPanel.dailyItemsPanel.editorPanel.editor.editor.setAntiAlias(cb_antialiasing.isSelected());
		App.getFrame().workPanel.dailyItemsPanel.editorPanel.initCSS();
		App.getFrame().workPanel.dailyItemsPanel.editorPanel.editor.repaint();

		Configuration.saveConfig();

	}

//	void customTheme_actionPerformed(ActionEvent e){
//		this.enableCustomLF(true);
//	}

	void cb_locale_actionPerformed(ActionEvent e){
		applyChangeActionPerformed();
		cmb_language.setEnabled(!cmb_language.isEnabled());
	}

	void okBtn_actionPerformed(ActionEvent e){
		apply();
		this.dispose();
	}

	void but_browser_actionPerformed(ActionEvent e){
		// Fix until Sun's JVM supports more locales...
		UIManager.put("FileChooser.lookInLabelText", Local
				.getString("Look in:"));
		UIManager.put("FileChooser.upFolderToolTipText", Local
				.getString("Up One Level"));
		UIManager.put("FileChooser.newFolderToolTipText", Local
				.getString("Create New Folder"));
		UIManager.put("FileChooser.listViewButtonToolTipText", Local
				.getString("List"));
		UIManager.put("FileChooser.detailsViewButtonToolTipText", Local
				.getString("Details"));
		UIManager.put("FileChooser.fileNameLabelText", Local
				.getString("File Name:"));
		UIManager.put("FileChooser.filesOfTypeLabelText", Local
				.getString("Files of Type:"));
		UIManager.put("FileChooser.openButtonText", Local.getString("Open"));
		UIManager.put("FileChooser.openButtonToolTipText", Local
				.getString("Open selected file"));
		UIManager
				.put("FileChooser.cancelButtonText", Local.getString("Cancel"));
		UIManager.put("FileChooser.cancelButtonToolTipText", Local
				.getString("Cancel"));

		JFileChooser chooser = new JFileChooser();
		chooser.setFileHidingEnabled(false);
		chooser.setDialogTitle(Local
				.getString("Select the web-browser executable"));
		chooser.setAcceptAllFileFilterUsed(true);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setPreferredSize(new Dimension(550, 375));
		if (System.getProperty("os.name").startsWith("Win")) {
			chooser.setFileFilter(new AllFilesFilter(AllFilesFilter.EXE));
			chooser.setCurrentDirectory(new File("C:\\Program Files"));
		}
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
		this.tf_browser.setText(chooser.getSelectedFile().getPath());
	}

	void but_soundFile_actionPerformed(ActionEvent e) {
		// Fix until Sun's JVM supports more locales...
		UIManager.put("FileChooser.lookInLabelText", Local
				.getString("Look in:"));
		UIManager.put("FileChooser.upFolderToolTipText", Local
				.getString("Up One Level"));
		UIManager.put("FileChooser.newFolderToolTipText", Local
				.getString("Create New Folder"));
		UIManager.put("FileChooser.listViewButtonToolTipText", Local
				.getString("List"));
		UIManager.put("FileChooser.detailsViewButtonToolTipText", Local
				.getString("Details"));
		UIManager.put("FileChooser.fileNameLabelText", Local
				.getString("File Name:"));
		UIManager.put("FileChooser.filesOfTypeLabelText", Local
				.getString("Files of Type:"));
		UIManager.put("FileChooser.openButtonText", Local.getString("Open"));
		UIManager.put("FileChooser.openButtonToolTipText", Local
				.getString("Open selected file"));
		UIManager
				.put("FileChooser.cancelButtonText", Local.getString("Cancel"));
		UIManager.put("FileChooser.cancelButtonToolTipText", Local
				.getString("Cancel"));

		JFileChooser chooser = new JFileChooser();
		chooser.setFileHidingEnabled(false);
		chooser.setDialogTitle(Local.getString("Select the sound file"));
		chooser.setAcceptAllFileFilterUsed(true);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setPreferredSize(new Dimension(550, 375));
		chooser.setFileFilter(new AllFilesFilter(AllFilesFilter.WAV));
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
		this.tf_soundFile.setText(chooser.getSelectedFile().getPath());
	}

	void rb_custom_actionPerformed(ActionEvent e){
		applyChangeActionPerformed();
		this.enableCustomSound(true);
	}

	void cb_notifications_actionPerformed(ActionEvent e){
		applyChangeActionPerformed();
		enableSound(cb_notifications.isSelected());
	}

//	void enableCustomLF(boolean is) {

//		this.classNameLabel.setEnabled(is);
//		this.lfClassName.setEnabled(is);
//	}

	void enableCustomSound(boolean is) {
		but_soundFile.setEnabled(is);
		this.tf_soundFile.setEnabled(is);
		this.tf_browser.setEnabled(is);
		this.lbl_soundFile.setEnabled(is);
	}

	void enableSound(boolean is) {
		this.rb_default.setEnabled(is);
		this.rb_beep.setEnabled(is);
		this.rb_custom.setEnabled(is);
		enableCustomSound(is);
		this.tf_soundFile.setEnabled(is && rb_custom.isSelected());
		this.lbl_soundFile.setEnabled(is && rb_custom.isSelected());

	}

	void rb_default_actionPerformed(ActionEvent e){
		applyChangeActionPerformed();
		this.enableCustomSound(false);
	}

	void applyChangeActionPerformed(){
		but_apply.setEnabled(true);
	}
//	void lfSystemRB_actionPerformed(ActionEvent e) {
//		this.enableCustomLF(false);
//	}

//	void lfJavaRB_actionPerformed(ActionEvent e) {
//		this.enableCustomLF(false);
//	}

	void rb_beep_actionPerformed(ActionEvent e) {
		applyChangeActionPerformed();
		this.enableCustomSound(false);

	}

	void cancelBtn_actionPerformed(ActionEvent e){
		this.dispose();
	}

	void but_apply_actionPerformed(ActionEvent e){
		apply();
		but_apply.setEnabled(false);
	}

	public Vector<String> getFontNames() {
		GraphicsEnvironment gEnv =
        	GraphicsEnvironment.getLocalGraphicsEnvironment();
        String envfonts[] = gEnv.getAvailableFontFamilyNames();
        Vector<String> fonts = new Vector<String>();
        fonts.add("serif");
        fonts.add("sans-serif");
        fonts.add("monospaced");
        for (int i = 0; i < envfonts.length; i++)
            fonts.add(envfonts[i]);
		return fonts;
	}
}
