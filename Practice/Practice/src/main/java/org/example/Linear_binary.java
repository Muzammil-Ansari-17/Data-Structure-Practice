package org.example;
import java.util.Arrays;
import java.util.Scanner;

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
        linearSearch(arr,target);

        System.out.println("\nBubble Search ");
        binarysearch(arr,target);

        int n = 100000;
        int[] testarr = new int[n];
        for (int i = 0; i < n; i++) {
            testarr[i] = i;
        }
        int testtarget = n-1;
        System.out.println();

        long Lstart = System.nanoTime();
        linearSearch(testarr,testtarget);
        long Lend = System.nanoTime();
        System.out.println();

        long Bstart = System.nanoTime();
        binarysearch(testarr,testtarget);
        long Bend = System.nanoTime();
        System.out.println();


        System.out.println("\nTest Check");
        System.out.println("\nLinear Test :"+(Lend - Lstart)+" ns");
        System.out.println("\nBinary Test:"+(Bend - Bstart)+ " ns");
    }

    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println(target+" at index :"+i);
                return i;
            }
        }
        return -1;
    }

    public static int binarysearch(int[]arr, int target){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
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
