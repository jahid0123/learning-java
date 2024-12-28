package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        try {
            File file = new File("Jahid.txt");
            if (file.createNewFile()){
                System.out.println("File created: "+file.getName());
            }else {
                System.out.println("File already exists.");
            }
        }catch (IOException e){
            System.out.println("An error occured");

        }

    }
}
