package org.example;

public class Array_Search_By_Index extends Array_Size_by_User{
    int num;
    public void search_num(){
        System.out.println("enter num to search :");
        num = sc.nextInt();
    }


    public void search(){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println("Number is found in "+i+" index.");
            }else {
                System.out.println("Not Found!");
            }
        }
    }
}
