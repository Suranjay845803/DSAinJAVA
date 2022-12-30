package com.suranjay.dsa.search;

public class NoOfDigit {

    public static void main(String[] args) {
        int[] arr = {123,56,7890,222,4456,8};
        int resEven = evenNoOfDigit(arr);
        System.out.println("Total number which having even digit :" + resEven);

    }

    public static int evenNoOfDigit(int[] arr){
        int count = 0;
        for(int i =0; i < arr.length; i++){
            int num = arr[i];
            int countDigit = countDigit(num);
            if(countDigit%2 == 0)
                count++;
        }
        return count;
    }

    public static int countDigit(int num){
        int countDig = 0;
        while (num > 0){
            countDig++;
            num = num/10;
        }
        return  countDig;
    }
}

