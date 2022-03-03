package com.java.sahil;

public class Method_Overloading {
	void m(int i) {
		System.out.println("ASD");
	}
	void m(double j) {
		System.out.println("SD");
	}
	void m() {
		System.out.println("D");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Method_Overloading obj = new Method_Overloading();
			obj.m(4l);
			obj.m('a');
			obj.m(1.2f);
			obj.m(3);
	}

}
