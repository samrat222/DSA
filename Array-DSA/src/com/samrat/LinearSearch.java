package com.samrat;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 1, 3, 6, 8};
        int target = 7;
        System.out.println(LS(arr.length, target, arr));
    }
    static int LS(int n, int target, int[] arr){
        for(int i = 0; i<n;i++){
            if(arr[i] == target){
                    return i;
            }
        }
        return -1;
    }
}
