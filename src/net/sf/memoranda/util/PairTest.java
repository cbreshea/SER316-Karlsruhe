package net.sf.memoranda.util;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import nu.xom.Element;

@Generated(value = "org.junit-tools-1.0.5")
public class PairTest {

	private Pair createTestSubject() {
		return new Pair(new Element("test"), 0);
	}

	@MethodRef(name = "getElement", signature = "()QElement;")
	@Test
	public void getElement() throws Exception {
		Pair testSubject;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getElement();
	}

	@MethodRef(name = "setElement", signature = "(QElement;)V")
	@Test
	public void setElement() throws Exception {
		Pair testSubject;
		Element value = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setElement(value);
	}

	@MethodRef(name = "getPriority", signature = "()I")
	@Test
	public void getPriority() throws Exception {
		Pair testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPriority();
	}

	@MethodRef(name = "setPriority", signature = "(I)V")
	@Test
	public void setPriority() throws Exception {
		Pair testSubject;
		int priority = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.setPriority(priority);
	}
}