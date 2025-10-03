package org.example;

//24F-CS-154
//Muzammil Ahmed
public class Main {
    public static void main(String[] args) {

        Dynamic_Array A = new Dynamic_Array(10);
        System.out.println("Inserting Array");
        A.insert(20);
        A.insert(30);
        A.insert(40);
        A.insert(50);
        A.insert(66);
        A.insert(43);
        A.insert(31);
        A.insert(59);
        A.insert(10);
        A.insert(51);
        A.display();

        System.out.println("Finding index");
        int find = A.indexof(30);
        System.out.println(find);

        System.out.println("remove value");
        A.remove(5);
        A.remove(3);
        A.remove(0);
        A.remove(8);
        A.display();

        System.out.println("Update value");
        A.update(2,55);
        A.update(4,81);
        A.display();

    }
}