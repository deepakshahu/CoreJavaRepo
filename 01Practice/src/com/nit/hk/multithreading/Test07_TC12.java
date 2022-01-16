package com.nit.hk.multithreading;

class BankAccount{
	
	private long accNum;
	private String accHName;
	private double balance;
	
	public BankAccount(long accNum, String accHName, double balance) {
		this.accNum = accNum;
		this.accHName = accHName;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		this.balance = this.balance+amt;
	}
	
	public void withdraw(double amt) {
		this.balance = this.balance-amt;
	}
	
	public void currentBalance() {
		System.out.println(balance);
	}
}

class DepositorThread extends Thread{
	private BankAccount acc;
	private double amt;
	
	public DepositorThread(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}
	
	public void run() {
		acc.deposit(amt);
		System.out.println(acc+" acc balance "+acc.getBalance());
	}
}

class Test07_TC12{
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(1234,"HK",10000);
		BankAccount acc2 = new BankAccount(5678,"BK",20000);
		BankAccount acc3 = new BankAccount(5678,"PK",30000);
		
		System.out.println(acc1+" acc balance: "+acc1.getBalance());
		System.out.println(acc2+" acc balance: "+acc2.getBalance());
		System.out.println(acc3+" acc balance: "+acc3.getBalance());
		
		DepositorThread dt1 = new DepositorThread(acc1,5000);
		DepositorThread dt2 = new DepositorThread(acc2,7000);
		DepositorThread dt3 = new DepositorThread(acc3,9000);
		dt1.start();
		dt2.start();
		dt3.start();
	}
}
