package com.java.sahil;

import java.util.Scanner;

public class Lucky_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the kilometer: ");
		double km = sc.nextDouble();
		
		double miles = km/1.609;
		
		System.out.println(km+" is equal to "+miles+".");
	}

}
