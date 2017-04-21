package net.sf.memoranda.JUnit;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.memoranda.Resource;

@Generated(value = "org.junit-tools-1.0.5")
public class ResourceTest {

	private Resource createTestSubject() {
		return new Resource("", false, false);
	}

	@MethodRef(name = "getPath", signature = "()QString;")
	@Test
	public void getPath() throws Exception {
		Resource testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPath();
	}

	@MethodRef(name = "isInetShortcut", signature = "()Z")
	@Test
	public void isInetShortcut() throws Exception {
		Resource testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isInetShortcut();
	}

	@MethodRef(name = "isProjectFile", signature = "()Z")
	@Test
	public void isProjectFile() throws Exception {
		Resource testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isProjectFile();
	}
}