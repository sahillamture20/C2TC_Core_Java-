package com.java.sahil;

public class Matrix_Sum_Diagonal_Approach_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		/*Concept:
		 * sum = elements of principal diagonal + elements of secondary diagonal
		 * Repetition of elements is not allowed
		 * That means, principal elements = 1, 5, 9 & secondary elements = 3, 5, 7
		 * Here, 5 is appear 2 times. So, answer of sum = 30, which is wrong answer. 25 is correct answer
		 * So, while counting the sum take 5 only one time.*/
		
		//for principal diagonal => here, indexes of element under principal diagonal are (0,0), (1,1), (2,2) 
		int sum = 0;
		for(int i=0; i<mat.length; i++) {
			sum += mat[i][i];
		}
		//for secondary diagonal => here, indexes of element under secondary diagonal are (0,2), (1,1), (2,0)
		int k = mat.length-1;
		for(int j=0; j<mat.length; j++) {
			sum += mat[j][k--];
		}
		/*If the size of matrix is odd value, then the concept of "repetition of number" explain above occurs.
		 * That's why, below code.
		 * If the size of matrix is even value, then the repetition of number not occured. */
		if(mat.length%2 != 0) {
			int mid = 0 + ((mat.length-1) - 0)/2;
			sum -= mat[mid][mid];
		}
		System.out.println(sum);
	}

}
