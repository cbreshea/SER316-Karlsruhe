package net.sf.memoranda.util;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.0.5")
public class ContextTest {

	private Context createTestSubject() {
		return new Context();
	}

	@MethodRef(name = "get", signature = "(QObject;)QObject;")
	@Test
	public void get() throws Exception {
		Object key = "1";
		Object result;

		// default test
		result = Context.get(key);
	}

	@MethodRef(name = "put", signature = "(QObject;QObject;)V")
	@Test
	public void put() throws Exception {
		Object key = "1";
		Object value = 1;

		// default test
		Context.put(key, value);
	}
}