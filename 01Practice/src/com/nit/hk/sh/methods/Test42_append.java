package com.nit.hk.sh.methods;
//public StringBuffer append(xxx val)
public class Test42_append {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println("SB capacity :: "+sb.capacity());
		System.out.println("SB length :: "+sb.length());
		System.out.println("SB chars :: "+sb);
		System.out.println();
		
		sb.append("a");
		System.out.println("SB capacity :: "+sb.capacity());
		System.out.println("SB length :: "+sb.length());
		System.out.println("SB chars :: "+sb);
		System.out.println();
		
		sb.append(10);
		System.out.println("SB capacity :: "+sb.capacity());
		System.out.println("SB length :: "+sb.length());
		System.out.println("SB chars :: "+sb);
		System.out.println();
		
		Pqr p1 = new Pqr();
		sb.append(p1);
		System.out.println("SB capacity :: "+sb.capacity());
		System.out.println("SB length :: "+sb.length());
		System.out.println("SB chars :: "+sb);
		System.out.println();
		
		//sb.append(null);
		
		sb.append((String)null);
		System.out.println("SB capacity :: "+sb.capacity());
		System.out.println("SB length :: "+sb.length());
		System.out.println("SB chars :: "+sb);
		System.out.println();
		
		//sb.append((char[])null);
		
		StringBuffer sb3 = new StringBuffer();
		for(int i = 1; i<=20; i++) {
			sb3.append(i);
		}
		System.out.println("SB capacity :: "+sb3.capacity());
		System.out.println("SB length :: "+sb3.length());
		System.out.println("SB chars :: "+sb3);
		System.out.println();
	}
}

class Pqr{
	@Override
	public String toString() {
		return "Hi";
	}
}