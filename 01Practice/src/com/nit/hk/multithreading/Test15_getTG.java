//public ThreadGroup getThreadGroup()

package com.nit.hk.multithreading;

public class Test15_getTG {

	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		System.out.println(th1.getThreadGroup());
		System.out.println(th1.getThreadGroup().getName());
		System.out.println();
		
		ThreadGroup tg1 = new ThreadGroup("Group A");
		Thread th2 = new Thread(tg1,"Child1");
		System.out.println(th2.getThreadGroup());
		System.out.println(th2.getThreadGroup().getName());
		System.out.println();
		
		System.out.println(th2.getName());
		System.out.println(th2.currentThread().getName());
		System.out.println(th2.getThreadGroup().getName());
		System.out.println();
		
		System.out.println(th1.getName());
		System.out.println(th1.currentThread().getName());
		System.out.println(th1.getThreadGroup().getName());
		System.out.println();
		
		Thread th3 = Thread.currentThread();
		System.out.println(th3.getName());
		System.out.println(th3.currentThread().getName());
		System.out.println(th3.getThreadGroup().getName());
	}
}