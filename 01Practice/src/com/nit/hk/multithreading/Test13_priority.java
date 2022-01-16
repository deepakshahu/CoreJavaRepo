package com.nit.hk.multithreading;

class MyThread13 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(getName()+" run: "+i);
		}
	}
}

public class Test13_priority {

	public static void main(String[] args) {
		MyThread13 mt1 = new MyThread13();
		MyThread13 mt2 = new MyThread13();
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		
		mt1.setPriority(7);
		mt2.setPriority(9);
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		mt1.start();
		mt2.start();
	}
}