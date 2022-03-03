package com.java.sahil;

public class Max_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {
				{1,5,8,9} ,
				{10, 4, 6}
		};
	//	System.out.println(arr.length);
		System.out.println(max(arr));
	}
	
	static int max(int[][] arr) {
		int maxVal = arr[0][0];
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] > maxVal) {
					maxVal = arr[row][col];
				}
			}
		}return maxVal;
	}

}
