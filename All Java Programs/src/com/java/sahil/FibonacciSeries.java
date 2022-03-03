package com.java.sahil;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the number=");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Fibonacci Series upto "+n+"th element is-");
		System.out.print("0\t1\t");
		int a=0,b=1,c,i=1;
		while(i<=n)
		{
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
			i++;
			
		}
	}

}
