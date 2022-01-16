package com.nit.hk.multithreading;

//Step 1: Create a class deriving from runnable interface
//Step 2: implement run() method with the logic you want to execute in custom thread
//Step 3: Create this implementation class object
//Step 4: Create Thread class object by passing this Runnable implementation class object
//        and then call start() method by using this thread class object

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("MyRunnable.run()");		
	}
}

public class Test04_CTC_implementingRunnable {
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		//mr.start();
		
		Thread th = new Thread(mr);
		th.start();
		
		System.out.println("Test04_CTC_implementingRunnable.main()");
	}
}
