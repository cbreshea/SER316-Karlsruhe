package net.sf.memoranda.util;

import java.io.File;
import java.util.Calendar;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.memoranda.date.CalendarDate;

@Generated(value = "org.junit-tools-1.0.5")
public class UtilTest {

	private Util createTestSubject() {
		return new Util();
	}

	@MethodRef(name = "generateId", signature = "()QString;")
	@Test
	public void generateId() throws Exception {
		String result;

		// default test
		result = Util.generateId();
	}

	@MethodRef(name = "getEnvDir", signature = "()QString;")
	@Test
	public void getEnvDir() throws Exception {
		String result;

		// default test
		result = Util.getEnvDir();
	}

	@MethodRef(name = "getCDATA", signature = "(QString;)QString;")
	@Test
	public void getCDATA() throws Exception {
		String s = "";
		String result;

		// default test
		result = Util.getCDATA(s);
	}

	@MethodRef(name = "runBrowser", signature = "(QString;)V")
	@Test
	public void runBrowser() throws Exception {
		String url = "";

		// default test
		Util.runBrowser(url);
	}



	@MethodRef(name = "getHoursFromMillis", signature = "(J)QString;")
	@Test
	public void getHoursFromMillis() throws Exception {
		long ms = System.currentTimeMillis();
		String result;

		// default test
		result = Util.getHoursFromMillis(ms);
	}

	@MethodRef(name = "getMillisFromHours", signature = "(QString;)J")
	@Test
	public void getMillisFromHours() throws Exception {
		String hours = "";
		long result;

		// default test
		result = Util.getMillisFromHours(hours);
	}

	@MethodRef(name = "getTempFile", signature = "()QFile;")
	@Test
	public void getTempFile() throws Exception {
		File result;

		// default test
		result = Util.getTempFile();
	}

	@MethodRef(name = "debug", signature = "(QString;)V")
	@Test
	public void debug() throws Exception {
		String str = "";

		// default test
		Util.debug(str);
	}


}