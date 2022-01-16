package com.nit.hk.sh.methods;

import java.util.Scanner;

public class Test17_isEmpty {

	public static void main(String[] args) {

		String s1 = "";
		String s2 = " ";
		String s3 = "a";
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String(" ");
		String s7 = new String("a");

		System.out.println("is S1 empty: "+s1.isEmpty()+" is S1 blank: "+s1.isBlank());
		System.out.println("is S2 empty: "+s2.isEmpty()+" is S2 blank: "+s2.isBlank());
		System.out.println("is S3 empty: "+s3.isEmpty()+" is S3 blank: "+s3.isBlank());
		System.out.println("is S4 empty: "+s4.isEmpty()+" is S4 blank: "+s4.isBlank());
		System.out.println("is S5 empty: "+s5.isEmpty()+" is S5 blank: "+s5.isBlank());
		System.out.println("is S6 empty: "+s6.isEmpty()+" is S6 blank: "+s6.isBlank());
		System.out.println("is S7 empty: "+s7.isEmpty()+" is S7 blank: "+s7.isBlank());

		System.out.println("is S2 empty: "+s2.trim().isEmpty());
		System.out.println("is S2 empty: "+s2.isBlank());
		
		System.out.println(s1.length());
		System.out.println(s2.trim().length());
		System.out.println(s3.length());

		String[] s8 = {"d","e","d"};
		System.out.println(s8.length);

		String s9 = "a";
		System.out.println(s9.length());

		String s10 = "hari";
		Example e1 = new Example(5);
		System.out.println(s10);
		System.out.println(e1.toString());

		String s11;
		//System.out.println(s11.isEmpty());  (compile time error)
		//System.out.println(s11.isBlank());  (compile time error)
		//System.out.println(s11.length());  (compile time error)

		String s12=null;
		//System.out.println(s12.isEmpty());  (run time error)
		//System.out.println(s12.isBlank());  (run time error)
		//System.out.println(s12.length());  (run time error)

		String s13 = "null";
		System.out.println(s13.isEmpty());
		System.out.println(s13.isBlank()); 
		System.out.println(s13.length());

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter some text: ");
		String s14 = "hi";//sc.nextLine();
		System.out.println(s14.isEmpty());
		System.out.println(s14.isBlank()); 
		System.out.println(s14.length());
		System.out.println();
	}
}