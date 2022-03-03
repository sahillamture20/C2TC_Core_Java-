package com.pp.classobject;

import java.util.Scanner;

class Area{
 int l;
 int b;
  int area;

void setDim(int l, int b) {
	this.l = l;
	this.b = b;
	area = this.l*this.b;
}

int setArea() {
	return area;
}
}

public class Sample_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Area area = new Area();
		area.setDim(n, m);
		System.out.println("Area of rectangle = "+area.setArea());
		
		

	}
	

}
