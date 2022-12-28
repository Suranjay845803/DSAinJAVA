package com.suranjay.dsa.search;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {2,4,5},
                {9,6,9,3},
                {2,5,7,8,11}
        };
        boolean res = searchIn2DArray(arr, 11);
        //boolean res = searchIn2DArray(arr, 19);
        System.out.println(res);
    }

     public static boolean searchIn2DArray(int [][] arr , int number){
        if(arr == null)
            return false;
            for(int row =0; row < arr.length; row++){
                for( int col =0; col < arr[row].length; col++){
                    if(arr[row][col] == number){
                        return true;
                    }
                }
            }
         return false;
     }
}
