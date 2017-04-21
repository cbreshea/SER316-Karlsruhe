package net.sf.memoranda.JUnit;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.memoranda.DefaultEventNotifier;

@Generated(value = "org.junit-tools-1.0.5")
public class DefaultEventNotifierTest {

	private DefaultEventNotifier createTestSubject() {
		return new DefaultEventNotifier();
	}

//	@MethodRef(name = "eventIsOccured", signature = "(QEvent;)V")
//	@Test
//	public void eventIsOccured() throws Exception {
//		DefaultEventNotifier testSubject;
//		Event ev = null;
//
//		// default test
//		testSubject = createTestSubject();
//		testSubject.eventIsOccured(ev);
//	}

	@MethodRef(name = "eventsChanged", signature = "()V")
	@Test
	public void eventsChanged() throws Exception {
		DefaultEventNotifier testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.eventsChanged();
	}
}