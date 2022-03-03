package com.java.sahil;

import java.util.Scanner;

public class AdditionUingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

				int ans = sum();
				System.out.println(ans);
				}
			
			static int sum() {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter number 1=");
				int n1 = in.nextInt();
				System.out.println("Enter number 2 =");
				int n2 = in.nextInt();
				int sum = n1+n2;
				return sum;
	}

}
