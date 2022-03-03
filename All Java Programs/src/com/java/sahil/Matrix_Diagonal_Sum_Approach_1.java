package com.java.sahil;

public class Matrix_Diagonal_Sum_Approach_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat= {
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
		};
		int n = mat.length;
		int sum = 0;
		//for principal diagonal
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++){
				if(i==j) {
					sum += mat[i][j];
				}
			}
		}
		//for secondary diagonal
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i!=j) {
					if((i+j) == (n-1)) {
						sum += mat[i][j];
					}
				}
			}
		}
		System.out.println(sum);
	}

}
