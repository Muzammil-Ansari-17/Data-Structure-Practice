package Leetcode_Problem;

import java.util.Scanner;

class Array_Input {

    int[] arr = new int[5];

    public void input(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Enter Elements of Array"+i+" :");
            arr[i] = sc.nextInt();
        }
    }
    public void display(){
        for(int x: arr ){
            System.out.println("Elements that Stored are :"+x);
        }
    }
}
