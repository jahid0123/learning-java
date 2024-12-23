package problemSolving;

import java.util.Arrays;
import java.util.HashSet;

public class FindCommonElements {
    public static void main(String[] args) {



        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        // Print the original contents of array1 and array2.
        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        // Create a HashSet to store common elements.
        HashSet set = new HashSet();


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                // Check if elements in array1 and array2 are equal.
                if (array1[i].equals(array2[j])) {
                    // Add the common element to the HashSet.
                    set.add(array1[i]);
                }
            }
        }

        System.out.println("Common element : " + set);
    }


}


