package net.sf.memoranda.date;

import java.util.Collection;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;

@Generated(value = "org.junit-tools-1.0.5")
public class CurrentDateTest {

	private CurrentDate createTestSubject() {
		return new CurrentDate();
	}

	@MethodRef(name = "get", signature = "()QCalendarDate;")
	@Test
	public void get() throws Exception {
		CalendarDate result;

		// default test
		result = CurrentDate.get();
	}

//	@MethodRef(name = "set", signature = "(QCalendarDate;)V")
//	@Test
//	public void set() throws Exception {
//		CalendarDate date = null;
//
//		// default test
//		CurrentDate.set(date);
//	}

	@MethodRef(name = "reset", signature = "()V")
	@Test
	public void reset() throws Exception {

		// default test
		CurrentDate.reset();
	}

	@MethodRef(name = "addDateListener", signature = "(QDateListener;)V")
	@Test
	public void addDateListener() throws Exception {
		DateListener dl = null;

		// default test
		CurrentDate.addDateListener(dl);
	}

	@MethodRef(name = "getChangeListeners", signature = "()QCollection<QDateListener;>;")
	@Test
	public void getChangeListeners() throws Exception {
		Collection<DateListener> result;

		// default test
		result = CurrentDate.getChangeListeners();
	}

//	@MethodRef(name = "dateChanged", signature = "(QCalendarDate;)V")
//	@Test
//	public void dateChanged() throws Exception {
//		CalendarDate date = null;
//
//		// default test
//		Deencapsulation.invoke(CurrentDate.class, "dateChanged", new Object[] { CalendarDate.class });
//	}
}