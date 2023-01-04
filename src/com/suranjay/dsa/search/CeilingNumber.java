package com.suranjay.dsa.search;
// number equal or just grt than given number is called ceiling number
public class CeilingNumber {

    public static void main(String[] args) {
        int arr[] ={1,2,3,5,6,7,8,9,10,11,13,15,16};
        int arr1[] ={16,14,11,10,9,8,7,6,5,4,3,2,1};
        int arr2[] ={18,16,14,11,10,9,8,7,6,5,3,2,1};
        int res = ceilingNumber(arr1, 13);
        System.out.println( res );
    }

    private static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int num = 0;
        boolean isAss = arr[end] > arr[0] ? true : false;
        while (start <= end ){
            int mid = (start + (end-start)/2);
            if (target == arr[mid])
                num = arr[mid];
            if(isAss){
                if(target > arr[mid]){
                    start = mid+1;
                    if( arr[start] > target)
                        return arr[start];
                }else{
                    end = mid -1;
                    if( arr[start] > target)
                        return arr[start];
                }
            }else{
                if( target > arr[mid] ){
                    end = mid-1;
                    if( arr[end] > target)
                        return arr[end];
                }else{
                  start = mid +1;
                    if( arr[end] > target)
                        return arr[end];
                }
            }
        }
        return num;
    }
}
