package com.java.sahil;

public class Constructor_Demo {
	String name;
	int rollno, age;

	public Constructor_Demo(String name, int rollno, int age) {
	
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_Demo obj_1 = new Constructor_Demo("Sahil", 1, 21);  // this is a object
		
		Constructor_Demo obj_2 = new Constructor_Demo("Sameer", 2, 21);// this is a object
		
		Constructor_Demo obj_3 = new Constructor_Demo("Sushil", 3, 20);// this is a object
		
		Constructor_Demo obj_4 = new Constructor_Demo("Sumit", 4, 20);// this is a object
		
		System.out.println(obj_1.name+" "+obj_1.rollno+" "+obj_1.age);
		System.out.println(obj_2.name+" "+obj_2.rollno+" "+obj_2.age);
		System.out.println(obj_3.name+" "+obj_3.rollno+" "+obj_3.age);
		System.out.println(obj_4.name+" "+obj_4.rollno+" "+obj_4.age);
	}

}
