package com.java.sahil;

import java.util.Arrays;

public class Running_sum_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 1, 1, 1, 1};
		for(int i = 1; i < nums.length; i++) {
				nums[i] += nums[i-1];
			}
		System.out.println(Arrays.toString(nums));
	}

}
/*class Solution {
public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}*/
