package net.sf.memoranda.util;

import java.io.File;
import java.util.zip.ZipOutputStream;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import net.sf.memoranda.Project;
import net.sf.memoranda.ProjectManager;

@Generated(value = "org.junit-tools-1.0.5")
public class ProjectPackagerTest {

	private ProjectPackager createTestSubject() {
		return new ProjectPackager();
	}

	@MethodRef(name = "pack", signature = "(QProject;QFile;)V")
	@Test
	public void pack() throws Exception {
		Project prj = ProjectManager.getAllProjects().firstElement();
		File zipfile = new File("");

		// default test
		ProjectPackager.pack(prj, zipfile);
	}
//
//	@MethodRef(name = "unpack", signature = "(QFile;)V")
//	@Test
//	public void unpack() throws Exception {
//		File zipfile = new File("");
//
//		// default test
//		ProjectPackager.unpack(zipfile);
//	}

//	@MethodRef(name = "PackDirectory", signature = "(QString;QFile;QZipOutputStream;)V")
//	@Test
//	public void PackDirectory() throws Exception {
//		String startingDirectory = "";
//		File theDirectory = null;
//		ZipOutputStream theZIPStream = null;
//
//		// default test
//		ProjectPackager.PackDirectory(startingDirectory, theDirectory, theZIPStream);
//	}
}