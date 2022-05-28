import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilePractice {
    // file practice
    public static void main(String[] args) {
        // tries to create file, creates file in default directory of whole project
        try {
            File myFile = new File("testfile.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File exists already.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

        // write something in file. make sure to .close()
        try {
            FileWriter myWriter = new FileWriter("testfile.txt");
            myWriter.write("This is a file created in Java");
            System.out.println("File was written in.");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }

        // read file
        try {
            File myFile = new File("testfile.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNext()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occured, file not found.");
            e.printStackTrace();
        }

        // printing info about file
        File thisFile = new File("testfile.txt");
        if (thisFile.exists()) {
            System.out.println("File name: " + thisFile.getName());
            System.out.println("Absolute Path: " + thisFile.getAbsolutePath());
            System.out.println("File size in bytes: " + thisFile.length());
        } else {
            System.out.println("File does not exist.");
        }

        // delete file

        if (thisFile.delete()) {
            System.out.println("Deleted file: " + thisFile.getName());
        } else {
            System.out.println("Failed to delete file");
        }

        // if you want to delete a folder, it has to be empty

    }
}
