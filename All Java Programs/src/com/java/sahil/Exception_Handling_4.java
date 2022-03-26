package com.java.sahil;

public class Exception_Handling_4 {

	public static void main(String[] args) {
		try {
			int a = args.length;
			int b = 10/a;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println("1");
		}

	}

}
