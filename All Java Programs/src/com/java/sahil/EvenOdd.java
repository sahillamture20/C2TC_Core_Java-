package com.java.sahil;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.println("Enter the number = ");
		
		
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		
		if(n % 2 == 0.0)
		{
			System.out.println("Entered Number is even.");
		}
		else
		{
			System.out.println("Entered number is odd.");
		}

	}

}
