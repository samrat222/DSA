package com.samrat;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
            int arr[] = {1, 2, 0, 5, 0, 0, 6, 8, 0};
        System.out.println(Arrays.toString(moveZeros(arr.length, arr)));
    }


     static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }
}
