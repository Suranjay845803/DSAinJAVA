package com.suranjay.dsa.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,5,6,8,9,11};
        int res = binarySearch(arr, 6);
        System.out.println( res );

        int[] arr1 = {223,89,56,34,6};
        int res1 = binarySearchDesending(arr1, 6);
        System.out.println( res1 );
    }

    // for sorted order in assending order
    private static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + (end-start)/2);
            int midEl = arr[mid];
            if(target == midEl)
                return mid;

            if( target > arr[mid]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    private static int binarySearchDesending(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + (end-start)/2);
            int midEl = arr[mid];
            if(target == midEl)
                return mid;
            if( target > arr[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
