package com.nit.hk.suncollections;

public class MyCollectionTest {

	public static void main(String[] args) {
		
		MyCollection col = new MyCollection();
		col.add("a");
		col.add("c");
		col.add("d");
		col.add("e");
		col.add(5);
		col.add(null);
		
		//display the collection
		System.out.println(col);
		
		//display the capacity
		System.out.println(col.capacity());
		
		//display the size
		System.out.println(col.size());
		
		//display the 2nd index
		System.out.println(col.get(2));
		
		//replace the element and display it
		col.replace(1, "B");
		System.out.println(col);
		
		//remove the element and display it
		col.remove(4);
		System.out.println(col);
		
		//Insert the element and display it
		col.insert(1, "b");
		System.out.println(col);
	}
}