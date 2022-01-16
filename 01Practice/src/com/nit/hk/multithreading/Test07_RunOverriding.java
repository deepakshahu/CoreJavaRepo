package com.nit.hk.multithreading;

class MyThread3 extends Thread{}
//class MyRunnable3 implements Runnable{}
class MyThread4 extends Thread implements Runnable{}

class MyThread5 extends Thread{
	public void run() {
		System.out.println("run no-param");
	}
	
	public void run(String s) {
		System.out.println("run String-param");
	}
}

class MyThread6 extends Thread{
	public void run(String s) {
		System.out.println("run String-param");
	}
}

/*
class MyRunnable4 implements Runnable{
	public void run(String s) {
		System.out.println("run String-param");
	}
}
*/

abstract class MyRunnable5 implements Runnable{
	public void run(String s) {
		System.out.println("run String-param");
	}
}

class MyRunnable6 extends Thread implements Runnable{
	public void run(String s) {
		System.out.println("run String-param");
	}
}

class MyRunnable7 implements Runnable{
	public void run() {
		System.out.println("run no-param");
	}
	
	public void run(String s) {
		System.out.println("run String-param");
	}
}

/*
class MyThread7 extends Thread{
	@Override
	public void run(String s) {
		System.out.println("run String-param");
	}
}
*/

public class Test07_RunOverriding {

	public static void main(String[] args) {
		MyThread5 mt = new MyThread5();
		mt.start();
	}
}