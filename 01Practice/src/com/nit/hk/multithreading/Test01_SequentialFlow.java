package com.nit.hk.multithreading;

public class Test01_SequentialFlow {
	public static void main(String[] args) {
		Example e1 = new Example();
		
		e1.m1();  //task1
		
		e1.m2();  //task2
		
		e1.m3();  //task3
		
	}//main
}//class