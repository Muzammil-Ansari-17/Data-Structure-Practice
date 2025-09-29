package org.example;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class Linear_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array :");
        int size = sc.nextInt();

        System.out.println();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter elements of Array"+i+" :");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Enter target value :");
        int target = sc.nextInt();

        System.out.println();

        int[] sortedarr = Arrays.copyOf(arr, size);
        Arrays.sort(arr);

    }



}
