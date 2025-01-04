package classTest.classTwentyTwo;

import java.util.ArrayList;
import java.util.Collections;

public class FindMinMax {
    public static void main(String[] args) {

        int[] arrayList = {50, 30, 52, 64, 95, 44, 23};

        int max = 0;
        int min = arrayList[0];
        for (int i = 0; i<arrayList.length; i++){

            if (arrayList[i]>max){
                max=arrayList[i];
            }

            if (arrayList[i]<min){
                min=arrayList[i];
            }
        }

        System.out.println(min);
        System.out.println(max);

        ArrayList<Integer> list =  new ArrayList<>();

        list.add(2);
        list.add(50);
        list.add(30);
        list.add(11);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("List of element: "+list);

        System.out.println("Minimum number of list: "+Collections.min(list));
        System.out.println("Maximum number of list: "+Collections.max(list));
    }
}
