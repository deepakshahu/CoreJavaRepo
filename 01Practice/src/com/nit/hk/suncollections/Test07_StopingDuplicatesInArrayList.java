package com.nit.hk.suncollections;

import java.util.ArrayList;

public class Test07_StopingDuplicatesInArrayList {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		add("a", al1);
		add("c", al1);
		add("b", al1);
		add("a", al1);
		add("b", al1);
		
		System.out.println(al1);
		
	}
	
	static void add(String s, ArrayList<String> al) {
		if(!al.contains(s))  //In this adding object class equals() method
			al.add(s);       //must be overridden
	}

}
