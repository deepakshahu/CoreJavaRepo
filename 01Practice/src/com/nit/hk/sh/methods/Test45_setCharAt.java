package com.nit.hk.sh.methods;

public class Test45_setCharAt {

	public static void main(String[] args) {
		
		StringBuffer sb6 = new StringBuffer("abc bbc cbc");
		System.out.println("SB chars :: "+sb6);
		
		sb6.setCharAt(3, '-');
		System.out.println("SB chars :: "+sb6);
		
		sb6.setCharAt(7, '-');
		System.out.println("SB chars :: "+sb6);
		
		sb6.setCharAt(5, 'B');
		System.out.println("SB chars :: "+sb6);
		
		sb6.setCharAt(sb6.length()-1, 'Y');
		System.out.println("SB chars :: "+sb6);
		
		//sb6.setCharAt(sb6.length(), 'Z');
		
		sb6.replace(2, 5, "XYZ");
		System.out.println("SB chars :: "+sb6);
		
		sb6.replace(2, 7, "PQR");
		System.out.println("SB chars :: "+sb6);
		
		sb6.replace(2, 4, "MNOP");
		System.out.println("SB chars :: "+sb6);
	}
}