package com.nit.hk.suncollections;

import java.util.TreeSet;

public class Test15_TreeSet {
	public static void main(String[] args) {
		TreeSet<Object> ts1 = new TreeSet<>();
		ts1.add("a");
		ts1.add("c");  //"c".compareTo("a") -> +ve -> RIGHT SIDE
		ts1.add("b");  //"b".compareTo("a") -> +ve -> RIGHT SIDE
				       //"b".compareTo("c") -> -ve -> LEFT SIDE
		System.out.println(ts1);

		//ts.add(5);
		//ts.add(null);

		TreeSet<Integer> ts2 = new TreeSet<>();
		ts2.add(5);
		ts2.add(7);
		ts2.add(6);
		System.out.println(ts2);

		TreeSet<B> ts3 = new TreeSet<>();
		ts3.add(new B(5,9));  //b1.compareTo(b1) //ignored
		ts3.add(new B(7,2));  //b2.compareTo(b1) -> +ve -> RS
		ts3.add(new B(6,4));  //b3.compareTo(b1) -> +ve -> RS
		   					  //b3.compareTo(b2) -> -ve -> LS
		ts3.add(new B(6,4));
		System.out.println(ts3);
		
		TreeSet<B> ts4 = new TreeSet<>(new BxDescComparator());
		ts4.add(new B(5,9));  
		ts4.add(new B(7,2));  //cmpr.compare(b2,b1) -> -ve -> LS
		ts4.add(new B(6,4));  //cmpr.compare(b3,b1) -> -ve -> LS
		   					  //cmpr.compare(b3,b2) -> +ve -> RS
		ts4.add(new B(6,4));
		System.out.println(ts4);
		
		//TS Sorting algorithm has two logics
			//1.comparing logic -> developer
			//2.swapping logic -> SUN
		
		//1.comparing logic -> developer
			//by implementing comparable interface method compareTo() in the same adding object class
				//1) return -ve to tell smaller object
				//2) return +ve to tell bigger object
				//3) return 0 to tell duplicate object
		
		//2.swapping logic -> SUN
			//1) if compareTo() returns -ve -> CO is stored LEFT to TS element
			//2) if compareTo() returns +ve -> CO is stored RIGHT to TS element
			//3) if compareTo() returns 0 -> CO is not stored
		
		//TS does not have default sorting order
		//TS default sorting order is not ascending order
		//TS sort elements according to the natural sorting order
		//given in adding object class comparable interface compareTo()
		
		//In compareTo method we can place below 5 cases logic
		
		//If we place CO - AO --> objects are stored in Ascending order
		//If we place AO - CO --> objects are stored in descending order
		//If we place +ve num --> objects are stored in Insertion order including duplicates
		//If we place -ve num --> objects are stored in reverse insertion order including duplicates
		//If we place 0 ==> only first object is stored
	}
}
