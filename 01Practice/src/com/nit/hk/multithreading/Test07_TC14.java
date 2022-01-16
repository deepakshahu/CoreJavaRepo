package com.nit.hk.multithreading;

class BankAcc{
	
	private long accNum;
	private String accHName;
	private double balance;
	
	public BankAcc(long accNum, String accHName, double balance) {
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

class DepositThread extends Thread{
	private BankAccount acc;
	private double amt;
	
	public DepositThread(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}
	@Override
	public void run() {
		acc.deposit(amt);
		System.out.println(acc+" acc balance after deposit "+acc.getBalance());
	}
}

class WithDrawThread extends Thread{
	private BankAccount acc;
	private double amt;
	
	public WithDrawThread(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}
	@Override
	public void run() {
		acc.withdraw(amt);
		System.out.println(acc+" acc balance after withdraw "+acc.getBalance());
	}
}

class Test07_TC14{
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(1234,"HK",10000);
		BankAccount acc2 = new BankAccount(5678,"BK",20000);
		
		System.out.println(acc1+" acc balance: "+acc1.getBalance());
		System.out.println(acc2+" acc balance: "+acc2.getBalance());
		
		DepositThread dt = new DepositThread(acc1,500);
		WithDrawThread wt = new WithDrawThread(acc2,700);
		dt.start();
		wt.start();
	}
}
