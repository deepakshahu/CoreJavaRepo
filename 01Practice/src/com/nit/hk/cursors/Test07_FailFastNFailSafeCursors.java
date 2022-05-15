package com.nit.hk.cursors;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Test07_FailFastNFailSafeCursors {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<>();
		v1.add("a");
		v1.add("b");
		v1.add("c");
		
		Enumeration<String> e = v1.elements();  //legacy implementation Enumeration is not fail fast, it is fail safe
		System.out.println(e.nextElement());
		v1.add("d");
		System.out.println(e.nextElement());
		
		Enumeration<String> e2 = Collections.enumeration(v1);  //CF implementation Enumeration is fail fast, it internally
		System.out.println(e2.nextElement());  //uses Iterator implementation
		v1.add("e");
		System.out.println(e2.nextElement());
	}

}
