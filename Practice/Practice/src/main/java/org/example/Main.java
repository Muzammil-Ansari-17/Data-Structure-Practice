package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dynamic_Array A = new Dynamic_Array(10);
        System.out.println("Inserting Array");
        A.insert(20);
        A.insert(30);
        A.insert(40);
        A.insert(50);
        A.display();

        System.out.println("Finding index");
        int find = A.indexof(30);
        System.out.println(find);

        System.out.println("remove value");
        A.remove(3);
        A.display();

        System.out.println("Update value");
        A.update(2,55);
        A.display();

    }
}