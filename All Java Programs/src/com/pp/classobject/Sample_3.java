package com.pp.classobject;

import java.util.Scanner;

class Greater {
	public int max(int x, int y) {
		if (x==y) {
			System.out.println("Both numbers are equal.");
		}
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}
}
public class Sample_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		Greater great = new Greater();
		System.out.println("Greater number is "+great.max(a,b)+".");
	}

}
