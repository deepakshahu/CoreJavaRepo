package com.nit.hk.multithreading;

class MyRunnable2 implements Runnable{
	
	public void run() {
		System.out.println("From MyRunnable2.run()");		
	}
}

class MyThread2 extends Thread{
	MyThread2(){
		super();
	}
	
	MyThread2(Runnable target){
		super(target);
	}
	
	@Override
	public void run() {
		System.out.println("From MyThread2.run()");
		super.run();
	}
}

public class Test06_RunExecution {

	public static void main(String[] args) {
/*		
		Thread th1 = new Thread();
		th1.start();
		
		MyThread2 mt = new MyThread2();
		mt.start();
		
		MyRunnable2 mr = new MyRunnable2();
//		mr.start();

		Thread th2 = new Thread(mr);
		th2.start();

		MyThread2 mt2 = new MyThread2();
		Thread th3 = new Thread(mt2);
		th3.start();	

		Thread th4 = new MyThread2();
		th4.start();

		Thread th5 = new MyRunnable2();
		th5.start();

		Runnable r = new MyRunnable2();
//		r.start();
		
		Thread th6 = new Thread(r);
		th6.start();

		MyRunnable2 mr2 = new MyRunnable2();
		MyThread2 mt2 = new MyThread2(mr2);
		mt2.start();

		MyThread2 mt3 = new MyThread2();
		MyThread2 mt4 = new MyThread2(mt3);
		mt4.start();
		
		MyThread2 mt5 = new MyThread2(mt5);
		mt5.start();
*/
		mt6 = new MyThread2(mt6);
		mt6.start();
	}
	static MyThread2 mt6;
}