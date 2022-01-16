package com.nit.hk.multithreading;

class MyThread15 extends Thread{
	MyThread15(){
		super();
	}

	MyThread15(String name){
		super(name);
	}

	@Override
	public void run() {
		System.out.println("\nRun Start");
		System.out.println("\n"+getName()+" run start with the priority "+getPriority());
		setName("HelloThread");
		setPriority(8);
		System.out.println("\n"+getName()+" run start with the priority "+getPriority());

		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {

		}
		System.out.println("\n"+getName()+" run start with the priority "+getPriority());
	}
}

public class Test14_setName_TC {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Start");

		MyThread15 mt1 = new MyThread15();

		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());

		mt1.setName("Child1");		
		mt1.setPriority(7);

		System.out.println("\nmt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());

		mt1.start();

		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {

		}

		System.out.println("\nmt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());
		
		mt1.setName("HiThread");		
		mt1.setPriority(9);
		
		System.out.println("\nmt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());
		
		try {
			Thread.sleep(7000);
		}
		catch(InterruptedException e) {

		}
		
		mt1.setName("HRU?Thread");		
		mt1.setPriority(10);
		
		System.out.println("\nmt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());

		System.out.println("Main End");
	}
}