package net.sf.memoranda;

import java.util.Vector;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import nu.xom.Document;
import nu.xom.Element;

@Generated(value = "org.junit-tools-1.0.5")
public class ResourcesListImplTest {

	private ResourcesListImpl createTestSubject() {
		return new ResourcesListImpl(new Document(new Element("test")));
	}

	@MethodRef(name = "getAllResources", signature = "()QVector<QResource;>;")
	@Test
	public void getAllResources() throws Exception {
		ResourcesListImpl testSubject;
		Vector<Resource> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAllResources();
	}

	@MethodRef(name = "getResource", signature = "(QString;)QResource;")
	@Test
	public void getResource() throws Exception {
		ResourcesListImpl testSubject;
		String path = "";
		Resource result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getResource(path);
	}

	@MethodRef(name = "addResource", signature = "(QString;ZZ)V")
	@Test
	public void addResource() throws Exception {
		ResourcesListImpl testSubject;
		String path = "";
		boolean isInternetShortcut = false;
		boolean isProjectFile = false;

		// default test
		testSubject = createTestSubject();
		testSubject.addResource(path, isInternetShortcut, isProjectFile);
	}

	@MethodRef(name = "addResource", signature = "(QString;)V")
	@Test
	public void addResource_1() throws Exception {
		ResourcesListImpl testSubject;
		String path = "";

		// default test
		testSubject = createTestSubject();
		testSubject.addResource(path);
	}

	@MethodRef(name = "removeResource", signature = "(QString;)V")
	@Test
	public void removeResource() throws Exception {
		ResourcesListImpl testSubject;
		String path = "";

		// default test
		testSubject = createTestSubject();
		testSubject.removeResource(path);
	}

	@MethodRef(name = "getAllResourcesCount", signature = "()I")
	@Test
	public void getAllResourcesCount() throws Exception {
		ResourcesListImpl testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAllResourcesCount();
	}

	@MethodRef(name = "getXMLContent", signature = "()QDocument;")
	@Test
	public void getXMLContent() throws Exception {
		ResourcesListImpl testSubject;
		Document result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getXMLContent();
	}
}