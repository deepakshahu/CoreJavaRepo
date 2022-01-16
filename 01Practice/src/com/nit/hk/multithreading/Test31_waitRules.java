package com.nit.hk.multithreading;

class Example2{
	synchronized void m1() throws InterruptedException{
		wait(5000);
		System.out.println("Example2.m1()");
	}
}

public class Test31_waitRules {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main start");
		Example2 e2 = new Example2();
		e2.m1();
		System.out.println("Main end");
	}
}