package com.nit.hk.multithreading;

class MyThread12 extends Thread{
	@Override
	public void run() {
		System.out.println("In Run after start call: "+getState()+" "+isAlive());
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
	}
}

public class Test12_isAlive {

	public static void main(String[] args) throws InterruptedException{

		MyThread12 mt = new MyThread12();
		System.out.println("In Main after object creation: "+mt.getState()+" "+mt.isAlive());
		mt.start();
		System.out.println("In Main after start call: "+mt.getState()+" "+mt.isAlive());
		
		Thread.sleep(2000);
		System.out.println("In Main after start call: "+mt.getState()+" "+mt.isAlive());
		
		Thread.sleep(3000);
		System.out.println("In Main after start call: "+mt.getState()+" "+mt.isAlive());
	}
}