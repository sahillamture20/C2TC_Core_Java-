package com.java.sahil;

import java.util.Scanner;

public class Multi_dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =  new Scanner(System.in);
		int[][] mat = new int[3][3];
		
		for(int row = 0; row < mat.length; row++) {
			for(int col = 0; col < mat[row].length; col++) {
				mat[row][col] = in.nextInt();
			}
		}
		
		for(int row = 0; row < mat.length; row++) {
			for(int col = 0; col < mat[row].length; col++) {
				System.out.print(mat[row][col]+ " ");
			}
			System.out.println();
		}
	}

}
