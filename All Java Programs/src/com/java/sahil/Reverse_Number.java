package com.java.sahil;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n= sc.nextInt();
		System.out.print("Reverse of "+n+" is ");
		int ans=0;
		while(n>0) {
			
			int rem = n%10;
			n/=10;
			ans = ans*10+rem;
		}
		System.out.print(ans);
	}

}
