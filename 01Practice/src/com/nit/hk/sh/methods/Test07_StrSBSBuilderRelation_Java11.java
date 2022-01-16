package com.nit.hk.sh.methods;

import java.util.TreeSet;
import java.util.Comparator;
public class Test07_StrSBSBuilderRelation_Java11 {
	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("a");
		ts1.add("c");
		ts1.add("b");
		System.out.println(ts1);
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add(new StringBuilder("a").toString());
		ts2.add(new StringBuilder("c").toString());
		ts2.add(new StringBuilder("b").toString());
		System.out.println(ts2);
		//Java 1.0 Explicit Sub class
		TreeSet<StringBuilder> ts3 = new TreeSet<>( new SBComparator());
		ts3.add(new StringBuilder("a"));
		ts3.add(new StringBuilder("c"));
		ts3.add(new StringBuilder("b"));
		System.out.println(ts3);
		//Java 1.1 AIC 
		TreeSet<StringBuilder> ts4 = new TreeSet<>( 
				new Comparator<StringBuilder>(){ 
					@Override
					public int compare(StringBuilder sb1, StringBuilder sb2){ 
						return sb1.toString().compareTo(sb2.toString());
					}
				});
		ts4.add(new StringBuilder("p"));
		ts4.add(new StringBuilder("r"));
		ts4.add(new StringBuilder("q"));
		System.out.println(ts4);
		//Java 8 LE
		TreeSet<StringBuilder> ts5 = new TreeSet<>( (sb1, sb2) -> sb2.toString().compareTo(sb1.toString()) );
		ts5.add(new StringBuilder("p"));
		ts5.add(new StringBuilder("r"));
		ts5.add(new StringBuilder("q"));
		System.out.println(ts5);
		//Java 8 MR
		TreeSet<StringBuilder> ts6 = new TreeSet<>( Sample::m1 );
		ts6.add(new StringBuilder("p"));
		ts6.add(new StringBuilder("r"));
		ts6.add(new StringBuilder("q"));
		System.out.println(ts6);
		//Java 11 version onwards SB and SB are made implementing from Comparable 
		//So we can directly add SB and SB objects to TS 
		// not need to taking Comparator help
		TreeSet<StringBuilder> ts7 = new TreeSet<>();
		ts7.add(new StringBuilder("m"));
		ts7.add(new StringBuilder("o"));
		ts7.add(new StringBuilder("n"));
		System.out.println(ts7);
	}
}
class SBComparator implements Comparator<StringBuilder>{
	public int compare(StringBuilder sb1, StringBuilder sb2){
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		return s2.compareTo(s1);
	}
};
class Sample{
	static int  m1(StringBuilder sb1, StringBuilder sb2) {
		return sb1.toString().compareTo(sb2.toString());
	}
};