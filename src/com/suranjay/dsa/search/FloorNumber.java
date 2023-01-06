package com.suranjay.dsa.search;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9,10,13,14};
        int[] arr1 ={15,14,10,9,8,6,4,3};
        int res = floorNumber(arr, 3);
        System.out.println( res );
        int res1 = floorNumber(arr1, 13);
        System.out.println( res1 );
    }
    public static int floorNumber( int[] arr , int target ) {
        int start =0;
        int end = arr.length-1;
        boolean isAsc = arr[end] > arr[start] ? true: false;
        while (start <= end ){
            int mid = start + (end-start)/2;
            if(arr[mid]== target)
                return arr[mid];
            if(isAsc){
                if( target > arr[mid] ){
                    start = mid+1;
                }else
                    end = mid-1;

            }else
            {
                if(target > arr[mid]){
                    end = mid-1;
                }else
                    start = mid+1;
            }
        }
        return isAsc ? arr[(start-1)] : arr[end+1];
    }
}
