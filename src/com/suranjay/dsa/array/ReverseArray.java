package com.suranjay.dsa.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {2,5,6,5,6};
        int[] arr2 = {4,5,6,7,8,9};
        int start = 0;
        // Assume array is not empty
        int end = arr2.length-1;
        while(start < end){
            swap(arr2, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr2));
    }

    // TO swap the elements
    private static void swap(int[] arr , int position1, int position2){
        int temp = arr[position2];
        arr[position2] =arr[position1];
        arr[position1] = temp;
    }
}
