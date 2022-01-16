package com.nit.hk.multithreading;

class MyThread26 extends Thread{
	@Override
	public void run() {
		System.out.println("Run start");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.out.println("IE is raised");
		}
		try {
			Thread.sleep(7000);
		}catch(InterruptedException e) {
			System.out.println("IE is raised");
		}
		System.out.println("Run end");
	}
}

public class Test26_interrupt {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main start");
		MyThread26 mt = new MyThread26();
		mt.interrupt();
		mt.start();
		//mt.interrupt();
		Thread.sleep(2000);
		mt.interrupt();
		Thread.sleep(3000);
		System.out.println("Main end");
	}
}