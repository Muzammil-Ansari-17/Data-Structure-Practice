package org.example;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int target = 7;

        public int[] solution(arr , target){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length ; j++) {
                    if(arr[i] + arr[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
            return int[]{};
        }


    }
}
