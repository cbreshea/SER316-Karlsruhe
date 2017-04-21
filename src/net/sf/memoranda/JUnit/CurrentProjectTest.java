package net.sf.memoranda.JUnit;

import java.util.Collection;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;
import net.sf.memoranda.CurrentProject;
import net.sf.memoranda.NoteList;
import net.sf.memoranda.Project;
import net.sf.memoranda.ProjectListener;
import net.sf.memoranda.ResourcesList;
import net.sf.memoranda.TaskList;

@Generated(value = "org.junit-tools-1.0.5")
public class CurrentProjectTest {

	private CurrentProject createTestSubject() {
		return new CurrentProject();
	}

	@MethodRef(name = "get", signature = "()QProject;")
	@Test
	public void get() throws Exception {
		Project result;

		// default test
		result = CurrentProject.get();
	}

	@MethodRef(name = "getTaskList", signature = "()QTaskList;")
	@Test
	public void getTaskList() throws Exception {
		TaskList result;

		// default test
		result = CurrentProject.getTaskList();
	}

	@MethodRef(name = "getNoteList", signature = "()QNoteList;")
	@Test
	public void getNoteList() throws Exception {
		NoteList result;

		// default test
		result = CurrentProject.getNoteList();
	}

	@MethodRef(name = "getResourcesList", signature = "()QResourcesList;")
	@Test
	public void getResourcesList() throws Exception {
		ResourcesList result;

		// default test
		result = CurrentProject.getResourcesList();
	}

//	@MethodRef(name = "set", signature = "(QProject;)V")
//	@Test
//	public void set() throws Exception {
//		Project project = null;
//
//		// default test
//		CurrentProject.set(project);
//	}

	@MethodRef(name = "addProjectListener", signature = "(QProjectListener;)V")
	@Test
	public void addProjectListener() throws Exception {
		ProjectListener pl = null;

		// default test
		CurrentProject.addProjectListener(pl);
	}

	@MethodRef(name = "getChangeListeners", signature = "()QCollection<QProjectListener;>;")
	@Test
	public void getChangeListeners() throws Exception {
		Collection<ProjectListener> result;

		// default test
		result = CurrentProject.getChangeListeners();
	}

	@MethodRef(name = "notifyListenersBefore", signature = "(QProject;QNoteList;QTaskList;QResourcesList;)V")
	@Test
	public void notifyListenersBefore() throws Exception {
		Project project = null;
		NoteList nl = null;
		TaskList tl = null;
		ResourcesList rl = null;

		// default test
		Deencapsulation.invoke(CurrentProject.class, "notifyListenersBefore",
				new Object[] { Project.class, NoteList.class, TaskList.class, ResourcesList.class });
	}

//	@MethodRef(name = "notifyListenersAfter", signature = "()V")
//	@Test
//	public void notifyListenersAfter() throws Exception {
//
//		// default test
//		Deencapsulation.invoke(CurrentProject.class, "notifyListenersAfter");
//	}

//	@MethodRef(name = "save", signature = "()V")
//	@Test
//	public void save() throws Exception {
//
//		// default test
//		CurrentProject.save();
//	}

	@MethodRef(name = "free", signature = "()V")
	@Test
	public void free() throws Exception {

		// default test
		CurrentProject.free();
	}
}