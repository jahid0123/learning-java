package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("filename.txt");
            fileWriter.write("My name is Jahid Ahmed. I'm 29 Years Old.\nMy Father's name is Haidar Ali.");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("Error occurred.");
        }
    }
}
