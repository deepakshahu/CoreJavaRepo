package com.nit.hk.multithreading;

class MyThread11 extends Thread{
	@Override
	public void run() {
		System.out.println("Run Start");
		System.out.println("After start call in run: "+this.getState());
		System.out.println("Run Paused");
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {

		}
		System.out.println("Run Resumed");
		System.out.println("After start call in run: "+this.getState());
		
		System.out.println("Run End");
	}
}

public class Test11_getState {

	public static void main(String[] args) throws InterruptedException{

		MyThread11 mt = new MyThread11();
		System.out.println("After mt Object creation in main: "+mt.getState());
		
		if(mt.getState().equals(Thread.State.NEW)) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Hello");
		}
		
		mt.start();
		System.out.println("After start call in main: "+mt.getState());
		
		Thread.sleep(2000);
		System.out.println("After start call in main: "+mt.getState());
		
		Thread.sleep(2000);
		System.out.println("After start call in main: "+mt.getState());
	}
}