package net.sf.memoranda.ui.treetable;

import javax.annotation.Generated;
import javax.swing.JTree;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.0.5")
public class JTreeTableTest {

	private JTreeTable createTestSubject() {
		return new JTreeTable();
	}

	@MethodRef(name = "updateUI", signature = "()V")
	@Test
	public void updateUI() throws Exception {
		JTreeTable testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.updateUI();
	}

	@MethodRef(name = "getEditingRow", signature = "()I")
	@Test
	public void getEditingRow() throws Exception {
		JTreeTable testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getEditingRow();
	}

//	@MethodRef(name = "setRowHeight", signature = "(I)V")
//	@Test
//	public void setRowHeight() throws Exception {
//		JTreeTable testSubject;
//		int rowHeight = 0;
//
//		// default test
//		testSubject = createTestSubject();
//		testSubject.setRowHeight(rowHeight);
//	}

	@MethodRef(name = "getTree", signature = "()QJTree;")
	@Test
	public void getTree() throws Exception {
		JTreeTable testSubject;
		JTree result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTree();
	}
}