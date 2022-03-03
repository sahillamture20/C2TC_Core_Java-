package com.java.sahil;

import java.util.Arrays;

public class Transpose_of_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				 {1,2,3},
				 {4,5,6}
		};
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] t = new int[n][m];
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				t[j][i] = matrix[i][j];
			}
		}
		System.out.println(Arrays.deepToString(t));
	}

}
