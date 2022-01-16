package com.nit.hk.sh.methods;

import java.util.Scanner;

public class Test55_intern {

	public static void main(String[] args) {
/*		
		String s1 = "a";
		String s2 = "a";
		System.out.println(s1==s2);
		
		String s3 = new String("b");
		String s4 = new String("b");
		System.out.println(s3==s4);
		
		String s5 = s1.concat(s2);
		String s6 = s1.concat(s2);
		System.out.println(s5==s6);
		
		String s7 = s1 + s2;
		String s8 = s1 + s2;
		System.out.println(s7==s8);
		
		Scanner sc = new Scanner(System.in);
		String s9 = sc.nextLine();
		String s10 = sc.nextLine();
		System.out.println(s9==s10);
*/		
		String s1 = "H";
		String s2 = s1.intern();  //used for adding and retrieving string object to and from pool
		System.out.println(s1==s2);
		System.out.println();
		
		String s3 = new String("NIT");
		String s4 = s3.intern();
		String s5 = "NIT";
		String s6 = new String("NIT").intern();
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(s4==s5);
		System.out.println(s5==s6);
		System.out.println();
		
		String s7 = new String("Ameerpet").intern();
		String s8 = new String("Ameerpet").intern();
		System.out.println(s7==s8);
	}
}