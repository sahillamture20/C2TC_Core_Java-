package com.java.sahil;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// count how many times 2 occurs in the number
				Scanner sc = new Scanner(System.in);
				int i, n, temp, count=0;
				System.out.print("Enter the value: ");
				i = sc.nextInt();
				System.out.print("Enter the number to find how many times it occurs: ");
				n = sc.nextInt(); 
				while(i>0) {
				
					temp = i%10;
					
					if(temp==n) {
					count++;
					
					}
					i = i/10;
				}
				System.out.println(n+" is occured "+count+" times.");
	}

}
