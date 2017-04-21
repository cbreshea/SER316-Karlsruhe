package net.sf.memoranda.ui.table;

import javax.annotation.Generated;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.0.5")
public class TableSorterTest {

	private TableSorter createTestSubject() {
		return new TableSorter();
	}



	@MethodRef(name = "compare", signature = "(II)I")
	@Test
	public void compare() throws Exception {
		TableSorter testSubject;
		int row1 = 0;
		int row2 = 0;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.compare(row1, row2);
	}




	@MethodRef(name = "n2sort", signature = "()V")
	@Test
	public void n2sort() throws Exception {
		TableSorter testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.n2sort();
	}

	@MethodRef(name = "shuttlesort", signature = "([I[III)V")
	@Test
	public void shuttlesort() throws Exception {
		TableSorter testSubject;
		int[] from = new int[] { 0 };
		int[] to = new int[] { 0 };
		int low = 0;
		int high = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.shuttlesort(from, to, low, high);
	}






	@MethodRef(name = "getSortedBy", signature = "()I")
	@Test
	public void getSortedBy() throws Exception {
		TableSorter testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getSortedBy();
	}

	@MethodRef(name = "isAscending", signature = "()Z")
	@Test
	public void isAscending() throws Exception {
		TableSorter testSubject;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isAscending();
	}

}