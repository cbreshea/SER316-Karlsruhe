package net.sf.memoranda.util;

import static org.junit.Assert.*;
import java.util.*;

import javax.annotation.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;
import net.sf.memoranda.Project;
import net.sf.memoranda.Task;
import net.sf.memoranda.TaskList;
import net.sf.memoranda.date.CalendarDate;

@Generated(value = "org.junit-tools-1.0.5")
public class AgendaGeneratorTest {

	private AgendaGenerator createTestSubject() {
		return new AgendaGenerator();
	}

//	@MethodRef(name="generateTasksInfo", signature="(QProject;QCalendarDate;QCollection<QString;>;)QString;")
//	@Test
//	public void generateTasksInfo() throws Exception {
//	Project p = null;
//	CalendarDate date = null;
//	Collection<String> expandedTasks = null;
//	String result;
//	
//	// default test
//	result=Deencapsulation.invoke(AgendaGenerator.class, "generateTasksInfo", new Object[]{Project.class, CalendarDate.class, null});
//	}





	@MethodRef(name = "getPriorityString", signature = "(I)QString;")
	@Test
	public void getPriorityString() throws Exception {
		int p = 0;
		String result;

		// default test
		result = Deencapsulation.invoke(AgendaGenerator.class, "getPriorityString", new Object[] { p });
	}



	@MethodRef(name = "generateStickers", signature = "(QCalendarDate;)QString;")
	@Test
	public void generateStickers() throws Exception {
		CalendarDate date = null;
		String result;

		// default test
		result = Deencapsulation.invoke(AgendaGenerator.class, "generateStickers", new Object[] { CalendarDate.class });
	}

	@MethodRef(name = "sortStickers", signature = "()QPriorityQueue;")
	@Test
	public void sortStickers() throws Exception {
		PriorityQueue result;

		// default test
		result = Deencapsulation.invoke(AgendaGenerator.class, "sortStickers");
	}

}