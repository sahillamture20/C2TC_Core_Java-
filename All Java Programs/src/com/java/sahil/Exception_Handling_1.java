package com.java.sahil;

public class Exception_Handling_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("hello"+" "+ 1 / 0);
		}
		catch(ArithmeticException e) {
			System.out.println("World");
		}
	}

}
