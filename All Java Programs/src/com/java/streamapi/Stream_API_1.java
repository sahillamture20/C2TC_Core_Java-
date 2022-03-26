package com.java.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_API_1 {

	public static void main(String[] args) {
		List<Integer> num = List.of(13,45,63,24,78,96,54,33,21,27,89);
		System.out.println(num);
		Stream<Integer> even_num = num.stream();
		System.out.println(even_num.filter(i->i%2==0).collect(Collectors.toList()));
	}
}
