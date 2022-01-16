package com.nit.hk.sh.methods;
//public StringBuffer insert(int index, xxx val)
public class Test44_insert {

	public static void main(String[] args) {
		
		StringBuffer sb2 = new StringBuffer("acef");
		System.out.println("SB chars :: "+sb2);
		
		sb2.insert(1, 'b');
		System.out.println("SB chars :: "+sb2);
		
		sb2.insert(3, 'd');
		System.out.println("SB chars :: "+sb2);
		
		sb2.insert(sb2.length()-1, 'g');
		System.out.println("SB chars :: "+sb2);
		
		sb2.insert(sb2.length(), 'h');
		System.out.println("SB chars :: "+sb2);
		
		//sb2.insert(sb2.length()+1, 'i');
		
		//sb2.insert(5, null);
		
		//sb2.insert(35, "b");
		//sb2.insert(-5, "b");
		
		sb2.insert(0, "b");
		System.out.println("SB chars :: "+sb2);
		System.out.println();
		
		StringBuffer sb3 = new StringBuffer(2);
		sb3.append("ab");
		System.out.println("SB3 capacity :: "+sb3.capacity());
		System.out.println("SB3 length :: "+sb3.length());
		System.out.println("SB3 chars :: "+sb3);
		System.out.println();
		
		sb3.insert(1, 'c');
		System.out.println("SB3 capacity :: "+sb3.capacity());
		System.out.println("SB3 length :: "+sb3.length());
		System.out.println("SB3 chars :: "+sb3);
		System.out.println();
		
		sb3.insert(1, "45678901234567");
		System.out.println("SB3 capacity :: "+sb3.capacity());
		System.out.println("SB3 length :: "+sb3.length());
		System.out.println("SB3 chars :: "+sb3);
		System.out.println();
	}
}