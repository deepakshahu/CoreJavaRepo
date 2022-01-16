package com.nit.hk.sh.methods;

class A{
	static String s1 = "a";
}

class B{
	static String s2 = "a";
}

public class Test13_SCPAOnePerJVM {

	public static void main(String[] args) {
		
		System.out.println(A.s1 == B.s2);
	}
}