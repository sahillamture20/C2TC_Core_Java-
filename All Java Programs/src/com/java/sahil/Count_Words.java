package com.java.sahil;

public class Count_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] sentences = {"please wait", "continue to fight", "continue to win"};
		
		//System.out.println(str.length());
		int count = 0, max = 0;
		if(sentences.length == 0) {
			System.out.println(count++);
		}
		for(int i = 0; i< sentences.length; i++) {
			for(int j = 0; j< sentences[i].length(); j++) {
				if(sentences[i].charAt(j) == ' ') {
				count++;
				}
				
			}
			max = Math.max(count, max);
			count = 0;
		}
		max = max + 1;
		System.out.println(max);
	}

}
