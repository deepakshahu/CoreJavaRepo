package com.nit.hk.multithreading;

public class Test15_CurrentThread {
	
	static {
		System.out.println("SB is running "+Thread.currentThread().getName()+" thread");
	}

	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();
		
		System.out.println("\nMain Thread Details");
		System.out.println(" Name: "+th.getName());
		System.out.println(" Priority: "+th.getPriority());
		
		th.setName("MyCute Main Thread");
		th.setPriority(9);
		
		System.out.println("\n Changed Name: "+th.getName());
		System.out.println(" Changed Priority: "+th.getPriority());
	}
}