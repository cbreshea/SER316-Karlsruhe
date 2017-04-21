package net.sf.memoranda.JUnit;

import java.util.Vector;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.memoranda.Project;
import net.sf.memoranda.ProjectManager;
import net.sf.memoranda.date.CalendarDate;

@Generated(value = "org.junit-tools-1.0.5")
public class ProjectManagerTest {

	private ProjectManager createTestSubject() {
		return new ProjectManager();
	}

	@MethodRef(name = "init", signature = "()V")
	@Test
	public void init() throws Exception {

		// default test
		ProjectManager.init();
	}

	@MethodRef(name = "getProject", signature = "(QString;)QProject;")
	@Test
	public void getProject() throws Exception {
		String id = "";
		Project result;

		// default test
		result = ProjectManager.getProject(id);
	}

	@MethodRef(name = "getAllProjects", signature = "()QVector<QProject;>;")
	@Test
	public void getAllProjects() throws Exception {
		Vector<Project> result;

		// default test
		result = ProjectManager.getAllProjects();
	}

	@MethodRef(name = "getAllProjectsNumber", signature = "()I")
	@Test
	public void getAllProjectsNumber() throws Exception {
		int result;

		// default test
		result = ProjectManager.getAllProjectsNumber();
	}

	@MethodRef(name = "getActiveProjects", signature = "()QVector<QProject;>;")
	@Test
	public void getActiveProjects() throws Exception {
		Vector<Project> result;

		// default test
		result = ProjectManager.getActiveProjects();
	}

	@MethodRef(name = "getActiveProjectsNumber", signature = "()I")
	@Test
	public void getActiveProjectsNumber() throws Exception {
		int result;

		// default test
		result = ProjectManager.getActiveProjectsNumber();
	}

	@MethodRef(name = "createProject", signature = "(QString;QString;QCalendarDate;QCalendarDate;)QProject;")
	@Test
	public void createProject() throws Exception {
		String id = "";
		String title = "";
		CalendarDate startDate = null;
		CalendarDate endDate = null;
		Project result;

		// default test
		result = ProjectManager.createProject(id, title, startDate, endDate);
	}

	@MethodRef(name = "createProject", signature = "(QString;QCalendarDate;QCalendarDate;)QProject;")
	@Test
	public void createProject_1() throws Exception {
		String title = "";
		CalendarDate startDate = null;
		CalendarDate endDate = null;
		Project result;

		// default test
		result = ProjectManager.createProject(title, startDate, endDate);
	}

	@MethodRef(name = "removeProject", signature = "(QString;)V")
	@Test
	public void removeProject() throws Exception {
		String id = "";

		// default test
		ProjectManager.removeProject(id);
	}
}