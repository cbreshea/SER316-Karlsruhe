package net.sf.memoranda.util;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;

@Generated(value = "org.junit-tools-1.0.5")
public class ConfigurationTest {

	private Configuration createTestSubject() {
		return new Configuration();
	}

	@MethodRef(name = "getConfigPath", signature = "()QString;")
	@Test
	public void getConfigPath() throws Exception {
		String result;

		// default test
		result = Deencapsulation.invoke(Configuration.class, "getConfigPath");
	}

	@MethodRef(name = "saveConfig", signature = "()V")
	@Test
	public void saveConfig() throws Exception {

		// default test
		Configuration.saveConfig();
	}

	@MethodRef(name = "get", signature = "(QString;)QObject;")
	@Test
	public void get() throws Exception {
		String key = "";
		Object result;

		// default test
		result = Configuration.get(key);
	}

	@MethodRef(name = "put", signature = "(QString;QObject;)V")
	@Test
	public void put() throws Exception {
		String key = "1";
		Object value = 1;

		// default test
		Configuration.put(key, value);
	}
}