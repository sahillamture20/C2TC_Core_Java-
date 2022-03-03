package com.java.sahil;

import java.util.Arrays;

public class TargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		int[] ans = new int[nums.length];
		int rmp=-1; // rmp = right most place
		
		for(int i=0;i<index.length;i++) {
			if(index[i] > rmp) {
				ans[index[i]] = nums[i];
				rmp = i;
			}
			else {
				int temp = 0;
				int ntp = nums[i]; // ntp = number to place
				for(int j = index[i]; j<= rmp + 1;j++) {
				temp = ans[j];
				ans[j] = ntp;
				ntp = temp;
			}
				rmp++;
		}
		}
		System.out.println(Arrays.toString(ans));
	}

}
