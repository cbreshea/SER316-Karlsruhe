package net.sf.memoranda.util;

import net.sf.memoranda.Project;
import net.sf.memoranda.ui.ExceptionDialog;

import java.io.File;
import java.io.IOException;

/**
 * Created by Andrew on 4/19/2017.
 */
public class ProjectCloudExporter {

    private static final String TEMP_DIR = System.getProperty("user.home") +
            File.separator + ".memoranda" + File.separator + ".google" + File.separator;

    public static File createZip(Project project) {
        File temp = new File(TEMP_DIR + project.getTitle() + ".zip");

        if (temp.exists()) {
            temp.delete();
        }

        try {
            temp.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // creates zip with same path as temp file + .zip
        // to get reference to new zip, use original path + .zip
        ProjectPackager.pack(project, temp);
        File zip = new File(TEMP_DIR + project.getTitle() + ".zip");

        return zip;
    }
}
