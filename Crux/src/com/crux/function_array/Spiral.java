package com.crux.function_array;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{11, 12, 13},{21, 22, 23},{31, 32, 33}};
		spiral(arr, 3);
	}
	public static void spiral(int[][] arr, int n) {
		int row_start = 0;
		int row_end = n;
		int col_start = 0;
		int col_end = n;
		while(row_start<row_end && col_start<col_end) {
			for(int i=col_start; i<col_end; i++) {
				System.out.print(arr[row_start][i]+ " ");
			}
			row_start++;
			
			for(int i=row_start; i<row_end; i++) {
				System.out.print(arr[i][col_end-1]+" ");
			}
			col_end--;
			
			for(int i=col_end-1; i>=col_start; i--) {
				System.out.print(arr[row_end-1][i]+" ");
			}
			row_end--;

			for(int i=row_end-1; i>=row_start; i--) {
				System.out.print(arr[i][col_start]+" ");
			}
			col_start++;
			
		}
		
	}

}

//11 12 13
//21 22 23
//31 32 33