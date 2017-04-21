package net.sf.memoranda.JUnit;

import java.util.Date;
import java.util.Vector;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;
import net.sf.memoranda.Event;
import net.sf.memoranda.EventNotificationListener;
import net.sf.memoranda.EventsScheduler;

@Generated(value = "org.junit-tools-1.0.5")
public class EventsSchedulerTest {

	private EventsScheduler createTestSubject() {
		return new EventsScheduler();
	}

	@MethodRef(name = "init", signature = "()V")
	@Test
	public void init() throws Exception {

		// default test
		EventsScheduler.init();
	}

	@MethodRef(name = "cancelAll", signature = "()V")
	@Test
	public void cancelAll() throws Exception {

		// default test
		EventsScheduler.cancelAll();
	}

	@MethodRef(name = "getScheduledEvents", signature = "()QVector<QEvent;>;")
	@Test
	public void getScheduledEvents() throws Exception {
		Vector<Event> result;

		// default test
		result = EventsScheduler.getScheduledEvents();
	}

	@MethodRef(name = "getFirstScheduledEvent", signature = "()QEvent;")
	@Test
	public void getFirstScheduledEvent() throws Exception {
		Event result;

		// default test
		result = EventsScheduler.getFirstScheduledEvent();
	}

	@MethodRef(name = "addListener", signature = "(QEventNotificationListener;)V")
	@Test
	public void addListener() throws Exception {
		EventNotificationListener enl = null;

		// default test
		EventsScheduler.addListener(enl);
	}

	@MethodRef(name = "isEventScheduled", signature = "()Z")
	@Test
	public void isEventScheduled() throws Exception {
		boolean result;

		// default test
		result = EventsScheduler.isEventScheduled();
	}

//	@MethodRef(name = "notifyListeners", signature = "(QEvent;)V")
//	@Test
//	public void notifyListeners() throws Exception {
//		Event ev = null;
//
//		// default test
//		Deencapsulation.invoke(EventsScheduler.class, "notifyListeners", new Object[] { Event.class });
//	}

//	@MethodRef(name = "notifyChanged", signature = "()V")
//	@Test
//	public void notifyChanged() throws Exception {
//
//		// default test
//		Deencapsulation.invoke(EventsScheduler.class, "notifyChanged");
//	}

	@MethodRef(name = "getMidnight", signature = "()QDate;")
	@Test
	public void getMidnight() throws Exception {
		Date result;

		// default test
		result = Deencapsulation.invoke(EventsScheduler.class, "getMidnight");
	}
}