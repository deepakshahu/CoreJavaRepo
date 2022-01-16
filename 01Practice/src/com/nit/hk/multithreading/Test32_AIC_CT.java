package com.nit.hk.multithreading;

/* 3 Approaches the create custom thread and providing logic to execute in custom thread
and their alternative approaches
1) by extending from thread class
2) by implementing from Runnable interface
3) by using executor framework(Executor services/Thread pool)
   either by implementing Callable interface(call())
   or by implementing Runnable interface(run())
   +
4) by using AIC extending from Thread class
5) by using AIC implementing from Runnable interface  
6) by using AIC implementing from Callable interface
   +
7) by using LE implementing from Runnable interface
8) by using LE implementing from Callable interface
   +
9) by using MR/CR implementing from Runnable interface
10) by using MR/CR implementing from Callable interface
 */

//Approach #1: extending from thread class
class MyThread28 extends Thread{
	//some state(SV and NSV)
	//blocks, constructors and
	//some other methods

	@Override
	public void run() {
		System.out.println("run is executed from OC extends from Thread");
	}
}

//Approach #2: implementing from Runnable interface
class MyRunnable3 implements Runnable{
	//some state(SV and NSV)
	//blocks, constructors and
	//some other methods

	@Override
	public void run() {
		System.out.println("run is executed from OC implements from Runnable");
	}
}

public class Test32_AIC_CT {

	public static void main(String[] args) {
		MyThread28 mt = new MyThread28();
		mt.start();

		Thread th1 = new Thread(new MyRunnable3());
		th1.start();

		//Approach #3: AIC extends from Thread class
		Thread th2 = new Thread() {
			//some state(SV and NSV)
			//blocks, constructors and
			//some other methods
			@Override
			public void run() {
				System.out.println("run is executed from AIC extends from Thread");
			}
		};
		th2.start();

		//Approach #4: AIC implements from Runnable interface
		new Thread(  //Thread class object
				new Runnable(){  //Runnable AIC object and passing as arg 
					//to Thread class constructor
					//some state(SV and NSV)
					//blocks, constructors and
					//some other methods
					@Override
					public void run() {
						System.out.println("run is executed from AIC implements Runnable");
					}
				}
				).start();  //calling start method on Thread class object

		//Approach #5: LE implements Runnable interface
		new Thread(
				()->System.out.println("run is executed from LE implements runnable")
				).start();
		
		//Approach #6: MR
		new Thread(A::m1).start();  //static method reference
		new Thread(new A()::m2).start();  //non-static method reference
		new Thread(A::new).start();  //constructor reference	
	}//main
}//class
class A{
	static void m1() {
		System.out.println("run is executed with SM reference");
	}
	void m2() {
		System.out.println("run is executed with NSM refernce");
	}
	A(){
		System.out.println("run is executed with constructor reference");
	}
}