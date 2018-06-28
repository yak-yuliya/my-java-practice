package usingCommonJavaLibraries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main111ManagingFilesWithOriginalFileClass {

    public static void main(String[] args) {

        //common stuff what all developers need to do, including reading and writting files
        //and comminucationg over the internet

        // we will make a copy of txt file
        //string, pointing to existing file
        //string pointing to name and location file
        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/target.txt";

        //3 classes from java class library, we declare these objects
        //if we declare objects withing Try block, they implement method named Closed
        //or to be more correct, they implement interface named Autoclosable
        //all of this objects need to be closed before you finished what you are up to
        //by instanciating them here, i will allow java runtime environment to close them for me
        try (
                // new FileReader... instantiate it, but calling the constructor method, passing the name of the file
                FileReader fReader = new FileReader(sourceFile);
                //BufferedReader class has one method readLine, this will read file one line at a time
                //and we pass our lifeReader object to it
                BufferedReader bReader = new BufferedReader(fReader);
                //this class will be used to create a target file
                FileWriter writer = new FileWriter(targetFile);
        ) {

            //here we can do the work of reading and writting a file
            //while and true means i create an infinite loop
            //and i need to explicitly break out the infinite loop whenever i want to
            while (true) {
                //read one line, using the buffered reader,
                // i create a string, i name it line and i get its value with bReader
                String line = bReader.readLine();
                //if readLine successfully finds text, it will return that value as a string
                //otherwise it will return null
                //lets write a code to find out, whether i have got a srting i can work with
                //if line matches the value of null, i will break a while loop
                if (line == null) {
                    break;
                } else {
                    //i take a string that i read and i write it to target file
                    // and then we pass end of line
                    writer.write(line + "\n");
                }
            }
            System.out.println("File copied!");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
