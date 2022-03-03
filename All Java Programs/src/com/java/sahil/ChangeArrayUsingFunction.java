package com.java.sahil;

import java.util.Arrays;

public class ChangeArrayUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1, 25, 35, 65};
		System.out.println(Arrays.toString(num));
		
		change(num);
		
		System.out.println(Arrays.toString(num));
		
	}
	
	static void  change(int[] arr) {
		arr[0] = 100;
	}
}


