package com.nit.hk.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Test04_IteratorRules {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al);
		
		Iterator<String> itr1 = al.iterator();
		System.out.println(itr1.next());
		System.out.println(itr1.next());
		System.out.println(itr1.next());
		
		//Rule 1:
		//System.out.println(itr1.next());  RE:NSEE
		System.out.println();
		
		//Rule 2:
		Iterator<String> itr2 = al.iterator();
		System.out.println(itr2.next());
		al.add("d");
		System.out.println(al);
		//System.out.println(itr2.next());  //RE: CME
		
		al.remove(1);
		System.out.println(al);
		//System.out.println(itr2.next());  //RE: CME
		
		//Rule 3:
		Iterator<String> itr3 = al.iterator();
		//itr3.remove();  //RE: ISE
		
		itr3.next();
		itr3.remove();
		//itr3.remove();
		System.out.println(al);
	}
}
