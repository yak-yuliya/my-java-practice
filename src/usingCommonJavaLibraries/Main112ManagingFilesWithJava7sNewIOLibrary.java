package usingCommonJavaLibraries;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main112ManagingFilesWithJava7sNewIOLibrary {


    //public static void main(String[] args) throws IOException {
    // throws IOException - means it will crash the application, but also display an error on command line
    // if we want to control the process we use try catch

    public static void main(String[] args) {
        //in java 7 new io library was introduced that simplified a lot of common operations
        //used for java 7 and later and not implemented for android
        //we will copy simple file again here

        //lets create 2 instances of class named Path
        //to get the reference to the file, i will use another reference named Paths
        //all of the methods of this class are static
        //the get method takes series of strings

        Path sourceFile = Paths.get("files", "loremipsum.txt");
        Path targetFile = Paths.get("files", "target112.txt");

        //Files has a series of static methods that can be used for common operations
        //StandartCopeOption class is used for copy option
        //and the constant of that class named REPLACE_EXISTING - IF FILE ALREADY EXISTS, I WANT TO DELETE IT AND CREATE A NEW VERSION

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //intellij intention action!!!!!!

        //simple library

    }
}
