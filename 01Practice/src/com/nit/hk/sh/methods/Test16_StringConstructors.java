package com.nit.hk.sh.methods;

public class Test16_StringConstructors {

	public static void main(String[] args) {
		
		String s1 = new String();
		System.out.println("s1 chars: "+s1);
		System.out.println("s1 length: "+s1.length());
		System.out.println();
		
		String s2 = new String("abc");
		System.out.println("s2 chars: "+s2);
		System.out.println("s2 length: "+s2.length());
		System.out.println();
		
		StringBuffer sb1 = new StringBuffer("def");
		String s3 = new String(sb1);
		System.out.println("s3 chars: "+s3);
		System.out.println("s3 length: "+s3.length());
		System.out.println();
		
		char[] ch = {'a','b','c','d','e','f'};
		String s4 = new String(ch);
		System.out.println("s4 chars: "+s4);
		System.out.println("s4 length: "+s4.length());
		System.out.println();
		
		String s5 = new String(ch,2,3);
		System.out.println("s5 chars: "+s5);
		System.out.println("s5 length: "+s5.length());
		System.out.println();
		
		byte[] b = {97,98,99,100};
		String s6 = new String(b);
		System.out.println("s6 chars: "+s6);
		System.out.println("s6 length: "+s6.length());
		System.out.println();
	}
}