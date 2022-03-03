package com.pp.classobject;

class StudentInfo{
	String name ="John";
	int roll_no;
	long ph_no;
	String address;
}
public class Sample_4 {	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			StudentInfo s1 = new StudentInfo();
			s1.name = "Sahil";
			s1.roll_no = 1;
			s1.ph_no = 932624123;
			s1.address = "Mumbai, Maharashtra";
			
			StudentInfo s2 = new StudentInfo();
			s2.name = "Rahil";
			s2.roll_no = 2;
			s2.ph_no = 877604873;
			s2.address = "Panji, Goa";
			
			System.out.println(s1.name+" "+s1.roll_no+" "+s1.ph_no+" "+s1.address+".");
			System.out.println(s2.name+" "+s2.roll_no+" "+s2.ph_no+" "+s2.address+".");
		}
}

