package net.sf.memoranda.util;

import java.io.InputStream;

import javax.annotation.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.memoranda.Note;
import net.sf.memoranda.NoteList;
import net.sf.memoranda.Project;
import net.sf.memoranda.ResourcesList;
import net.sf.memoranda.TaskList;
import nu.xom.Document;

@Generated(value = "org.junit-tools-1.0.5")
public class FileStorageTest {

	private FileStorage createTestSubject() {
		return new FileStorage();
	}

//	@MethodRef(name = "saveDocument", signature = "(QDocument;QString;)V")
//			FileStorage.saveDocument(doc, filePath);@Test
//	public void saveDocument() throws Exception {
//		Document doc = null;
//		String filePath = "";
//
//		// default test
//
//	}

	

//	@MethodRef(name = "openDocument", signature = "(QString;)QDocument;")
//	@Test
//	public void openDocument_1() throws Exception {
//		String filePath = "";
//		Document result;
//
//		// default test
//		result = FileStorage.openDocument(filePath);
//	}

	@MethodRef(name = "documentExists", signature = "(QString;)Z")
	@Test
	public void documentExists() throws Exception {
		String filePath = "";
		boolean result;

		// default test
		result = FileStorage.documentExists(filePath);
	}


	
	@MethodRef(name = "openProjectManager", signature = "()V")
	@Test
	public void openProjectManager() throws Exception {
		FileStorage testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.openProjectManager();
	}

	@MethodRef(name = "storeProjectManager", signature = "()V")
	@Test
	public void storeProjectManager() throws Exception {
		FileStorage testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.storeProjectManager();
	}



	@MethodRef(name = "openEventsManager", signature = "()V")
	@Test
	public void openEventsManager() throws Exception {
		FileStorage testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.openEventsManager();
	}

	@MethodRef(name = "storeEventsManager", signature = "()V")
	@Test
	public void storeEventsManager() throws Exception {
		FileStorage testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.storeEventsManager();
	}

	@MethodRef(name = "openMimeTypesList", signature = "()V")
	@Test
	public void openMimeTypesList() throws Exception {
		FileStorage testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.openMimeTypesList();
	}

	@MethodRef(name = "storeMimeTypesList", signature = "()V")
	@Test
	public void storeMimeTypesList() throws Exception {
		FileStorage testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.storeMimeTypesList();
	}



	@MethodRef(name = "restoreContext", signature = "()V")
	@Test
	public void restoreContext() throws Exception {
		FileStorage testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.restoreContext();
	}

	@MethodRef(name = "storeContext", signature = "()V")
	@Test
	public void storeContext() throws Exception {
		FileStorage testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.storeContext();
	}
}