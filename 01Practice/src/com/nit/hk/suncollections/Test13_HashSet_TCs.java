package com.nit.hk.suncollections;

import java.util.LinkedHashSet;

public class Test13_HashSet_TCs {

	public static void main(String[] args) {
		LinkedHashSet<Ex> hs = new LinkedHashSet<>();
		hs.add(new Ex(5,6));
		hs.add(new Ex(7,8));
		hs.add(new Ex(6,5));
		hs.add(new Ex(7,4));
		hs.add(new Ex(1,2));
		hs.add(new Ex(3,2));
		hs.add(new Ex(3,2));
		Ex e8 = new Ex(5,7);
		hs.add(e8);
		hs.add(e8);
		System.out.println(hs);
		System.out.println(hs.size());
	}

}
