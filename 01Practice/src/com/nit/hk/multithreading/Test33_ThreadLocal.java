package com.nit.hk.multithreading;

/*//Different classes and interface given as part Thread API
1) Runnable -> It is functional interface. It provides one AM to implement logic to 
execute in custom thread
2) Thread
3) ThreadGroup
4) ThreadLocal
 */
public class Test33_ThreadLocal {

	public static void main(String[] args) {
		
		ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
		
		Thread th1 = new Thread() {
			@Override
			public void run() {
				System.out.println(getName()+" is started");
				threadLocal.set(5);
				try {Thread.sleep(3000);}
				catch(InterruptedException e) {}
				System.out.println(getName()+" is value: "+ threadLocal.get());
				
				try {Thread.sleep(10000);}
				catch(InterruptedException e) {}
				System.out.println(getName()+" is value: "+ threadLocal.get());
				
				System.out.println(getName()+" is end");
			}
		};
		
		Thread th2 = new Thread() {
			@Override
			public void run() {
				System.out.println(getName()+" is started");
				System.out.println(getName()+" is value: "+ threadLocal.get());
				try {Thread.sleep(2000);}
				catch(InterruptedException e) {}
				threadLocal.set(9);
				try {Thread.sleep(5000);}
				catch(InterruptedException e) {}
				System.out.println(getName()+" is value: "+ threadLocal.get());
				threadLocal.remove();
				System.out.println(getName()+" is end");
			}
		};
		th1.start();
		th2.start();
	}
}