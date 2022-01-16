package com.nit.hk.sh.methods;

public class Test50_SBCapacityControlling_trimToSize {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println("capacity :: "+sb.capacity());
		System.out.println("size :: "+sb.length());
		System.out.println("chars :: "+sb);
		System.out.println();
		
		sb.trimToSize();
		System.out.println("capacity :: "+sb.capacity());
		System.out.println("size :: "+sb.length());
		System.out.println("chars :: "+sb);
	}
}