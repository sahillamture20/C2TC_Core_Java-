package com.pp.classobject;

class Student{
	String name ="John";
	int roll_no;
}
public class Sample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.name = "Sahil";
		s.roll_no = 2;
		System.out.println(s.name+" "+s.roll_no);
	}

}
