package com.suranjay.dsa.search;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {3,4,6,78,2};
        int arr1[] = {};
        int res = linearSearch(arr, 78);
        System.out.println(res);
        boolean search = linearSearch("Suranjay", "N");
        System.out.println(search);
    }

    // Time complexity = best case O(1) , worst case O(n)
    public static int linearSearch(int[] arr, int number){
        if(arr.length ==0)
           return -1;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                return arr[i];
            }
        }
        return -1;
    }

    public static boolean linearSearch(String str, String searchChar){
        if(str.length()==0)
            return  false;
        if (str.indexOf(searchChar)> -1)
            return  true;
        return  false;

    }
}
