package com.java.sahil;

import java.util.Arrays;
import java.util.Scanner;

public class SumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 System.out.print("Enter the number = ");
		 int n = in.nextInt();
		 int[] A = sumZero(n);
		 System.out.println(Arrays.toString(A));
	 }
	 static int[] sumZero(int n) {
		 int[] A = new int[n];
		 for(int i = 0; i<n; i++) {
			 A[i] = i * 2 - n + 1;
		 }
		 return A;
	}

}
