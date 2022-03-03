package com.java.sahil;

import java.util.*;
public class MaximumUsingAnotherIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int n, m;
		System.out.println("Enter the size of array which contains index for another array:");
		n = in.nextInt();
		System.out.println("Enter the size of the array");
		m = in.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		for(int i=0;i<n;i++) {
			
		}
		
		int max = 0;
		for(int i=0; i<arr1.length; i++) {
			if(arr2[arr1[i]] > max) {
				max = arr2[arr1[i]];
			}
		}
		System.out.println(max);
	}

}
