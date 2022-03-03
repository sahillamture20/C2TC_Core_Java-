package com.pp.classobject;

class Triangle{
	int a,b,c;
	public double area() {
		 double s = (a+b+c)/2.0;
		 return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
	}
	public double perimeter() {
		return (a+b+c)/2; 
	}
}

public class Sample_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle t = new Triangle();
		t.a = 2;
		t.b = 3;
		t.c = 3;
		System.out.println(t.area());
		System.out.println(t.perimeter());
	}
}
