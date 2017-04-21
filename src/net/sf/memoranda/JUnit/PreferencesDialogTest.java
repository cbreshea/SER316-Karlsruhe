package net.sf.memoranda.JUnit;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import net.sf.memoranda.ui.PreferencesDialog;

public class PreferencesDialogTest {
private PreferencesDialog pref;
private Vector<String> fonts;
	@Before
	public void setUp() throws Exception {
		pref = new PreferencesDialog();
	}

	@Test
	public void testFontNames() {
		fonts = pref.getFontNames();
		assertTrue(fonts.size() > 0);
	}

}
