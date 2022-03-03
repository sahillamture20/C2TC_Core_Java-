package com.java.sahil;

import java.util.Arrays;

public class Swap_Array_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 5, 6, 48};
		System.out.println(Arrays.toString(arr));
		swap(arr, 0, 2);
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
