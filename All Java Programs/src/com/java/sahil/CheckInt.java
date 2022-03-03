package com.java.sahil;

import java.util.Scanner;

public class CheckInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		if(sc.hasNextInt())
		{
			System.out.println("Your number "+sc.nextInt()+" is a Interger type.");
		}
		else
		{
			System.out.println("Your number "+sc.nextInt()+" is not a Integer type.");
		}
		sc.close();
	}

}
