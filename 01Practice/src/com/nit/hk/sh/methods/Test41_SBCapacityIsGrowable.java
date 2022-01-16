package com.nit.hk.sh.methods;

public class Test41_SBCapacityIsGrowable {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer(3);
		System.out.println("sb1 capacity :: "+sb1.capacity());
		System.out.println("sb1 length :: "+sb1.length());
		System.out.println("sb1 chars :: "+sb1);
		System.out.println();
		
		sb1.append("a");
		sb1.append("b");
		sb1.append("c");
		System.out.println("sb1 capacity :: "+sb1.capacity());
		System.out.println("sb1 length :: "+sb1.length());
		System.out.println("sb1 chars :: "+sb1);
		System.out.println();
		
		sb1.append("d");
		System.out.println("sb1 capacity :: "+sb1.capacity());
		System.out.println("sb1 length :: "+sb1.length());
		System.out.println("sb1 chars :: "+sb1);
		System.out.println();
		
		sb1.append("efghi");
		System.out.println("sb1 capacity :: "+sb1.capacity());
		System.out.println("sb1 length :: "+sb1.length());
		System.out.println("sb1 chars :: "+sb1);
		System.out.println();
		
		StringBuffer sb2 = new StringBuffer(2);
		System.out.println("sb2 capacity :: "+sb2.capacity());
		System.out.println("sb2 length :: "+sb2.length());
		System.out.println("sb2 chars :: "+sb2);
		System.out.println();
		
		sb2.append("abcdefghij");
		System.out.println("sb2 capacity :: "+sb2.capacity());
		System.out.println("sb2 length :: "+sb2.length());
		System.out.println("sb2 chars :: "+sb2);
		System.out.println();
	}
}