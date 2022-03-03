package com.java.sahil;

import java.util.ArrayList;

public class SmallerNumberThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {7,7,7,7};
		ArrayList<Integer> ans = new ArrayList<>();
		int count = 0;
		int n=0;
		for(int i = 0; i < nums.length; i++) {
			n = nums[i];
			for(int j = 0; j < nums.length; j++) {
				if(n > nums[j]) {
					count++;
					}
				}
			ans.add(count);
			count = 0;
			}
		System.out.println(ans);
	}

}
