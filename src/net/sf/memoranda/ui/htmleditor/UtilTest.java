package net.sf.memoranda.ui.htmleditor;

import java.awt.Color;

import javax.annotation.Generated;
import javax.swing.JTextField;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.0.5")
public class UtilTest {

	private Util createTestSubject() {
		return new Util();
	}

	@MethodRef(name = "getColorForName", signature = "(QString;QColor;)QColor;")
	@Test
	public void getColorForName() throws Exception {
		String name = "";
		Color defaultColor = null;
		Color result;

		// default test
		result = Util.getColorForName(name, defaultColor);
	}

	@MethodRef(name = "decodeColor", signature = "(QString;QColor;)QColor;")
	@Test
	public void decodeColor() throws Exception {
		String color = "";
		Color defaultColor = null;
		Color result;

		// default test
		result = Util.decodeColor(color, defaultColor);
	}

	@MethodRef(name = "encodeColor", signature = "(QColor;)QString;")
	@Test
	public void encodeColor() throws Exception {
		Color color = Color.black;
		String result;

		// default test
		result = Util.encodeColor(color);
	}

//	@MethodRef(name = "decodeColor", signature = "(QString;)QColor;")
//	@Test
//	public void decodeColor_1() throws Exception {
//		String color = "012";
//		Color result;
//
//		// default test
//		result = Util.decodeColor(color);
//	}

	@MethodRef(name = "setBgcolorField", signature = "(QJTextField;)V")
	@Test
	public void setBgcolorField() throws Exception {
		JTextField field = new JTextField();

		// default test
		Util.setBgcolorField(field);
	}

//	@MethodRef(name = "setColorField", signature = "(QJTextField;)V")
//	@Test
//	public void setColorField() throws Exception {
//		JTextField field = new JTextField("test");
//
//		// default test
//		Util.setColorField(field);
//	}
}