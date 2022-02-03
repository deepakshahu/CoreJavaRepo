package com.nit.hk.suncollections;

import java.util.Collection;
import java.util.Vector;

public class Test01_Vector {
	public static void main(String[] args) {
		Collection<Integer> v1 = new Vector<>();
		v1.add(5);
		v1.add(7);
		v1.add(9);
		v1.add(5);
		v1.add(7);
		System.out.println(v1);

		Vector<Integer> v2 = new Vector<>();
		//v2.add(25);
		v2.addAll(v1);
		//v2.add(35);
		System.out.println(v2);

		Vector<String> v3 = new Vector<>();
		// v3.addAll(v1);

		System.out.println(v1.contains(5));
		System.out.println(v1.contains(8));
		System.out.println(v2.contains(v1));
		System.out.println(v2.containsAll(v1));
		System.out.println();

		System.out.println(v1);
		System.out.println(v1.remove(5));
		System.out.println(v1);

		System.out.println(v1.remove(8));
		System.out.println(v1);

		Vector<Integer> v4 = new Vector<>();
		v4.add(7);
		System.out.println(v1.removeAll(v4));
		System.out.println(v1);

		System.out.println(v2);
		System.out.println(v2.removeAll(v1));
		System.out.println(v2);
	}
}