package net.sf.memoranda.util;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import nu.xom.Element;

@Generated(value = "org.junit-tools-1.0.5")
public class PriorityQueueTest {

	private PriorityQueue createTestSubject() {
		return new PriorityQueue(0);
	}

	@MethodRef(name = "insertar", signature = "(QPair;)V")
	@Test
	public void insertar() throws Exception {
		PriorityQueue testSubject;
		Pair x = null;

		// default test
		testSubject = createTestSubject();
		testSubject.insertar(x);
	}

	@MethodRef(name = "extraer", signature = "()QElement;")
	@Test
	public void extraer() throws Exception {
		PriorityQueue testSubject;
		Element result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.extraer();
	}

	@MethodRef(name = "Vacia", signature = "()Z")
	@Test
	public void Vacia() throws Exception {
		PriorityQueue testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.Vacia();
	}
}