package com.java.sahil;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3};
		int target = 6;
		int[] ans = twoSum(nums, target);
		System.out.println(Arrays.toString(ans));
	}

	static int[] twoSum (int[] nums, int target) {
		
			for(int i = 0; i < nums.length-1; i++) {
				for(int j = i+1; j<nums.length; j++) {
					if(nums[i] + nums[j] == target) {
						return new int[]{i,j};
					}
				}
			}
		return new int[] {};
	}

}
