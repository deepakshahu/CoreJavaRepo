package com.nit.hk.sh.methods;

public class Test15_StringRefVarImmutable {

	public static void main(String[] args) {
		
		String s1 = "a";
		s1 = "b";
		System.out.println(s1);
		
		final String s2 = "c";
		//s2 = "d";
	}
}