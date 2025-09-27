package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(25);
        list.add(100);
        System.out.println(list);

        int element = list.get(2);
        System.out.println(element);

        list.addFirst(10);
        list.add(4,-1);
        System.out.println(list);

        list.set(0,99);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for (Integer integer : list) {
            System.out.println(integer);
        }


        Collections.sort(list);
        System.out.println(list);

    }

}
