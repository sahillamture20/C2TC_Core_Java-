package com.java.sahil;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the aplhabet =");
		char ch = in.next().trim().charAt(0);
		System.out.println("The alphabet = "+ch);
		
		if(ch >= 'a' && ch <='z')
		{
			System.out.println(ch+" is lowercase aplhabet.");
		}
		else
		{
			System.out.println(ch+" is UPPERCASE alphabet.");
		}
	}

}
