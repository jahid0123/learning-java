package regularPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {

        int[] myArray1 = {1, 2, 3, 4, 5, 6};
        int length1 = myArray1.length;
        System.out.println(length1);


        ArrayList<String> myArrayList = new ArrayList<>();

        myArrayList.add("Jahid Ahmed");
        System.out.println(myArrayList);
        myArrayList.add(1, "Mahim Ahmed");
        System.out.println(myArrayList);
        myArrayList.addFirst("Pranto");
        System.out.println(myArrayList);
        myArrayList.addLast("Tamim Ahmed");
        System.out.println(myArrayList);

        myArrayList.removeLast();
        System.out.println(myArrayList);
        myArrayList.removeFirst();
        System.out.println(myArrayList);
        System.out.println(myArrayList.lastIndexOf("Tamim"));
        myArrayList.clear();
        System.out.println(myArrayList);

        ArrayList<String> arrayList1 =  new ArrayList<>();
        arrayList1.add("Jahid");
        arrayList1.add("Mahim");
        arrayList1.add("Pranto");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Nasrin");
        arrayList2.add("Tamim");
        arrayList2.add("Tanisha");

        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);

        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        Arrays.sort(ages);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int age : ages){
            arrayList.add(age);
        }
        System.out.println("The highest value is: "+ Collections.max(arrayList));
        System.out.println("The lowest value is: "+ Collections.min(arrayList));
        int sum = 0;
        for (int i : ages){
            System.out.println(i);
            sum+=i;
        }
        System.out.println(sum);
        System.out.println(ages.length);
        double avg = (double) sum /ages.length;
        System.out.println("The average value of ages is: "+avg);

    }
}
