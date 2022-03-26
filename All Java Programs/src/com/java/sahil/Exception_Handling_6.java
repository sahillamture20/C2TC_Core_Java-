package com.java.sahil;

public class Exception_Handling_6 {
	public static void main(String[] args) {
		try {
			int a,b;
			a = 0;
			b = 5;
			int c = b / a;
			System.out.println("A");
		}
		catch(Exception e) {
			System.out.println("B");
		}
	}
}
