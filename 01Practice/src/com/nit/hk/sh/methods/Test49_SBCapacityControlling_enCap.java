package com.nit.hk.sh.methods;

public class Test49_SBCapacityControlling_enCap {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(3);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(4);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(20);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(15);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(0);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(-5);
		System.out.println(sb.capacity());
		System.out.println();
		
		sb.append("abcd");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}