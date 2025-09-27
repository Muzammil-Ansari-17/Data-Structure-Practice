package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(100);
        System.out.println(list);

        int element = list.get(2);
        System.out.println(element);

        list.add(0,10);
        System.out.println(list);

        list.set(0,99);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        Collections.sort(list);
        System.out.println(list);

    }

}
