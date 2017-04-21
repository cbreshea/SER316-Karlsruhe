package net.sf.memoranda.util;

import java.awt.event.ActionListener;
import java.util.Collection;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;

@Generated(value = "org.junit-tools-1.0.5")
public class CurrentStorageTest {

	private CurrentStorage createTestSubject() {
		return new CurrentStorage();
	}

	@MethodRef(name = "get", signature = "()QStorage;")
	@Test
	public void get() throws Exception {
		Storage result;

		// default test
		result = CurrentStorage.get();
	}

//	@MethodRef(name = "set", signature = "(QStorage;)V")
//	@Test
//	public void set() throws Exception {
//		Storage storage = null;
//
//		// default test
//		CurrentStorage.set(storage);
//	}

	@MethodRef(name = "addChangeListener", signature = "(QActionListener;)V")
	@Test
	public void addChangeListener() throws Exception {
		ActionListener al = null;

		// default test
		CurrentStorage.addChangeListener(al);
	}

	@MethodRef(name = "getChangeListeners", signature = "()QCollection<QActionListener;>;")
	@Test
	public void getChangeListeners() throws Exception {
		Collection<ActionListener> result;

		// default test
		result = CurrentStorage.getChangeListeners();
	}

//	@MethodRef(name = "storageChanged", signature = "()V")
//	@Test
//	public void storageChanged() throws Exception {
//
//		// default test
//		Deencapsulation.invoke(CurrentStorage.class, "storageChanged");
//	}
}