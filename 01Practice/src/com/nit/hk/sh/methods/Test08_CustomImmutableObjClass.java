package com.nit.hk.sh.methods;

class Ex1{
	private int x;

	public Ex1(int x) {
		this.x=x;
	}

	public int getX(){
		return x;
	}

	public void modify(int x) {
		this.x=this.x+x;
	}

	@Override
	public String toString() {
		return ""+x;
	}
}

public class Test08_CustomImmutableObjClass {

	public static void main(String[] args) {

		Ex1 e1 = new Ex1(5);
		System.out.println(e1);

		e1.modify(7);
		System.out.println(e1);
		System.out.println();

		Sa s1 = new Sa(5);
		System.out.println(s1);
		
		s1.modify(7);
		System.out.println(s1);
		System.out.println();
		
		Sa s2 = s1.modify(8);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s1 = s1.modify(9);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		final Sa s3 = new Sa(10);  //var is immutable and object is also immutable
		//s3 = new Sa(11);
		
		String st1 = "hari";
		st1 = "nit";
		
		st1.concat("Ameerpet");
		System.out.println(st1);
		
		final String st2 = "Hyd";
		//st2 = "Sec";
	}
}

class Sa{
	private final int x;

	public Sa(int x) {
		this.x=x;
	}

	public Sa modify(int x) {
		return new Sa(this.x+x);
	}

	@Override
	public String toString() {
		return ""+x;
	}
}

class Xyz{
	private final int x;

	public Xyz(int x) {
		this.x=x;
	}

	public int getX() {
		return x;
	}

	@Override
	public String toString() {
		return ""+x;
	} 
}