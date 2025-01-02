package classTest.classTwentyTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Hemel");
        list.add("Iqram");
        list.add("Asik");
        list.add("Nahid");
        list.add("Faysal");

        System.out.println("Original LinkedList: "+ list);

        Collections.reverse(list);
        System.out.println("Reverse LinkedList: "+list);


        Iterator<String> reverseOrder = list.descendingIterator();

        System.out.print("Reverse LinkedList: ");
        while (reverseOrder.hasNext()){
            System.out.print(reverseOrder.next()+" ");
        }


    }
}
