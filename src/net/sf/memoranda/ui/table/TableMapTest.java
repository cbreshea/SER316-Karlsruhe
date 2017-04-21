package net.sf.memoranda.ui.table;

import javax.annotation.Generated;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.0.5")
public class TableMapTest {

	private TableMap createTestSubject() {
		return new TableMap();
	}

	@MethodRef(name = "getModel", signature = "()QTableModel;")
	@Test
	public void getModel() throws Exception {
		TableMap testSubject;
		TableModel result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getModel();
	}

//	@MethodRef(name = "setModel", signature = "(QTableModel;)V")
//	@Test
//	public void setModel() throws Exception {
//		TableMap testSubject;
//		TableModel model = null;
//
//		// default test
//		testSubject = createTestSubject();
//		testSubject.setModel(model);
//	}

//	@MethodRef(name = "getValueAt", signature = "(II)QObject;")
//	@Test
//	public void getValueAt() throws Exception {
//		TableMap testSubject;
//		int aRow = 0;
//		int aColumn = 0;
//		Object result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.getValueAt(aRow, aColumn);
//	}

//	@MethodRef(name = "setValueAt", signature = "(QObject;II)V")
//	@Test
//	public void setValueAt() throws Exception {
//		TableMap testSubject;
//		Object aValue = null;
//		int aRow = 0;
//		int aColumn = 0;
//
//		// default test
//		testSubject = createTestSubject();
//		testSubject.setValueAt(aValue, aRow, aColumn);
//	}

	@MethodRef(name = "getRowCount", signature = "()I")
	@Test
	public void getRowCount() throws Exception {
		TableMap testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getRowCount();
	}

	@MethodRef(name = "getColumnCount", signature = "()I")
	@Test
	public void getColumnCount() throws Exception {
		TableMap testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getColumnCount();
	}

//	@MethodRef(name = "getColumnName", signature = "(I)QString;")
//	@Test
//	public void getColumnName() throws Exception {
//		TableMap testSubject;
//		int aColumn = 0;
//		String result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.getColumnName(aColumn);
//	}

//	@MethodRef(name = "getColumnClass", signature = "(I)QClass<*>;")
//	@Test
//	public void getColumnClass() throws Exception {
//		TableMap testSubject;
//		int aColumn = 0;
//		Class<?> result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.getColumnClass(aColumn);
//	}

//	@MethodRef(name = "isCellEditable", signature = "(II)Z")
//	@Test
//	public void isCellEditable() throws Exception {
//		TableMap testSubject;
//		int row = 0;
//		int column = 0;
//		boolean result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = Assert.assert(testSubject.isCellEditable(row, column));
//	}

	@MethodRef(name = "tableChanged", signature = "(QTableModelEvent;)V")
	@Test
	public void tableChanged() throws Exception {
		TableMap testSubject;
		TableModelEvent e = null;

		// default test
		testSubject = createTestSubject();
		testSubject.tableChanged(e);
	}
}