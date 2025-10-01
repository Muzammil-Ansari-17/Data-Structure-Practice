package org.example;
import java.util.ArrayList;
import java.util.Collections;


public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(19);
        list.add(26);
        list.add(93);
        list.add(25);
        list.add(100);
        list.add(26);
        list.add(66);
        list.add(99);
        list.add(76);
        list.add(-3);
        list.add(95);
        list.add(0);
        list.add(-26);
        list.add(56);
        list.add(-6);
        list.add(-83);
        list.add(65);
        list.add(40);
        list.add(16);
        list.add(46);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        int result = Collections.binarySearch(list,19);
        System.out.println(result);




    }
}
