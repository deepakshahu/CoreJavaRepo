package com.nit.hk.sh.methods;

public class Test40_SBConstructors {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1 capacity :: "+sb1.capacity());
		System.out.println("sb1 length :: "+sb1.length());
		System.out.println("sb1 chars :: "+sb1);
		System.out.println();
		
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2 capacity :: "+sb2.capacity());
		System.out.println("sb2 length :: "+sb2.length());
		System.out.println("sb2 chars :: "+sb2);
		System.out.println();
		
		StringBuffer sb3 = new StringBuffer("abc");
		System.out.println("sb3 capacity :: "+sb3.capacity());
		System.out.println("sb3 length :: "+sb3.length());
		System.out.println("sb3 chars :: "+sb3);
		System.out.println();
		
		sb3.append("d");
		System.out.println("sb3 capacity :: "+sb3.capacity());
		System.out.println("sb3 length :: "+sb3.length());
		System.out.println("sb3 chars :: "+sb3);
		System.out.println();
		
		StringBuffer sb4 = new StringBuffer(sb3);
		System.out.println("sb4 capacity :: "+sb4.capacity());
		System.out.println("sb4 length :: "+sb4.length());
		System.out.println("sb4 chars :: "+sb4);
		System.out.println();
		
		//StringBuffer sb5 = new StringBuffer(-5);
		//StringBuffer sb6 = new StringBuffer(0);
		//StringBuffer sb7 = new StringBuffer(null);
		//String s1 = new String(null);
		//String s1 = new String((String)null);
		String s1 = new String("null");
		StringBuffer sb11 = new StringBuffer("null");
		
		StringBuffer sb8 = null;
		System.out.println("sb8 :: "+sb8);
		System.out.println();
		
		//StringBuffer sb9 = "null";
		
		StringBuffer sb10 = new StringBuffer("null");
		System.out.println("sb10 capacity :: "+sb10.capacity());
		System.out.println("sb10 length :: "+sb10.length());
		System.out.println("sb10 chars :: "+sb10);
		System.out.println();
		
		
	}
}