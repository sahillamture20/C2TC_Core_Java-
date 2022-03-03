package com.java.sahil;

import java.util.Scanner;

public class Addition_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
			// Simple arr declaration and initialization
			 int[] arr = new int[3];
		//	 arr[0] = 2;
		//	arr[1] = 8;
		//	arr[2] = 7;
		//	System.out.println(arr[0]);
			
		// array of primitive data type
		//	Input using for loop
			for (int i=0;i<3;i++) {
				arr[i] = in.nextInt();
			}
			
		//	3 ways to get Output 
			
		// 1=> Using for loop
			int total = 0;
			for (int i=0;i<arr.length;i++) {
				total += arr[i];
			}
			System.out.println(total);
	}

}
