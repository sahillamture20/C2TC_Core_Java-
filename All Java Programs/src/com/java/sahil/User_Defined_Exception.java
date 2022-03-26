package com.java.sahil;

public class User_Defined_Exception {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new MyException1(5);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
class MyException1 extends Exception{
	int a;
	MyException1(int b){
		a=b;
	}
	public String toString() {
		return("Entered number = "+a);
	}
}


