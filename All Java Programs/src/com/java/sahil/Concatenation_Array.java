package com.java.sahil;

import java.util.Arrays;

public class Concatenation_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(nums ));
	    int[] ans = new int[nums.length*2];
	    int j = nums.length;
		for(int i = 0; i<j; i++) {
			ans[i] = ans[i+j] = nums[i];
		}
		System.out.println(Arrays.toString(ans));
	}

}
