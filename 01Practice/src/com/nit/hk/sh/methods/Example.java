package com.nit.hk.sh.methods;

public class Example {
	private int x;
	public Example(int x) {
		this.x=x;
	}
	
	@Override
	public String toString() {
		//return ""+x;
		//return String.valueOf(x);
		return Integer.toString(x);
	}
}
