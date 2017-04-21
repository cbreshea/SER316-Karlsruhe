package net.sf.memoranda.JUnit;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;
import net.sf.memoranda.History;
import net.sf.memoranda.HistoryItem;
import net.sf.memoranda.HistoryListener;
import net.sf.memoranda.Project;

@Generated(value = "org.junit-tools-1.0.5")
public class HistoryTest {

	private History createTestSubject() {
		return new History();
	}

	@MethodRef(name = "add", signature = "(QHistoryItem;)V")
	@Test
	public void add() throws Exception {
		HistoryItem item = null;

		// default test
		History.add(item);
	}

	@MethodRef(name = "rollBack", signature = "()QHistoryItem;")
	@Test
	public void rollBack() throws Exception {
		HistoryItem result;

		// default test
		result = History.rollBack();
	}

	@MethodRef(name = "rollForward", signature = "()QHistoryItem;")
	@Test
	public void rollForward() throws Exception {
		HistoryItem result;

		// default test
		result = History.rollForward();
	}

	@MethodRef(name = "canRollBack", signature = "()Z")
	@Test
	public void canRollBack() throws Exception {
		boolean result;

		// default test
		result = History.canRollBack();
	}

	@MethodRef(name = "canRollForward", signature = "()Z")
	@Test
	public void canRollForward() throws Exception {
		boolean result;

		// default test
		result = History.canRollForward();
	}

	@MethodRef(name = "addHistoryListener", signature = "(QHistoryListener;)V")
	@Test
	public void addHistoryListener() throws Exception {
		HistoryListener hl = null;

		// default test
		History.addHistoryListener(hl);
	}

	@MethodRef(name = "removeProjectHistory", signature = "(QProject;)V")
	@Test
	public void removeProjectHistory() throws Exception {
		Project prj = null;

		// default test
		History.removeProjectHistory(prj);
	}

	@MethodRef(name = "notifyListeners", signature = "(QHistoryItem;)V")
	@Test
	public void notifyListeners() throws Exception {
		HistoryItem n = null;

		// default test
		Deencapsulation.invoke(History.class, "notifyListeners", new Object[] { HistoryItem.class });
	}
}