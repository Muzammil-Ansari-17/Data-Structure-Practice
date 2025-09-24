package org.example;

import java.util.Scanner;

public class ComparingArray {
    int[] arr ={1,2,3,4,5,6,7,8,9};
    int nums = 0;
    Scanner sc = new Scanner(System.in);

    public void input(){
            System.out.println("Enter your Number :");
            nums = sc.nextInt();
        }
    boolean found = false;

    public void found(){
        while(!found){
            System.out.println("number is not found");
            System.out.println("Enter a value to search :");
            nums = sc.nextInt();
        }
        for(int x:arr){
            if(x == num){
                System.out.println("number found!");
                found = true;
                break;
            }
        }
    }


}
