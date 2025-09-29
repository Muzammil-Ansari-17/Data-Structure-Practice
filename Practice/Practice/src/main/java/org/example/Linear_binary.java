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

        System.out.println("Linear Search ");
        int linear = linearSearch(arr,target,size);

        System.out.println("Bubble Search ");
        int bubble = bubblesort(arr,target,size);

    }

    public static int linearSearch(int[] arr, int target, int size){
        for (int i = 0; i < size; i++) {
            if(arr[i] == target){
                System.out.println(target+" at index :"+i);
                return i;
            }
        }
        return -1;
    }

    public static int bubblesort(int[]arr, int target, int size){
        Arrays.sort(arr);
        int low = 0;
        int high = size - 1;
        while(low <= high){
            int mid = (low+high) / 2;
            if(arr[mid] == target){
                System.out.println(target+" found");
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }




}
