package com.java.sahil;

import java.util.Scanner;

public class ArmstrongNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number=");
		int n = s.nextInt();
		int ans=0,temp=n;
		while(n>0) {
			int rem = n%10;
			n/=10;
			ans+=rem*rem*rem;
		}
		if(temp==ans) {
			System.out.println(temp+" is a Armstrong number.");
		}
		else {
			System.out.println(temp+" is not a Armstrong number.");
		}
}
}
