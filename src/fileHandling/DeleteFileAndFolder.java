package fileHandling;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class DeleteFileAndFolder {
    public static void main(String[] args) {



        /*try {
            File file = new File("filename.text");
            if (file.createNewFile()){
                System.out.println("File is create: "+file.getName());
            }else {
                System.out.println("File already exists.");
            }
        }catch (IOException e){
            System.out.println("An error Occurred.");
        }*/

        File file = new File("filename.txt");
        if (file.delete()){
            System.out.println("Deleted the file: "+file.getName());
        }else {
            System.out.println("Failed to delete the file.");
        }
    }
}
