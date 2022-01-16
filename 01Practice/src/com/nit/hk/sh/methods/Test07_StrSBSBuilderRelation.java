package com.nit.hk.sh.methods;

public class Test07_StrSBSBuilderRelation {

	public static void main(String[] args) {

		String str = "Hari";
		//StringBuffer sb1 = "Hari";
		//StringBuilder sb2 = "Hari";

		StringBuffer sb3 = new StringBuffer("Hari");
		StringBuilder sb4 = new StringBuilder("Hari");

		System.out.println(str);
		System.out.println(sb3);
		System.out.println(sb4);

		CharSequence cs1 = "NiT";
		CharSequence cs2 = new StringBuffer("NiT");
		CharSequence cs3 = new StringBuilder("NiT");

		System.out.println();
		System.out.println(cs1);
		System.out.println(cs2);
		System.out.println(cs3);
		System.out.println();

		//static void m1(String s) {}
		//static void m1(StringBuffer sb) {}
		//static void m1(StringBuilder sb) {}

		m1(str);
		m1(sb3);
		m1(sb4);
	}
	static void m1(CharSequence cs) {
		System.out.println(cs);
	}
}