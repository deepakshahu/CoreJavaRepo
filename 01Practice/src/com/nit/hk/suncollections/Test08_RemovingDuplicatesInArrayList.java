package com.nit.hk.suncollections;

import java.util.ArrayList;

public class Test08_RemovingDuplicatesInArrayList {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		populate(al1);
		System.out.println(al1);
		removeDuplicates(al1);
		System.out.println(al1);
	}
	
	private static void populate(ArrayList<String> al1) {
		al1.add("a");
		al1.add("b");
		al1.add("a");
		al1.add("c");
		al1.add("a");
		al1.add("e");
		al1.add(null);
		al1.add("b");
		al1.add(null);
		al1.add("a");
		al1.add(null);
		al1.add("a");
		
	}

	private static void removeDuplicates(ArrayList<String> al) {
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al);
			Object ele = al.get(i);
			System.out.println("\n"+ele);
			for(int j = i+1; j < al.size(); j++) {
				Object nextEle = al.get(j);
				System.out.println(ele+" "+nextEle);
				if((ele == null) && (nextEle == null)) {
					al.remove(j);
					j--;
				}
				else {
					if(ele.equals(nextEle)) {
						al.remove(j);
						j--;
					}
				}
			}
		}
	}

}
