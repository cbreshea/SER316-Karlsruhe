package net.sf.memoranda;

import static org.junit.Assert.*;
import java.util.*;

import javax.annotation.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;
import net.sf.memoranda.date.CalendarDate;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

@Generated(value = "org.junit-tools-1.0.5")
public class TaskListImplTest {

	private TaskListImpl createTestSubject() {
		return new TaskListImpl(new Document(new Element("test")), ProjectManager.getAllProjects().firstElement());
	}

	@MethodRef(name = "getProject", signature = "()QProject;")
	@Test
	public void getProject() throws Exception {
		TaskListImpl testSubject;
		Project result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getProject();
	}

//	@MethodRef(name = "buildElements", signature = "(QElement;)V")
//	@Test
//	public void buildElements() throws Exception {
//		TaskListImpl testSubject;
//		Element parent = null;
//
//		// default test
//		testSubject = createTestSubject();
//		Deencapsulation.invoke(testSubject, "buildElements", new Object[] { Element.class });
//	}

//	@MethodRef(name = "getAllSubTasks", signature = "(QString;)QCollection<QTask;>;")
//	@Test
//	public void getAllSubTasks() throws Exception {
//		TaskListImpl testSubject;
//		String taskId = "";
//		Collection<Task> result;
//
//		// test 1
//		testSubject = createTestSubject();
//		taskId = null;
//		result = testSubject.getAllSubTasks(taskId);
//		Assert.assertTrue(result == null);
//
//		// test 2
//		testSubject = createTestSubject();
//		taskId = "";
//		result = testSubject.getAllSubTasks(taskId);
//		Assert.assertEquals(null, result);
//	}

	@MethodRef(name = "getTopLevelTasks", signature = "()QCollection<QTask;>;")
	@Test
	public void getTopLevelTasks() throws Exception {
		TaskListImpl testSubject;
		Collection<Task> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTopLevelTasks();
	}

	@MethodRef(name = "getActiveSubTasks", signature = "(QString;QCalendarDate;)QCollection<QTask;>;")
	@Test
	public void getActiveSubTasks() throws Exception {
		TaskListImpl testSubject;
		String taskId = "";
		CalendarDate date = null;
		Collection<Task> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getActiveSubTasks(taskId, date);
	}

//	@MethodRef(name = "createTask", signature = "(QCalendarDate;QCalendarDate;QString;IJQString;QString;)QTask;")
//	@Test
//	public void createTask() throws Exception {
//		TaskListImpl testSubject;
//		CalendarDate startDate = null;
//		CalendarDate endDate = null;
//		String text = "";
//		int priority = 0;
//		long effort = (Long) null;
//		String description = "";
//		String parentTaskId = "";
//		Task result;
//
//		// test 1
//		testSubject = createTestSubject();
//		parentTaskId = null;
//		result = testSubject.createTask(startDate, endDate, text, priority, effort, description, parentTaskId);
//		Assert.assertEquals(null, result);
//
//		// test 2
//		testSubject = createTestSubject();
//		parentTaskId = "";
//		result = testSubject.createTask(startDate, endDate, text, priority, effort, description, parentTaskId);
//		Assert.assertEquals(null, result);
//	}

//	@MethodRef(name = "removeTask", signature = "(QTask;)V")
//	@Test
//	public void removeTask() throws Exception {
//		TaskListImpl testSubject;
//		Task task = null;
//
//		// default test
//		testSubject = createTestSubject();
//		testSubject.removeTask(task);
//	}

	@MethodRef(name = "hasSubTasks", signature = "(QString;)Z")
	@Test
	public void hasSubTasks() throws Exception {
		TaskListImpl testSubject;
		String id = "";
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.hasSubTasks(id);
	}

	@MethodRef(name = "getTask", signature = "(QString;)QTask;")
	@Test
	public void getTask() throws Exception {
		TaskListImpl testSubject;
		String id = "";
		Task result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTask(id);
	}

//	@MethodRef(name = "hasParentTask", signature = "(QString;)Z")
//	@Test
//	public void hasParentTask() throws Exception {
//		TaskListImpl testSubject;
//		String id = "";
//		boolean result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.hasParentTask(id);
//	}

	@MethodRef(name = "getXMLContent", signature = "()QDocument;")
	@Test
	public void getXMLContent() throws Exception {
		TaskListImpl testSubject;
		Document result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getXMLContent();
	}

//	@MethodRef(name = "calculateTotalEffortFromSubTasks", signature = "(QTask;)J")
//	@Test
//	public void calculateTotalEffortFromSubTasks() throws Exception {
//		TaskListImpl testSubject;
//		Task t = null;
//		long result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.calculateTotalEffortFromSubTasks(t);
//	}

//	@MethodRef(name = "getEarliestStartDateFromSubTasks", signature = "(QTask;)QCalendarDate;")
//	@Test
//	public void getEarliestStartDateFromSubTasks() throws Exception {
//		TaskListImpl testSubject;
//		Task t = null;
//		CalendarDate result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.getEarliestStartDateFromSubTasks(t);
//	}

//	@MethodRef(name = "getLatestEndDateFromSubTasks", signature = "(QTask;)QCalendarDate;")
//	@Test
//	public void getLatestEndDateFromSubTasks() throws Exception {
//		TaskListImpl testSubject;
//		Task t = null;
//		CalendarDate result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.getLatestEndDateFromSubTasks(t);
//	}

//	@MethodRef(name = "calculateCompletionFromSubTasks", signature = "(QTask;)[J")
//	@Test
//	public void calculateCompletionFromSubTasks() throws Exception {
//		TaskListImpl testSubject;
//		Task t = null;
//		long[] result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.calculateCompletionFromSubTasks(t);
//	}

	@MethodRef(name = "getTaskElement", signature = "(QString;)QElement;")
	@Test
	public void getTaskElement() throws Exception {
		TaskListImpl testSubject;
		String id = "";
		Element result;

		// default test
		testSubject = createTestSubject();
		result = Deencapsulation.invoke(testSubject, "getTaskElement", new Object[] { id });
	}

	@MethodRef(name = "getAllRootTasks", signature = "()QCollection<QTask;>;")
	@Test
	public void getAllRootTasks() throws Exception {
		TaskListImpl testSubject;
		Collection<Task> result;

		// default test
		testSubject = createTestSubject();
		result = Deencapsulation.invoke(testSubject, "getAllRootTasks");
	}

//	@MethodRef(name = "convertToTaskObjects", signature = "(QElements;)QCollection<QTask;>;")
//	@Test
//	public void convertToTaskObjects() throws Exception {
//		TaskListImpl testSubject;
//		Elements tasks = null;
//		Collection<Task> result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = Deencapsulation.invoke(testSubject, "convertToTaskObjects", new Object[] { Elements.class });
//	}
//
//	@MethodRef(name="filterActiveTasks", signature="(QCollection<QTask;>;QCalendarDate;)QCollection<QTask;>;")
//	@Test
//	public void filterActiveTasks() throws Exception {
//	TaskListImpl testSubject;Collection<Task> tasks = null;
//	CalendarDate date = null;
//	Collection<Task> result;
//	
//	// default test
//	testSubject=createTestSubject();result=Deencapsulation.invoke(testSubject, "filterActiveTasks", new Object[]{Collection<Task>.class, CalendarDate.class});
//	}

//	@MethodRef(name = "isActive", signature = "(QTask;QCalendarDate;)Z")
//	@Test
//	public void isActive() throws Exception {
//		TaskListImpl testSubject;
//		Task t = null;
//		CalendarDate date = null;
//		boolean result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = Deencapsulation.invoke(testSubject, "isActive", new Object[] { Task.class, CalendarDate.class });
//	}
}