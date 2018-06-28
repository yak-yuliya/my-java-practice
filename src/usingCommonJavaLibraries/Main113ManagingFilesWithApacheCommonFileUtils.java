package usingCommonJavaLibraries;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main113ManagingFilesWithApacheCommonFileUtils {

    public static void main(String[] args) {

        // commons.apache.org -
        // Apache Commons is a project, that incorporates utilities for many common tasks
        //Commons IO - for file management
        File sourceFile = new File("files/loremipsum.txt");
        File targetFile = new File("files/target113.txt");

        //under Project directory create a new directory lib and copy .jar file into it
        //add this jar file to projects file path - write click on it - bottom of menu
        // Add As A Library
        //when you package an application - the jar file will go with it
        //check it in File / Project Structure / Libraries

        try {
            FileUtils.copyFile(sourceFile,targetFile);
            System.out.println("File copied :)");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // we use intention action to surround code with exception handling
    }
}
