package com.nit.hk.multithreading;

class AddThread extends Thread{
	@Override
	public void run() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println("Summation: "+i);
		}
	}
}

class SubThread extends Thread{
	@Override
	public void run() {
		int diff = 0;
		for(int i = 1; i <= 10; i++) {
			diff = diff - i;
			System.out.println("Subtraction: "+i);
		}
	}
}

public class Test07_TC13 {

	public static void main(String[] args) {
		AddThread adt = new AddThread();
		SubThread ast = new SubThread();
		
		adt.start();
		ast.start();
	}
}