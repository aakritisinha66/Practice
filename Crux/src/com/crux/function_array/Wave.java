package com.crux.function_array;

public class Wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{11, 12, 13},{21, 22, 23},{31, 32, 33}};
		spiral(arr, 3);
	}
	public static void spiral(int[][] arr, int n) {
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				for(int j=0; j<n; j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int j=n-1; j>=0; j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		
	}

}

//11 12 13
//21 22 23
//31 32 33 
