package net.sf.memoranda.JUnit;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;
import net.sf.memoranda.ProjectImpl;
import net.sf.memoranda.date.CalendarDate;
import nu.xom.Element;

@Generated(value = "org.junit-tools-1.0.5")
public class ProjectImplTest {

	private ProjectImpl createTestSubject() {
		return new ProjectImpl(new Element("test"));
	}

//	@MethodRef(name = "getID", signature = "()QString;")
//	@Test
//	public void getID() throws Exception {
//		ProjectImpl testSubject;
//		String result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.getID();
//	}

	@MethodRef(name = "getStartDate", signature = "()QCalendarDate;")
	@Test
	public void getStartDate() throws Exception {
		ProjectImpl testSubject;
		CalendarDate result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getStartDate();
	}

	@MethodRef(name = "setStartDate", signature = "(QCalendarDate;)V")
	@Test
	public void setStartDate() throws Exception {
		ProjectImpl testSubject;
		CalendarDate date = null;

		// test 1
		testSubject = createTestSubject();
		date = null;
		testSubject.setStartDate(date);
	}

	@MethodRef(name = "getEndDate", signature = "()QCalendarDate;")
	@Test
	public void getEndDate() throws Exception {
		ProjectImpl testSubject;
		CalendarDate result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getEndDate();
	}

	@MethodRef(name = "setEndDate", signature = "(QCalendarDate;)V")
	@Test
	public void setEndDate() throws Exception {
		ProjectImpl testSubject;
		CalendarDate date = null;

		// test 1
		testSubject = createTestSubject();
		date = null;
		testSubject.setEndDate(date);
	}

	@MethodRef(name = "getStatus", signature = "()I")
	@Test
	public void getStatus() throws Exception {
		ProjectImpl testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getStatus();
	}

	@MethodRef(name = "isFrozen", signature = "()Z")
	@Test
	public void isFrozen() throws Exception {
		ProjectImpl testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = Deencapsulation.invoke(testSubject, "isFrozen");
	}

	@MethodRef(name = "freeze", signature = "()V")
	@Test
	public void freeze() throws Exception {
		ProjectImpl testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.freeze();
	}

	@MethodRef(name = "unfreeze", signature = "()V")
	@Test
	public void unfreeze() throws Exception {
		ProjectImpl testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.unfreeze();
	}

	@MethodRef(name = "getTitle", signature = "()QString;")
	@Test
	public void getTitle() throws Exception {
		ProjectImpl testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTitle();
	}

	@MethodRef(name = "setTitle", signature = "(QString;)V")
	@Test
	public void setTitle() throws Exception {
		ProjectImpl testSubject;
		String title = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setTitle(title);
	}

//	@MethodRef(name = "setAttr", signature = "(QString;QString;)V")
//	@Test
//	public void setAttr() throws Exception {
//		ProjectImpl testSubject;
//		String name = "test";
//		String value = "test";
//
//		// test 1
//		testSubject = createTestSubject();
//		value = null;
//		Deencapsulation.invoke(testSubject, "setAttr", new Object[] { name, value });
//
//		// test 2
//		testSubject = createTestSubject();
//		value = "";
//		Deencapsulation.invoke(testSubject, "setAttr", new Object[] { name, value });
//	}

	@MethodRef(name = "getDescription", signature = "()QString;")
	@Test
	public void getDescription() throws Exception {
		ProjectImpl testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getDescription();
	}

	@MethodRef(name = "setDescription", signature = "(QString;)V")
	@Test
	public void setDescription() throws Exception {
		ProjectImpl testSubject;
		String s = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setDescription(s);
	}
}