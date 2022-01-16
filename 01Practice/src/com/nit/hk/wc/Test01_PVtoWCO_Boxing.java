package com.nit.hk.wc;

public class Test01_PVtoWCO_Boxing {

	public static void main(String[] args) {

		Integer io1 = new Integer(5);
		Double do1 = new Double(10.2);
		Character co1 = new Character('a');
		Boolean bo1 = new Boolean(true);

		System.out.println(io1);
		System.out.println(do1);
		System.out.println(co1);
		System.out.println(bo1);

		//Byte b1 = new Byte(5);
		Byte b2 = new Byte((byte) 5);
		byte b3 = 10;
		Byte b4 = new Byte(b3);

		//Short s1 = new Short(5);
		Short s2 = new Short((short)15);
		Short s3 = 20;
		Short s4 = new Short(s3);

		Long l1 = new Long(25);
		Float f1 = new Float(10.5f);

		Byte by1 = Byte.valueOf((byte)5);
		Short sh1 = Short.valueOf((short)5);
		Integer in1 = Integer.valueOf(5);
		Long lo1 = Long.valueOf(5L);
		//Float fo1 = Float.valueOf(10.5);
		Float fo1 = Float.valueOf(10.5F);
		Double d1 = Double.valueOf(10.5);

		System.out.println();
		Integer io5 = new Integer(7);
		Integer io6 = new Integer(7);
		System.out.println(io5==io6);

		//cache-->object pooling is applied
		Integer io7 = Integer.valueOf(9);
		Integer io8 = Integer.valueOf(9);
		System.out.println(io7==io8);

		//cache-->object pooling is applied
		Integer io9 = Integer.valueOf(190);
		Integer io10 = Integer.valueOf(190);
		System.out.println(io9==io10);
		
		Integer io11 = new Integer(10);
		Integer io12 = Integer.valueOf(10);
		System.out.println(io11==io12);
		System.out.println();
		
	}
}