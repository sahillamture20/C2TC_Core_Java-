package com.java.sahil;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first numbr:");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int n2 = sc.nextInt();
		
		System.out.println("Entee the thirs number:");
		int n3 = sc.nextInt();
		
		int n4 = n1+n2+n3;
		
		System.out.println("Addition of "+n1+", "+n2+" and "+n3+" is "+n4+".");
	}

}
