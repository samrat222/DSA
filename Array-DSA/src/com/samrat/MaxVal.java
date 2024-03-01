package com.samrat;

public class MaxVal {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 1};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
