package com.crux.streamAPI.basics;

import java.util.Arrays;
import java.util.List;

public class findMissing {
    public static void main(String[] args) {
        int number = 8;
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int sum = number*(number+1)/2;

        // int arr_sum = 0;
        // for(int a: arr){
        //     arr_sum+=a;
        // }
        // System.out.println((sum-arr_sum));

        List<Integer> list = Arrays.asList(1,2,3,4,6,7,8);
        int arr_sum = list.stream().reduce(0, (prev,curr)-> prev+curr);
        System.out.println((sum-arr_sum));


    }
    
}
