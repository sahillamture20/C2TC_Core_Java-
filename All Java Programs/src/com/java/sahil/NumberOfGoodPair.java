package com.java.sahil;

import java.util.Scanner;

public class NumberOfGoodPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
