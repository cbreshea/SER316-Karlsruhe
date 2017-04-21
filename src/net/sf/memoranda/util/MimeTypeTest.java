package net.sf.memoranda.util;

import javax.annotation.Generated;
import javax.swing.ImageIcon;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import nu.xom.Element;

@Generated(value = "org.junit-tools-1.0.5")
public class MimeTypeTest {

	private MimeType createTestSubject() {
		return new MimeType(new Element("test"));
	}

//	@MethodRef(name = "getMimeTypeId", signature = "()QString;")
//	@Test
//	public void getMimeTypeId() throws Exception {
//		MimeType testSubject;
//		String result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.getMimeTypeId();
//	}

	@MethodRef(name = "getExtension", signature = "()QString;")
	@Test
	public void getExtension() throws Exception {
		MimeType testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getExtension();
	}

	@MethodRef(name = "getExtensions", signature = "()[QString;")
	@Test
	public void getExtensions() throws Exception {
		MimeType testSubject;
		String[] result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getExtensions();
	}

	@MethodRef(name = "addExtension", signature = "(QString;)V")
	@Test
	public void addExtension() throws Exception {
		MimeType testSubject;
		String ext = "";

		// default test
		testSubject = createTestSubject();
		testSubject.addExtension(ext);
	}

//	@MethodRef(name = "getLabel", signature = "()QString;")
//	@Test
//	public void getLabel() throws Exception {
//		MimeType testSubject;
//		String result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.getLabel();
//	}

	@MethodRef(name = "setLabel", signature = "(QString;)V")
	@Test
	public void setLabel() throws Exception {
		MimeType testSubject;
		String label = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setLabel(label);
	}

	@MethodRef(name = "getAppId", signature = "(QString;)QString;")
	@Test
	public void getAppId() throws Exception {
		MimeType testSubject;
		String plafCode = "";
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAppId(plafCode);
	}

	@MethodRef(name = "setApp", signature = "(QString;QString;)V")
	@Test
	public void setApp() throws Exception {
		MimeType testSubject;
		String plafCode = "";
		String appId = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setApp(plafCode, appId);
	}

	@MethodRef(name = "setApp", signature = "(QString;)V")
	@Test
	public void setApp_1() throws Exception {
		MimeType testSubject;
		String appId = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setApp(appId);
	}

	@MethodRef(name = "getAppId", signature = "()QString;")
	@Test
	public void getAppId_1() throws Exception {
		MimeType testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAppId();
	}

	@MethodRef(name = "getIconPath", signature = "()QString;")
	@Test
	public void getIconPath() throws Exception {
		MimeType testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getIconPath();
	}

	@MethodRef(name = "setIconPath", signature = "(QString;)V")
	@Test
	public void setIconPath() throws Exception {
		MimeType testSubject;
		String path = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setIconPath(path);
	}

//	@MethodRef(name = "getIcon", signature = "()QImageIcon;")
//	@Test
//	public void getIcon() throws Exception {
//		MimeType testSubject;
//		ImageIcon result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.getIcon();
//	}
}