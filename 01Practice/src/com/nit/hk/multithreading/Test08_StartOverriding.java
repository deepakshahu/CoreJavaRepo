package com.nit.hk.multithreading;

class MyThread8 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Run Executed");
	}
	
	@Override
	public void start() {
		System.out.println("Start Executed");
		super.start();
	}
}

public class Test08_StartOverriding {

	public static void main(String[] args) {
		
		MyThread8 mt = new MyThread8();
		mt.start();
		
		System.out.println("Main Executed");
	}
}