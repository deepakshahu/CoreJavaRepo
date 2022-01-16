package com.nit.hk.sh.methods;

public class Test51_SBCapacityControlling_setLen {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println("capacity :: "+sb.capacity());
		System.out.println("size :: "+sb.length());
		System.out.println("chars :: "+sb);
		System.out.println();
		
		sb.setLength(6);
		System.out.println("capacity :: "+sb.capacity());
		System.out.println("size :: "+sb.length());
		System.out.println("chars :: "+sb);
		System.out.println("Is it \0 :: "+String.valueOf(sb.charAt(3)).equals("\0"));
		System.out.println();
		
		sb.trimToSize();
		System.out.println("capacity :: "+sb.capacity());
		System.out.println("size :: "+sb.length());
		System.out.println("chars :: "+sb);
		System.out.println();
		
		//sb.append("def");
		//sb.insert(3, "def");
		sb.replace(3, 6, "def");
		System.out.println("capacity :: "+sb.capacity());
		System.out.println("size :: "+sb.length());
		System.out.println("chars :: "+sb);
		System.out.println();
		
		StringBuffer sb2 = new StringBuffer(7);
		sb2.append("abc");
		
		System.out.println("capacity :: "+sb2.capacity());
		System.out.println("size :: "+sb2.length());
		System.out.println("chars :: "+sb2);
		System.out.println();
		
		sb2.setLength(5);
		System.out.println("capacity :: "+sb2.capacity());
		System.out.println("size :: "+sb2.length());
		System.out.println("chars :: "+sb2);
		System.out.println();
		
		sb2.setLength(2);
		System.out.println("capacity :: "+sb2.capacity());
		System.out.println("size :: "+sb2.length());
		System.out.println("chars :: "+sb2);
		System.out.println();
		
		sb2.setLength(5);
		System.out.println("capacity :: "+sb2.capacity());
		System.out.println("size :: "+sb2.length());
		System.out.println("chars :: "+sb2);
		System.out.println();
		
		sb2.setLength(0);
		System.out.println("capacity :: "+sb2.capacity());
		System.out.println("size :: "+sb2.length());
		System.out.println("chars :: "+sb2);
		System.out.println();
		
		//sb2.length(-5);
		
		sb2.setLength(19);
		System.out.println("capacity :: "+sb2.capacity());
		System.out.println("size :: "+sb2.length());
		System.out.println("chars :: "+sb2);
		System.out.println();
	}
}