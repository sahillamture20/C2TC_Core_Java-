package com.pp.classobject;

import java.util.Scanner;

class NaturalSum{
	public int sum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
public class Sample_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number = ");
		int n = in.nextInt();
		
		NaturalSum nsum = new NaturalSum();
		int ans = nsum.sum(n);
		
		System.out.printf("Sum of first %d natural numbers is %d.", n, ans);
	}

}
