package com.nit.hk.multithreading;

class MyThread10 extends Thread{
	private int x;
	MyThread10(int x){
		this.x = x;
	}
	public void run() {
		for(int i = 0; i<=x; i++) {
			System.out.println("Run: "+i);
		}
	}
}

public class Test06_TC11 {

	public static void main(String[] args) {
		MyThread10 mt1 = new MyThread10(10);
		mt1.start();
		
		MyThread10 mt2 = new MyThread10(15);
		mt2.start();
	}
}