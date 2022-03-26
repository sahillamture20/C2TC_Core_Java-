package com.java.sahil;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
	
	public static void main(String[] args) {
		LinkedList<Integer> lang = new LinkedList<Integer>();
		lang.add(5);
		lang.add(3);
		lang.add(4);
		lang.add(9);
		
		Iterator it  = lang.iterator();
		Collections.reverse(lang);
		Collections.sort(lang);
		while(it.hasNext())
			System.out.println(it.next() + " ");
	}

}
