package net.sf.memoranda.backup;

import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.http.FileContent;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Andrew on 4/20/2017.
 */
public class GoogleDriveUploadTask implements Runnable {

    java.io.File file;
    Drive drive;

    public GoogleDriveUploadTask(Drive drive, java.io.File file) {
        this.file = file;
        this.drive = drive;
    }

    private GoogleDriveUploadTask() {

    }

    public void run() {
        com.google.api.services.drive.model.File fileMetadata = new com.google.api.services.drive.model.File();
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        fileMetadata.setTitle(file.getName().replaceAll(".zip", "") + "_" + timeStamp + ".zip");

        FileContent mediaContent = new FileContent(null, file);

        try {
            Drive.Files.Insert insert = drive.files().insert(fileMetadata, mediaContent);
            MediaHttpUploader uploader = insert.getMediaHttpUploader();
            uploader.setDirectUploadEnabled(true);
            // todo file listener perhaps????
            insert.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
