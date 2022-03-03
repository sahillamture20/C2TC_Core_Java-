package com.java.sahil;

import java.util.Scanner;

public class StriingOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i=0, n, count=0;
		char temp;
		System.out.print("Enter the value: ");
		String s = sc.nextLine();
		System.out.print("Enter the number to find how many times it occurs: ");
		char s1 = sc.next().trim().charAt(i); 
		n = s.length();
		while(n>0) {
			temp=s.trim().charAt(i);
			if(temp==s1); {
			count++;
			}
			i++;
		}
		System.out.println(n+" is occured "+count+" times.");
	}

}
