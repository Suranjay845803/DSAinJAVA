package com.suranjay.dsa.search;

public class MaxWealth {

    public static void main(String[] args) {
        int [][] arr ={
                {1,7,8},
                {2,2,0},
                {1,3},
                {8}
        };
        int res = maxWealth(arr);
        System.out.println(" Max wealth is : " +res);

    }

    public static int maxWealth(int[][] accounts){
        int ans =Integer.MIN_VALUE;
        for(int person=0; person < accounts.length; person++){
            int sum = 0;
            for (int account =0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if( sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
