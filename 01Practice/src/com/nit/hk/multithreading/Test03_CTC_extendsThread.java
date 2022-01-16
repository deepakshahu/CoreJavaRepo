package com.nit.hk.multithreading;

//Step 1: Create a class deriving from Thread class
class MyThread extends Thread{
	//Step 2: Override run() method and add logic you want to execute in custom thread
	@Override
	public void run() {
		System.out.println("MyThread.run()");
	}
}

public class Test03_CTC_extendsThread {
	public static void main(String[] args) {
		
		//Step 3: Create sub class object and call start method by using this sub class object
		MyThread mt = new MyThread();
		mt.start();
		
		System.out.println("Test03_CTC_extendsThread.main()");
	}
}
