package classForteen;

import java.io.File;

public class NewFileCreation {
    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\Java Student PC-14\\Downloads\\Jahid";

        File directory = new File(directoryPath);

        if (!directory.exists()){
            boolean created = directory.mkdirs();
            if (created){
                System.out.println("Directory created successfully: "+ directory.getAbsolutePath());
            }else {
                System.out.println("Failed to create the directory.");
            }
        }else {
            System.out.println("Directory already exists: "+ directory.getAbsolutePath());
        }
    }
}
