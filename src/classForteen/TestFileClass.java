package classForteen;

import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {

        java.io.File file = new java.io.File("C:\\Users\\Java Student PC-14\\Downloads\\Hemel");
        //java.io.File file = new java.io.File("C:\\Users\\Java Student PC-14\\Downloads\\My dog.jpg");
       /* System.out.println("Does it exist? "+ file.exists());
        System.out.println("The file has "+ file.length()+" bytes");
        System.out.println("Can it be read? "+ file.canRead());
        System.out.println("Can it be written? "+ file.canWrite());
        System.out.println("Is it a directory? "+ file.isDirectory());
        System.out.println("Is it a file? "+ file.isFile());
        System.out.println("Is it absolute? "+ file.isAbsolute());
        System.out.println("Is it hidden? "+ file.isHidden());
        System.out.println("Absolute path is "+ file.getAbsolutePath());
        System.out.println("Last modified on "+ new java.util.Date(file.lastModified()));
*/
       boolean mk= file.mkdir();

        if (mk){
            System.out.println("folder create");
        }else {
            System.out.println("not create");
        }

    }
}
