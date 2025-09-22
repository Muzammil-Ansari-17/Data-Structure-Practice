package org.example;

public class Lab_1Task_2 {
    int[] A = {25,14,12,74,58,74,98,84,15,24};
    int[] B = {87,11,10,81,67,94,74,82,15,87};
    double[] C = new double[A.length];

    public void calculate(){

        for (int i = 0; i < A.length; i++) {
            int max = Math.max(A[i],B[i]);
            int min = Math.min(A[i],B[i]);
            C[i] = max + (min / 100.0 );
        }
    }
    public void display(){
        for (double x: C){
            System.out.println(x);
        }
    }
}


