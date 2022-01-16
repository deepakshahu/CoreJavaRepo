package com.nit.hk.sh.methods;

public class Test46_deleteTest {

	public static void main(String[] args) {
		
		StringBuffer sb3 = new StringBuffer("Hari Ameerpet Krishna");
		System.out.println("SB3 chars :: "+sb3);
		
		sb3.delete(5, 13);
		System.out.println("SB3 chars :: "+sb3);
		
		sb3.deleteCharAt(4);
		System.out.println("SB3 chars :: "+sb3);
		
		StringBuffer sb4 = new StringBuffer("abcdef");
		System.out.println("SB4 chars :: "+sb4);
		sb4.deleteCharAt(1);
		sb4.deleteCharAt(2);
		System.out.println("SB4 chars :: "+sb4);
		System.out.println();
		
		//sb4.deleteCharAt(20);
	}
}