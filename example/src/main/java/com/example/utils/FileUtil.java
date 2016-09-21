package com.example.utils;

import android.content.Context;
import android.os.Environment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;

/**
 * Created by Giuseppe Calaprice on 22/06/15.
 * (giuseppe.calaprice@sitael.com)
 * <p>
 * This is an helper class used to access the application's files
 */
public class FileUtil {


    /**
     * This method reads the log file saved in the private app's storage area
     *
     * @param context  the application context
     * @param fileName the file's name to read
     * @return a string representing the file contents
     */
    public static String readLogFile(Context context, String fileName) {
        FileInputStream fis;
        StringBuilder sb = new StringBuilder();
        try {
            fis = context.openFileInput(fileName);

            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bufferedReader = new BufferedReader(isr);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    /**
     * This method deletes the log file saved in the private file's storage area
     *
     * @param context  the application context
     * @param fileName the file's name to delete
     */
    public static void deleteFile(Context context, String fileName) {
        context.deleteFile(fileName);
    }


    /**
     * This method saved a database backup in the device storage area
     *
     * @param context the application context
     */
    public static void saveDataBaseBackUp(Context context) {
        try {
            File sd = Environment.getExternalStorageDirectory();

            if (sd.canWrite()) {
                String currentDBPath = "/data/data/" + context.getPackageName() + "/databases/sugar_example.db";
                String backupDBPath = "sugar.dbbackup.sqlite";
                File currentDB = new File(currentDBPath);
                File backupDB = new File(sd, backupDBPath);

                if (currentDB.exists()) {
                    FileChannel src = new FileInputStream(currentDB).getChannel();
                    FileChannel dst = new FileOutputStream(backupDB).getChannel();
                    dst.transferFrom(src, 0, src.size());
                    src.close();
                    dst.close();
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
