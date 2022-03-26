package com.java.sahil;

public class Exception_Handling_3 {

	public static void main(String[] args) {
		try {
			throw new NullPointerException("Hello");
		}
		catch(ArithmeticException e) {
			System.out.println("B");
		}

	}

}
