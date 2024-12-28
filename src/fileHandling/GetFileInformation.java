package fileHandling;

import java.io.File;

public class GetFileInformation {

    public static void main(String[] args) {
        File file = new File("Jahid.txt");

        if (file.exists()){
            System.out.println("File name: "+file.getName());
            System.out.println("File path: "+file.getAbsolutePath());
            System.out.println("File readable: "+file.canRead());
            System.out.println("File writable: "+file.canWrite());
            System.out.println("File size in bytes: "+file.length());
        }else {

            System.out.println("The file does not exists");
        }
    }
}
