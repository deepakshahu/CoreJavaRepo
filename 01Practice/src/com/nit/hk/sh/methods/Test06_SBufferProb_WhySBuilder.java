package com.nit.hk.sh.methods;

public class Test06_SBufferProb_WhySBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();
		
		long time1, time2;
		
		time1 = System.nanoTime();
		for(int i = 1; i<1000000; i++) {
			sb1.append(new Integer(i));
		}
		time2 = System.nanoTime();
		System.out.println(time2-time1);
		
		time1 = System.nanoTime();
		for(int i = 1; i<1000000; i++) {
			sb2.append(new Integer(i));
		}
		time2 = System.nanoTime();
		System.out.println(time2-time1);
	}
}