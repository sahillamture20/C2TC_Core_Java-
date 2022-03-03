package com.java.sahil;

import java.util.Scanner;

public class CGPAConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first subject marks:");
		int m1 = sc.nextInt();
		
		System.out.println("Enter the second subject marks:");
		int m2 = sc.nextInt();
		
		System.out.println("Enter the thirs sunject marks:");
		int m3 =sc.nextInt();
		
		double p = ((m1+m2+m3)/300)*100;
		
		double cgpa = (double) p/9.5;
		
		System.out.println("Your CGPA is "+cgpa+".");
	}

}
