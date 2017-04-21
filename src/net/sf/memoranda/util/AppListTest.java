package net.sf.memoranda.util;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import nu.xom.Element;

@Generated(value = "org.junit-tools-1.0.5")
public class AppListTest {

	private AppList createTestSubject() {
		return new AppList(new Element("test"));
	}

	@MethodRef(name = "getPlafCode", signature = "(QString;)QString;")
	@Test
	public void getPlafCode() throws Exception {
		String osName = "";
		String result;

		// default test
		result = AppList.getPlafCode(osName);
	}

	@MethodRef(name = "getCommandLine", signature = "(QString;QString;)QString;")
	@Test
	public void getCommandLine() throws Exception {
		AppList testSubject;
		String appId = "";
		String fPath = "";
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCommandLine(appId, fPath);
	}

	@MethodRef(name = "getCommand", signature = "(QString;QString;)[QString;")
	@Test
	public void getCommand() throws Exception {
		AppList testSubject;
		String appId = "";
		String fPath = "";
		String[] result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCommand(appId, fPath);
	}

	@MethodRef(name = "getFindPath", signature = "(QString;)QString;")
	@Test
	public void getFindPath() throws Exception {
		AppList testSubject;
		String appId = "";
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getFindPath(appId);
	}

	@MethodRef(name = "setFindPath", signature = "(QString;QString;)V")
	@Test
	public void setFindPath() throws Exception {
		AppList testSubject;
		String appId = "";
		String p = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setFindPath(appId, p);
	}

	@MethodRef(name = "getExec", signature = "(QString;)QString;")
	@Test
	public void getExec() throws Exception {
		AppList testSubject;
		String appId = "";
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getExec(appId);
	}

	@MethodRef(name = "setExec", signature = "(QString;QString;)V")
	@Test
	public void setExec() throws Exception {
		AppList testSubject;
		String appId = "";
		String e = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setExec(appId, e);
	}

	@MethodRef(name = "getCommandLinePattern", signature = "(QString;)QString;")
	@Test
	public void getCommandLinePattern() throws Exception {
		AppList testSubject;
		String appId = "";
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCommandLinePattern(appId);
	}

	@MethodRef(name = "setCommandLinePattern", signature = "(QString;QString;)V")
	@Test
	public void setCommandLinePattern() throws Exception {
		AppList testSubject;
		String appId = "";
		String clp = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setCommandLinePattern(appId, clp);
	}

	@MethodRef(name = "addApp", signature = "(QString;QString;QString;QString;)V")
	@Test
	public void addApp() throws Exception {
		AppList testSubject;
		String appId = "";
		String fp = "";
		String exec = "";
		String clp = "";

		// default test
		testSubject = createTestSubject();
		testSubject.addApp(appId, fp, exec, clp);
	}

	@MethodRef(name = "addOrReplaceApp", signature = "(QString;QString;QString;QString;)V")
	@Test
	public void addOrReplaceApp() throws Exception {
		AppList testSubject;
		String appId = "";
		String fp = "";
		String exec = "";
		String clp = "";

		// default test
		testSubject = createTestSubject();
		testSubject.addOrReplaceApp(appId, fp, exec, clp);
	}

	@MethodRef(name = "getBrowserExec", signature = "()QString;")
	@Test
	public void getBrowserExec() throws Exception {
		AppList testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getBrowserExec();
	}

	@MethodRef(name = "setBrowserExec", signature = "(QString;)V")
	@Test
	public void setBrowserExec() throws Exception {
		AppList testSubject;
		String path = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setBrowserExec(path);
	}
}