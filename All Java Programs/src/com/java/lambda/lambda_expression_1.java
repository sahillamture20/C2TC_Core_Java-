package com.java.lambda;

interface Anonymous {
	void show();
}
public class lambda_expression_1 {

	public static void main(String[] args) {
		// first lambda program
		Anonymous l = ()->System.out.println("Lambda Demo 1");
		l.show();
	}

}
