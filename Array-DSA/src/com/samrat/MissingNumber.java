package com.samrat;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        int answer = missingNumber(arr, arr.length);
        System.out.println(answer);
    }
      static int missingNumber(int []a, int N) {
        // Write your code here.
        for(int i =0; i< N; i++) {

            if (a[i] + 1 != a[i + 1]) {
                return a[i] + 1;
            }
        }
        return -1;
    }
}
