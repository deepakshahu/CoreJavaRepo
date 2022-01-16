package com.nit.hk.multithreading;

class MyThread27 extends Thread{
	@Override
	public void run() {
		System.out.println("Run start");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("Run end");
	}
}

public class Test27_join {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main start");
		MyThread27 mt = new MyThread27();
		mt.start();
		
		//mt.join();
		//mt.join(3000);
		//mt.join(7000);
		mt.sleep(7000);
		System.out.println("Main end");
	}
}