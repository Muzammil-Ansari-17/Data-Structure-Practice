package org.example;


import java.util.Scanner;

public class TwodArrray {

    Scanner sc = new Scanner(System.in);
    int row;
    int coloum;

    public void input(){

        System.out.println("Enter Rows :");
        row = sc.nextInt();
        System.out.println("Enter Coloums :");
        coloum = sc.nextInt();
        int[][] arr = new int[row][coloum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                System.out.print("Enter Element of Array"+i+" "+j+" :");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                System.out.println(arr[i][j]);
            }
        }
        System.out.println();
    }
}
