package com.crux.function_array;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0;j<col; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        display(arr);
        
    }
    public static void display(int[][]arr){
        for(int row=0;row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }
    
}
