package net.sf.memoranda.ui.htmleditor.util;

import java.util.Hashtable;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.0.5")
public class LocalTest {

	private Local createTestSubject() {
		return new Local();
	}

	@MethodRef(name = "setMessages", signature = "(QHashtable<QObject;QObject;>;)V")
	@Test
	public void setMessages() throws Exception {
		Hashtable<Object, Object> msgs = null;

		// default test
		Local.setMessages(msgs);
	}

	@MethodRef(name = "getString", signature = "(QString;)QString;")
	@Test
	public void getString() throws Exception {
		String key = "";
		String result;

		// default test
		result = Local.getString(key);
	}
}