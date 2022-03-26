package com.java.sahil;

public class Exception_Handling_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i, sum;
			sum = 10;
			for(i=-1;i<3;++i)
			{
				sum=(sum/i);
				System.out.println(i);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("0");
		}
	}

}
