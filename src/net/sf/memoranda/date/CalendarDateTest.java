package net.sf.memoranda.date;

import java.util.Calendar;
import java.util.Date;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.0.5")
public class CalendarDateTest {

	private CalendarDate createTestSubject() {
		return new CalendarDate();
	}
//
//	@MethodRef(name = "dateToCalendar", signature = "(QDate;)QCalendar;")
//	@Test
//	public void dateToCalendar() throws Exception {
//		Date date = null;
//		Calendar result;
//
//		// default test
//		result = CalendarDate.dateToCalendar(date);
//	}

	@MethodRef(name = "today", signature = "()QCalendarDate;")
	@Test
	public void today() throws Exception {
		CalendarDate result;

		// default test
		result = CalendarDate.today();
	}

	@MethodRef(name = "yesterday", signature = "()QCalendarDate;")
	@Test
	public void yesterday() throws Exception {
		CalendarDate result;

		// default test
		result = CalendarDate.yesterday();
	}

	@MethodRef(name = "tomorrow", signature = "()QCalendarDate;")
	@Test
	public void tomorrow() throws Exception {
		CalendarDate result;

		// default test
		result = CalendarDate.tomorrow();
	}

	@MethodRef(name = "dateFromNow", signature = "(I)QCalendarDate;")
	@Test
	public void dateFromNow() throws Exception {
		CalendarDate testSubject;
		int distance = 0;
		CalendarDate result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.dateFromNow(distance);
	}

	@MethodRef(name = "toCalendar", signature = "(III)QCalendar;")
	@Test
	public void toCalendar() throws Exception {
		int day = 0;
		int month = 0;
		int year = 0;
		Calendar result;

		// default test
		result = CalendarDate.toCalendar(day, month, year);
	}

	@MethodRef(name = "toDate", signature = "(III)QDate;")
	@Test
	public void toDate() throws Exception {
		int day = 0;
		int month = 0;
		int year = 0;
		Date result;

		// default test
		result = CalendarDate.toDate(day, month, year);
	}

	@MethodRef(name = "getDayOfWeek", signature = "()I")
	@Test
	public void getDayOfWeek() throws Exception {
		CalendarDate testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getDayOfWeek();
	}

	@MethodRef(name = "getCalendar", signature = "()QCalendar;")
	@Test
	public void getCalendar() throws Exception {
		CalendarDate testSubject;
		Calendar result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCalendar();
	}

	@MethodRef(name = "getDate", signature = "()QDate;")
	@Test
	public void getDate() throws Exception {
		CalendarDate testSubject;
		Date result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getDate();
	}

	@MethodRef(name = "getDay", signature = "()I")
	@Test
	public void getDay() throws Exception {
		CalendarDate testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getDay();
	}

	@MethodRef(name = "getMonth", signature = "()I")
	@Test
	public void getMonth() throws Exception {
		CalendarDate testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMonth();
	}

	@MethodRef(name = "getYear", signature = "()I")
	@Test
	public void getYear() throws Exception {
		CalendarDate testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getYear();
	}

	@MethodRef(name = "compareTo", signature = "(QCalendarDate;)I")
	@Test
	public void compareTo() throws Exception {
		CalendarDate testSubject;
		CalendarDate date = null;
		int result;
	}

	@MethodRef(name = "equals", signature = "(QObject;)Z")
	@Test
	public void equals() throws Exception {
		CalendarDate testSubject;
		Object object = null;
		boolean result;
	}

	@MethodRef(name = "equals", signature = "(QCalendarDate;)Z")
	@Test
	public void equals_1() throws Exception {
		CalendarDate testSubject;
		CalendarDate date = null;
		boolean result;
	}

//	@MethodRef(name = "hashCode", signature = "()I")
//	@Test
//	public void hashCode() throws Exception {
//		CalendarDate testSubject;
//		int result;
//	}

	@MethodRef(name = "before", signature = "(QCalendarDate;)Z")
	@Test
	public void before() throws Exception {
		CalendarDate testSubject;
		CalendarDate date = null;
		boolean result;
	}

	@MethodRef(name = "after", signature = "(QCalendarDate;)Z")
	@Test
	public void after() throws Exception {
		CalendarDate testSubject;
		CalendarDate date = null;
		boolean result;
	}

	@MethodRef(name = "inPeriod", signature = "(QCalendarDate;QCalendarDate;)Z")
	@Test
	public void inPeriod() throws Exception {
		CalendarDate testSubject;
		CalendarDate startDate = null;
		CalendarDate endDate = null;
		boolean result;
	}

//	@MethodRef(name = "toString", signature = "()QString;")
//	@Test
//	public void toString() throws Exception {
//		CalendarDate testSubject;
//		String result;
//	}

	@MethodRef(name = "getFullDateString", signature = "()QString;")
	@Test
	public void getFullDateString() throws Exception {
		CalendarDate testSubject;
		String result;
	}

	@MethodRef(name = "getMediumDateString", signature = "()QString;")
	@Test
	public void getMediumDateString() throws Exception {
		CalendarDate testSubject;
		String result;
	}

	@MethodRef(name = "getLongDateString", signature = "()QString;")
	@Test
	public void getLongDateString() throws Exception {
		CalendarDate testSubject;
		String result;
	}

	@MethodRef(name = "getShortDateString", signature = "()QString;")
	@Test
	public void getShortDateString() throws Exception {
		CalendarDate testSubject;
		String result;
	}
}