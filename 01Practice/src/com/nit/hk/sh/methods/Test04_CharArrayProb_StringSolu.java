package com.nit.hk.sh.methods;

public class Test04_CharArrayProb_StringSolu {

	public static void main(String[] args) {
		
		char ch[] = {'h','a','r','i'};
		//ch[4] = 'n';
		//ch.xxx();  //no methods
		
		String str = "hari";
		System.out.println(str);
		System.out.println(str.concat("nit"));
		//str.xxxx(); have methods
		System.out.println(str.toUpperCase());
		str = str.concat("nit");
		System.out.println(str.toUpperCase());
	}
}