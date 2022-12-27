package com.suranjay.dsa.search;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {3,4,6,78,2};
        int res = linearSearch(arr, 78);
        System.out.println(res);
    }

    // Time complexity = best case O(1) , worst case O(n)
    public static int linearSearch(int[] arr, int number){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
}
