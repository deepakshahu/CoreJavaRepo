package com.nit.hk.suncollections;

import java.util.LinkedList;

public class Test03_LinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Object> linkedlist = new LinkedList<>();
		//Operation 1:
		System.out.println(linkedlist.isEmpty());
		//Operation 2:
		System.out.println(linkedlist.size());
		//Operation 3:
		System.out.println(linkedlist);
		System.out.println();
		
		//Operation 4:
		linkedlist.add("a");
		linkedlist.add("b");
		linkedlist.add(5);
		linkedlist.add(6.7);
		linkedlist.add(null);
		linkedlist.add(new A(5,6));
		linkedlist.add("a");
		linkedlist.add(null);
		System.out.println(linkedlist.isEmpty());
		System.out.println(linkedlist.size());
		System.out.println(linkedlist);
		System.out.println();
		
		//Operation 5: Searching elements -> operator and equals() method are used
		System.out.println(linkedlist.contains("a"));  //Linear search algorithm
		System.out.println(linkedlist.contains(5));
		System.out.println(linkedlist.contains(null));
		System.out.println(linkedlist.contains(new A(5,6)));
		System.out.println();
		
		System.out.println(linkedlist.indexOf("a"));  //Linear search algorithm
		System.out.println(linkedlist.indexOf("A"));
		System.out.println(linkedlist.indexOf(null));
		System.out.println(linkedlist.indexOf(new A(5,6)));
		System.out.println();
		
		//Operation 6: retrieving element
		System.out.println(linkedlist);
		System.out.println(linkedlist.getFirst());
		System.out.println(linkedlist.getLast());
		System.out.println(linkedlist.get(3));  //Binary search algorithm
		
		//Operation 7: removing element
		System.out.println(linkedlist);
		System.out.println(linkedlist.remove(4));  //Binary search algorithm
		System.out.println(linkedlist);
		
		System.out.println(linkedlist.remove(new A(5,6)));  //Linear search algorithm
		System.out.println(linkedlist);
		
		//Operation 8: inserting element
		linkedlist.add(3,"X");               //Binary search algorithm
		System.out.println(linkedlist);
		
		//Operation 9: replacing element
		linkedlist.set(2, "Y");              //Binary search algorithm
		System.out.println(linkedlist);
		
		//Operation 10: sorting element
		linkedlist.clear();
		linkedlist.add("a");
		linkedlist.add("c");
		linkedlist.add("b");
		System.out.println(linkedlist);
		linkedlist.sort(null);
		System.out.println(linkedlist);		
	}
}