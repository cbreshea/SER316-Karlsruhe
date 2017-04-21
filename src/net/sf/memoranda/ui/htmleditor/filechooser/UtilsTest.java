package net.sf.memoranda.ui.htmleditor.filechooser;

import java.io.File;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.0.5")
public class UtilsTest {

	private Utils createTestSubject() {
		return new Utils();
	}

	@MethodRef(name = "getExtension", signature = "(QFile;)QString;")
	@Test
	public void getExtension() throws Exception {
		File f = new File("");
		String result;

		// default test
		result = Utils.getExtension(f);
	}
}