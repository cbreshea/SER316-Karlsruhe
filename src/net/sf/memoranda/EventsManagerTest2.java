package net.sf.memoranda;

import static org.junit.Assert.*;
import java.util.*;

import javax.annotation.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;
import net.sf.memoranda.EventsManager.Year;
import net.sf.memoranda.date.CalendarDate;
import nu.xom.Element;

@Generated(value = "org.junit-tools-1.0.5")
public class EventsManagerTest2 {

	private EventsManager createTestSubject() {
		return new EventsManager();
	}

	@MethodRef(name = "createSticker", signature = "(QString;I)V")
	@Test
	public void createSticker() throws Exception {
		String text = "";
		int prior = 0;

		// default test
		EventsManager.createSticker(text, prior);
	}

	@MethodRef(name = "getStickers", signature = "()QMap<QString;QElement;>;")
	@Test
	public void getStickers() throws Exception {
		Map<String, Element> result;

		// default test
		result = EventsManager.getStickers();
	}

	@MethodRef(name = "removeSticker", signature = "(QString;)V")
	@Test
	public void removeSticker() throws Exception {
		String stickerId = "";

		// default test
		EventsManager.removeSticker(stickerId);
	}

//	@MethodRef(name = "isNREventsForDate", signature = "(QCalendarDate;)Z")
//	@Test
//	public void isNREventsForDate() throws Exception {
//		CalendarDate date = null;
//		boolean result;
//
//		// default test
//		result = EventsManager.isNREventsForDate(date);
//	}

//	@MethodRef(name = "getEventsForDate", signature = "(QCalendarDate;)QCollection<QEvent;>;")
//	@Test
//	public void getEventsForDate() throws Exception {
//		CalendarDate date = null;
//		Collection<Event> result;
//
//		// default test
//		result = EventsManager.getEventsForDate(date);
//	}

//	@MethodRef(name = "getEventsForDateHelper", signature = "(QCalendarDate;)QVector<QEvent;>;")
//	@Test
//	public void getEventsForDateHelper() throws Exception {
//		CalendarDate date = null;
//		Vector<Event> result;
//
//		// default test
//		result = Deencapsulation.invoke(EventsManager.class, "getEventsForDateHelper",
//				new Object[] { CalendarDate.class });
//	}

//	@MethodRef(name="getEventsForDateHelper", signature="(QCalendarDate;QArrayList<QCalendarDate;>;)QVector<QEvent;>;")
//	@Test
//	public void getEventsForDateHelper_1() throws Exception {
//	CalendarDate date = null;
//	ArrayList<CalendarDate> dates = null;
//	Vector<Event> result;
//	
//	// default test
//	result=Deencapsulation.invoke(EventsManager.class, "getEventsForDateHelper", new Object[]{CalendarDate.class, ArrayList<CalendarDate>.class});
//	}

//	@MethodRef(name = "getEventsForWeek", signature = "(QCalendarDate;IQArrayList<QCalendarDate;>;)QCollection<QEvent;>;")
//	@Test
//	public void getEventsForWeek() throws Exception {
//		CalendarDate date = null;
//		int dayOfWeekStart = 0;
//		ArrayList<CalendarDate> dates = null;
//		Collection<Event> result;
//
//		// default test
//		result = EventsManager.getEventsForWeek(date, dayOfWeekStart, dates);
//	}

//	@MethodRef(name = "getEventsForMonth", signature = "(QCalendarDate;QArrayList<QCalendarDate;>;)QCollection<QEvent;>;")
//	@Test
//	public void getEventsForMonth() throws Exception {
//		CalendarDate date = null;
//		ArrayList<CalendarDate> dates = null;
//		Collection<Event> result;
//
//		// default test
//		result = EventsManager.getEventsForMonth(date, dates);
//	}

//	@MethodRef(name = "createEvent", signature = "(QCalendarDate;IIQString;)QEvent;")
//	@Test
//	public void createEvent() throws Exception {
//		CalendarDate date = null;
//		int hh = 0;
//		int mm = 0;
//		String text = "";
//		Event result;
//
//		// default test
//		result = EventsManager.createEvent(date, hh, mm, text);
//	}

//	@MethodRef(name = "createRepeatableEvent", signature = "(IQCalendarDate;QCalendarDate;IIIQString;Z)QEvent;")
//	@Test
//	public void createRepeatableEvent() throws Exception {
//		int type = 0;
//		CalendarDate startDate = null;
//		CalendarDate endDate = null;
//		int period = 0;
//		int hh = 0;
//		int mm = 0;
//		String text = "";
//		boolean workDays = false;
//		Event result;
//
//		// test 1
//		endDate = null;
//		result = EventsManager.createRepeatableEvent(type, startDate, endDate, period, hh, mm, text, workDays);
//		Assert.assertEquals(null, result);
//	}

	@MethodRef(name = "getRepeatableEvents", signature = "()QCollection<QEvent;>;")
	@Test
	public void getRepeatableEvents() throws Exception {
		Collection<Event> result;

		// default test
		result = EventsManager.getRepeatableEvents();
	}

	@MethodRef(name = "getRepeatableEventsForDate", signature = "(QCalendarDate;)QCollection<QEvent;>;")
	@Test
	public void getRepeatableEventsForDate() throws Exception {
		CalendarDate date = null;
		Collection<Event> result;

		// default test
		result = EventsManager.getRepeatableEventsForDate(date);
	}

	@MethodRef(name = "getRepeatableEventsForDate", signature = "(QCalendarDate;QArrayList<QCalendarDate;>;)QCollection<QEvent;>;")
	@Test
	public void getRepeatableEventsForDate_1() throws Exception {
		CalendarDate date = null;
		ArrayList<CalendarDate> dates = null;
		Collection<Event> result;

		// default test
		result = EventsManager.getRepeatableEventsForDate(date, dates);
	}

	@MethodRef(name = "getActiveEvents", signature = "()QCollection<QEvent;>;")
	@Test
	public void getActiveEvents() throws Exception {
		Collection<Event> result;

		// default test
		result = EventsManager.getActiveEvents();
	}

//	@MethodRef(name = "getEvent", signature = "(QCalendarDate;II)QEvent;")
//	@Test
//	public void getEvent() throws Exception {
//		CalendarDate date = null;
//		int hh = 0;
//		int mm = 0;
//		Event result;
//
//		// default test
//		result = EventsManager.getEvent(date, hh, mm);
//	}

//	@MethodRef(name = "removeEvent", signature = "(QEvent;)V")
//	@Test
//	public void removeEvent() throws Exception {
//		Event ev = null;
//
//		// default test
//		EventsManager.removeEvent(ev);
//	}

//	@MethodRef(name = "createDay", signature = "(QCalendarDate;)QDay;")
//	@Test
//	public void createDay() throws Exception {
//		CalendarDate date = null;
//		Day result;
//
//		// default test
//		result = Deencapsulation.invoke(EventsManager.class, "createDay", new Object[] { CalendarDate.class });
//	}

	@MethodRef(name = "createYear", signature = "(I)QYear;")
	@Test
	public void createYear() throws Exception {
		int y = 0;
		Year result;

		// default test
		result = Deencapsulation.invoke(EventsManager.class, "createYear", new Object[] { y });
	}

	@MethodRef(name = "getYear", signature = "(I)QYear;")
	@Test
	public void getYear() throws Exception {
		int y = 0;
		Year result;

		// default test
		result = Deencapsulation.invoke(EventsManager.class, "getYear", new Object[] { y });
	}

//	@MethodRef(name = "getDay", signature = "(QCalendarDate;)QDay;")
//	@Test
//	public void getDay() throws Exception {
//		CalendarDate date = null;
//		Day result;
//
//		// default test
//		result = Deencapsulation.invoke(EventsManager.class, "getDay", new Object[] { CalendarDate.class });
//	}

	@MethodRef(name = "hardReset", signature = "()V")
	@Test
	public void hardReset() throws Exception {

		// default test
		EventsManager.hardReset();
	}
}