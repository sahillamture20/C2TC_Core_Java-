package com.java.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_API_2 {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(8);
		marks.add(14);
		marks.add(15);
		System.out.println(marks);
		List<Integer> UpdatedList = marks.stream().map(i-> i+5).collect(Collectors.toList());
		System.out.println(UpdatedList);
		System.out.println("Number of failed students = "+ marks.stream().filter(i->i>15).count());
	}

}
