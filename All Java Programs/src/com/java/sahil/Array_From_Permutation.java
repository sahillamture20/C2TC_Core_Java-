package com.java.sahil;

import java.util.Arrays;
import java.util.Scanner;

public class Array_From_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int[] nums = new int[6];
		int[] ans = new int[6];
		
		
		for(int j = 0; j < nums.length; j++) {
			nums[j] = in.nextInt();
		}

		System.out.println("Input = "+Arrays.toString(nums));
		for(int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]]; 
		}
		
		System.out.println("ans = "+Arrays.toString(ans));
	}

}
