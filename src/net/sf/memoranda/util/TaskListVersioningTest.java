package net.sf.memoranda.util;

import javax.annotation.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;
import nu.xom.DocType;

@Generated(value = "org.junit-tools-1.0.5")
public class TaskListVersioningTest {

	private TaskListVersioning createTestSubject() {
		return new TaskListVersioning();
	}

	@MethodRef(name = "getCurrentDocType", signature = "()QDocType;")
	@Test
	public void getCurrentDocType() throws Exception {
		DocType result;

		// default test
		result = TaskListVersioning.getCurrentDocType();
	}

	@MethodRef(name = "getCurrentVersionPublicId", signature = "()QString;")
	@Test
	public void getCurrentVersionPublicId() throws Exception {
		String result;

		// default test
		result = TaskListVersioning.getCurrentVersionPublicId();
	}

//	@MethodRef(name = "getIndexOfVersion", signature = "(QString;)I")
//	@Test
//	public void getIndexOfVersion() throws Exception {
//		String publicId = "";
//		int result;
//
//		// test 1
//		publicId = null;
//		result = TaskListVersioning.getIndexOfVersion(publicId);
//		Assert.assertEquals(0, result, 0);
//
//		// test 2
//		publicId = "";
//		result = TaskListVersioning.getIndexOfVersion(publicId);
//		Assert.assertEquals(0, result, 0);
//	}

//	@MethodRef(name = "upgrade1_1d1", signature = "([QString;)V")
//	@Test
//	public void upgrade1_1d1() throws Exception {
//		String[] projectIds = new String[] { "" };
//
//		// default test
//		Deencapsulation.invoke(TaskListVersioning.class, "upgrade1_1d1", new Object[] { projectIds });
//	}
}