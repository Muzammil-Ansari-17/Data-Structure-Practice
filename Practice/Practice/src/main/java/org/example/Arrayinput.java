package org.example;

import java.util.Scanner;

class Arrayinput {

    private int[] myarr;
    private int count = 0;

    public Arrayinput(){
        myarr = new int[5];
    }

    public void insert(int item){

        if(count == myarr.length ){
            int[] temp= new int[count*2];
            for (int i = 0; i < count; i++) {
                temp[i] = myarr[i];
            }
            myarr = temp;
        }
        myarr[count++] = item;

    }


    public void display(){
        for (int i = 0; i < count; i++) {
            System.out.println(myarr[i]);
        }
    }



}

