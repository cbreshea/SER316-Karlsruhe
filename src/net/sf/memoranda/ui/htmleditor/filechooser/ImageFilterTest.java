package net.sf.memoranda.ui.htmleditor.filechooser;

import java.io.File;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.0.5")
public class ImageFilterTest {

	private ImageFilter createTestSubject() {
		return new ImageFilter();
	}

	@MethodRef(name = "accept", signature = "(QFile;)Z")
	@Test
	public void accept() throws Exception {
		ImageFilter testSubject;
		File f = new File("");
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.accept(f);
	}

	@MethodRef(name = "getDescription", signature = "()QString;")
	@Test
	public void getDescription() throws Exception {
		ImageFilter testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getDescription();
	}
}