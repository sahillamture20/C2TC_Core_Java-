package com.java.sahil;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int i,fact=1;
		for(i=n;i>0;i--) {
			fact = fact*i;
		}
	
		System.out.println(fact); 
	}

}
