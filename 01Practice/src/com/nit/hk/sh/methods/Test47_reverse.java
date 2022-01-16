package com.nit.hk.sh.methods;

public class Test47_reverse {

	public static void main(String[] args) {
		
		//public StringBuffer reverse()
		StringBuffer sb5 = new StringBuffer("abc bbc");
		System.out.println("SB5 chars :: "+sb5);
		
		sb5.reverse();
		System.out.println("SB5 chars :: "+sb5);
		System.out.println();
		
		StringBuffer sb6 = sb5.reverse();
		System.out.println(sb5==sb6);
	}
}