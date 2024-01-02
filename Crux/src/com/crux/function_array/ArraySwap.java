package com.crux.function_array;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = {40, 50, 60};
		System.out.println("Before: "+arr1[0] + " & " + arr2[0]);
		swap(arr1, arr2);
		System.out.println("After: "+arr1[0] + " & " + arr2[0]);

	}
	
	public static void swap(int[] arr1, int[] arr2) {
//		It's only swapping the local references, and it does not affect the original arrays. 
//		int[] temp = arr1;
//		arr1 = arr2;
//		arr2= temp;
		
//		In Java, when you pass an array to a method, you are actually passing the reference to the array, not a copy of the array. 
		int temp = arr1[0];
        arr1[0] = arr2[0];
        arr2[0] = temp;

	}

}
