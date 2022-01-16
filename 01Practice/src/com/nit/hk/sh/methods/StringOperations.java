package com.nit.hk.sh.methods;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;


public class StringOperations {

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

		String s15 = "deepak";
		System.out.println(s15=="deepak");
		System.out.println(s15.equals("deepak"));
		System.out.println();

		String s16 = new String("hari");
		System.out.println(s16 == "hari");
		System.out.println(s16.equals("hari"));
		System.out.println();

		String s17 = new String("Hari");
		System.out.println(s17 == "hari");
		System.out.println(s17.equals("hari"));
		System.out.println(s17.equalsIgnoreCase("hari"));
		System.out.println();

		String s18 = "a";
		String s19 = "a";
		System.out.println("s18==s19"+s18==s19);
		System.out.println("s18==s19"+(s18==s19));
		System.out.println();

		String s20 = "abc";
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(s20.equals(sb1));
		System.out.println(s20.equals(sb2));
		System.out.println(s20.equals(sb2.toString()));
		System.out.println(s20.contentEquals(sb1));  //1.4
		System.out.println(s20.contentEquals(sb2));  //1.5

		StringBuffer sb3 = new StringBuffer("abc");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sb3));
		//System.out.println(sb1.equalsIgnoreCase(sb3));
		//System.out.println(sb1.contentEquals(sb3));
		System.out.println(sb1==sb3);
		System.out.println();

		String s21 = "abc";
		String s22 = "abc";
		String s23 = "Abc";
		String s24 = "abcdef";
		System.out.println(s21==s22);
		System.out.println(s21.equals(s22));
		System.out.println(s21.compareTo(s22));
		System.out.println(s21.equals(s23));
		System.out.println(s21.compareTo(s23));
		System.out.println(s21.compareToIgnoreCase(s23));

		System.out.println(s21.equals(s24));
		System.out.println(s21.compareTo(s24));
		System.out.println(s21.compareToIgnoreCase(s24));

		System.out.println(s24.equals(s21));
		System.out.println(s24.compareTo(s21));
		System.out.println(s24.compareToIgnoreCase(s21));
		System.out.println();

		System.out.println(s23.compareTo(s24));
		System.out.println(s24.compareTo(s23));
		System.out.println(s23.compareToIgnoreCase(s24));
		System.out.println(s24.compareToIgnoreCase(s23));
		System.out.println();

		String s26 = "Java Programming Program language";
		System.out.println(s26.equals("Program"));
		System.out.println(s26.compareTo("Program"));
		System.out.println(s26.contains("Program"));
		System.out.println(s26.contains("program"));
		//System.out.println(s26.containsIgnoreCase("program"));
		System.out.println(s26.toLowerCase().contains("program"));
		//System.out.println(s26.contains('J'));
		System.out.println(s26.contains("J"));
		System.out.println(s26.indexOf("J"));
		System.out.println(s26.indexOf('a'));
		System.out.println(s26.lastIndexOf('a'));
		System.out.println(s26.indexOf('a',5));
		System.out.println(s26.lastIndexOf('a',5));
		System.out.println();

		System.out.println(s26.indexOf('A'));
		System.out.println(s26.lastIndexOf('A'));
		System.out.println(s26.indexOf('a',-5));  //given index onwards up to length-1
		//if(index<0)
		//    index=0;
		System.out.println(s26.lastIndexOf('a',-5));
		//if(index<0)
		//    index=0;
		System.out.println(s26.indexOf('a',25));
		System.out.println(s26.lastIndexOf('a',25));
		System.out.println(s26.indexOf('a',1));  //inclusive
		System.out.println(s26.lastIndexOf('a',1));  //inclusive
		System.out.println();

		System.out.println(s26.indexOf("Program"));
		System.out.println(s26.lastIndexOf("Program"));

		if(s26.toLowerCase().indexOf("program")!=-1) {
			System.out.println("Available");
		}
		else {
			System.out.println("Not available");
		}

		if(s26.contains("Program")) {
			System.out.println("Available");
		}
		else {
			System.out.println("Not available");
		}
		System.out.println();

		String s27 = "abc bbc cbc";
		System.out.println(s27.equals("abc"));
		System.out.println(s27.compareTo("abc"));
		System.out.println(s27.indexOf("bbc"));
		System.out.println(s27.contains("abc"));
		System.out.println(s27.startsWith("abc"));
		System.out.println(s27.endsWith("abc"));
		System.out.println();

		String s28 = "hari krishna";
		System.out.println(s28.length());
		System.out.println(s28.charAt(1));
		System.out.println(s28.charAt(11));
		//System.out.println(s28.charAt(12));
		System.out.println(s28.charAt(0));
		//System.out.println(s28.charAt(-5));
		System.out.println();

		//for(int i=0; i<=s28.length(); i++) {
		//for(int i=0; i<s28.length()-1; i++) {
		for(int i=0; i<s28.length(); i++) {
			System.out.println(s28.charAt(i));
		}

		//for each loop/enhanced for loop on string
		//for(char ch : s28) {
		//	System.out.println(ch);
		//}

		System.out.println(s28.substring(5));
		System.out.println(s28.substring(5, 9));
		System.out.println(s28.substring(5, 10));
		System.out.println(s28.subSequence(5, 10));
		//System.out.println(s28.subSequence(-5, 10));
		//System.out.println(s28.subSequence(5, -10));
		System.out.println(s28.subSequence(5, 12));
		//System.out.println(s28.subSequence(5, 13));
		System.out.println(s28.subSequence(5, 5));  //empty string will display
		System.out.println(s28.subSequence(5, 5).equals(""));
		System.out.println(s28.subSequence(5, 5).isEmpty());
		System.out.println(((String) s28.subSequence(5, 5)).isBlank());
		System.out.println();
		/*		
		//Program 14
		System.out.print("Enter a string: ");
		String s29 = sc.nextLine();
		String s30 = s29.toLowerCase();
		int start = s30.indexOf("hari");
		if(start!=-1) {
			int end = start + 4;
			String hari = s29.substring(start,end);
			System.out.println(hari+" is available");
		}
		else {
			System.out.println("hari is not available");
		}

		String s31 = "hari;balayya;pavankalyan";
		String[] sa1 = s31.split(";");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("a");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("A");  //if character is not matched, complete string return as one token
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("hari;kalyan;ballaya");  //if the given delimiter is equals to complete string, it returns 0 tokens array
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("h");  //if left token is not there, but right token is there, empty string is added as token
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("n");  //if right token is not there, nothing is added as token
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		s31 = "abc abc abc bbc";
		sa1 = s31.split("a");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("c");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("abc");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split(" abc");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split(" ");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		s31 = "aaaaaaa";
		sa1 = s31.split("a");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		s31 = "aaaaaaab";
		sa1 = s31.split("a");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		s31 = "abc.txt";
		sa1 = s31.split(".");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("\\.");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		s31 = "a1d2c3e4";
		sa1 = s31.split("[abc]");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("[123]");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("[a-z]");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		sa1 = s31.split("[0-9]");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		s31 = "abc";
		sa1 = s31.split("");
		System.out.println(sa1.length);
		System.out.println(java.util.Arrays.toString(sa1));
		System.out.println();

		String wel = "\"Welcome to Naresh IT 'Java Course'\"";
		System.out.println(wel);
		System.out.println();

		System.out.print("Enter a String: ");
		String s32 = sc.nextLine();
		String s33 = reverseWords(s32);
		System.out.println("Original String : "+s32);
		System.out.println("Reverse String : "+s33);
		System.out.println();

		//StringBuilder sb = new StringBuilder(s32);
		//System.out.println(sb.reverse());
		String s34 = reverseChars(s32);
		System.out.println("Reverse String: "+s34);

		if(s32.equals(s34)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		System.out.println();

		String s35 = "Java Hari Krishna NIT Ameerpet";
		//StringTokenizer st = new StringTokenizer(s35);
		//StringTokenizer st = new StringTokenizer(s35,"r");
		StringTokenizer st = new StringTokenizer(s35,"r",true);
		System.out.println(st.countTokens());

		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

		String s36 = "abc";
		char[] ch = s36.toCharArray();
		byte[] b = s36.getBytes();
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(b));
		System.out.println();

		//m1(s36);
		//m1((char[])s36);
		//m2(s36);
		//m2((byte[])s36);

		m1(s36.toCharArray());
		m2(s36.getBytes());

		 */
		//Develop a program to find length of the string
		//without using predefined method
		String s37 = "abc";

		//Approach #1: by using pre-defined method length()
		System.out.println(s37.length());

		//Approach #2: by using charAt()
		int count = 0;
		try {
			while(true){
				s37.charAt(++count);
			}
		}catch(Exception e) {}
		System.out.println(count);

		//Approach #3: by using split()
		String[] chars = s37.split("");
		System.out.println(chars.length);

		//Approach #4: by using toCharArray
		char[] ch1 = s37.toCharArray();
		System.out.println(ch1.length);

		//Approach #5: by using getBytes()
		byte[] b1 = s37.getBytes();
		System.out.println(b1.length);

		//Approach #6: by using Reflection API
		Class<?> cls = s37.getClass();
		try {
			Field fld = cls.getDeclaredField("value");
			fld.setAccessible(true);

			byte[] b = (byte[]) fld.get(s37);
			System.out.println(b.length);
		}
		catch(NoSuchFieldException|SecurityException|IllegalArgumentException|IllegalAccessException e) {
			e.printStackTrace();
		}
		
		String str1 = "Hari Krishna Hari NIT hari Hyderbad";
		System.out.println(str1);
		System.out.println(str1.replace('a', 'A'));
		System.out.println(str1.replace("Hari", "HK"));
		System.out.println(str1.replaceAll(".", "*"));
		System.out.println(str1.replaceAll("Hari", "*"));
		System.out.println(str1.replaceAll("[Hari]", "*"));
		System.out.println(str1.replaceFirst("[Hari]", "*"));
		System.out.println(str1.replaceFirst(".", "*"));
		System.out.println(str1.replaceFirst("a", "*"));
	}

	static String reverseWords(String s) {
		String [] words = s.split(" ");
		//String str = "";
		StringBuilder sb = new StringBuilder();

		for(int i=words.length-1; i>=0; i--) {
			//str = str.concat(words[i]+" ");
			sb.append(words[i]);
			sb.append(" ");
		}
		//str = str.trim();
		//return str;
		return sb.toString().trim();
	}

	static String reverseChars(String str) {
		StringBuilder sb = new StringBuilder();

		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	static void m1(char[] ch) {
		System.out.println(Arrays.toString(ch));
	}

	static void m2(byte[] b) {
		System.out.println(Arrays.toString(b));
	}
}