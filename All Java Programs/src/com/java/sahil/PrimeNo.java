package com.java.sahil;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = in.nextInt();
		System.out.println(isPrime(n));

	}
	
	static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		int c =2;
		while(c*c <= n) {
			if(n%c ==0) {
				return false;
			}
			c++;
		}
		return c * c > n;
	}

}
