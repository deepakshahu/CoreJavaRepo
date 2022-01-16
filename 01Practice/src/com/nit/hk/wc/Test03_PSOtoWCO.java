package com.nit.hk.wc;

public class Test03_PSOtoWCO {

	public static void main(String[] args) {
		
		//PSO-->WCO
		//"5"-->WCO(5)
		
		//constructor(String)  -->  deprecated in Java 9v
		//valueOf(String) 
		
		Integer io1 = new Integer("5");
		Integer io2 = Integer.valueOf("5");
		
		Integer io3 = Integer.valueOf("9");
		Integer io4 = Integer.valueOf("9");
		System.out.println(io3 == io4);
		
		Integer io5 = Integer.valueOf("190");
		Integer io6 = Integer.valueOf("190");
		System.out.println(io5 == io6);
		
		Integer io7 = new Integer("7");
		Integer io8 = new Integer("7");
		System.out.println(io7 == io8);
		
		//"10.5"-->10.5
		Double do1 = new Double("10.5");
		Double do2 = Double.valueOf("10.5");
		System.out.println(do1);
		System.out.println(do2);
		
		//"a"-->'a'
		//Character co1 = new Character("a");
		
		//"true"-->true
		Boolean bo1 = new Boolean("true");
		Boolean bo2 = Boolean.valueOf("true");
		System.out.println(bo1);
		System.out.println(bo2);
	}
}
