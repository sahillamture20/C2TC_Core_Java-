package com.java.sahil;

public class Even_Number_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {555,901,482,1771};
		int count = 0, n=0;
		for(int i=0;i<nums.length;i++) {
			while(nums[i] != 0) {
				nums[i] /= 10;
				++count;	
			};
			if(count%2==0) {
				++n;
			}
			count = 0;
		}
		System.out.println(n);
	}
}
/*int count = 0;
  for(int i=0;i<nums.length;i++) {
  		String n = String.valueOf(nums[i]);
  		if(n.length() % 2 == 0){
  		++count;
  		}
	}
	System.out.println(count);
	*/

