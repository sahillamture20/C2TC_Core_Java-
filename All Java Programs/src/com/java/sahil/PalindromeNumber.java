package com.java.sahil;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n= sc.nextInt();
		System.out.print("The "+n+" is a ");
		int ans=0,temp = n;;
		
		while(n>0) {
			
			int rem = n%10;
			n/=10;
			ans = ans*10+rem;
		}
		if(temp==ans) {
			System.out.print("Palindrome number.");
			}
			else {
				System.out.println("not Palindrome number.");
			}
	}

}
