package com.nit.hk.multithreading;

class MyThread14 extends Thread{
	MyThread14(){
		super();
	}
	
	MyThread14(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(getName()+" run "+i);
		}
	}
}

public class Test14_setName {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		MyThread14 mt1 = new MyThread14();
		MyThread14 mt2 = new MyThread14("Child2");
		
		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());
		System.out.println("mt2 name: "+mt2.getName());
		System.out.println("mt2 priority: "+mt2.getPriority());
		
		mt1.setName("Child1");
		
		mt1.setPriority(6);
		mt2.setPriority(9);
		
		System.out.println("\nmt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());
		System.out.println("mt2 name: "+mt2.getName());
		System.out.println("mt2 priority: "+mt2.getPriority());
		
		mt1.start();
		mt2.start();
		
		System.out.println("Main End");
	}
}