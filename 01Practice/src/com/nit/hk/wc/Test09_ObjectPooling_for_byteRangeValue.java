package com.nit.hk.wc;

public class Test09_ObjectPooling_for_byteRangeValue {

	public static void main(String[] args) {
		
		//Does this pooling applied to all WC?
		//No-->For Float and Double pooling is not applied
		//Yes-->For Byte, Short, Integer, Long, Character pooling is applied up to byte range value
		//Yes-->For Boolean class also pooling is applied
		
		Byte bt1 = Byte.valueOf((byte)5);
		Byte bt2 = Byte.valueOf((byte)5);
		System.out.println(bt1 == bt2);
		
		Short st1 = Short.valueOf((short)5);
		Short st2 = Short.valueOf((short)5);
		System.out.println(st1 == st2);
		
		Integer it1 = Integer.valueOf(5);
		Integer it2 = Integer.valueOf(5);
		System.out.println(it1 == it2);
		
		Long lt1 = Long.valueOf((short)5);
		Long lt2 = Long.valueOf((short)5);
		System.out.println(lt1 == lt2);
		
		Float ft1 = Float.valueOf(5);
		Float ft2 = Float.valueOf(5);
		System.out.println(ft1 == ft2);
		
		Double dt1 = Double.valueOf(5);
		Double dt2 = Double.valueOf(5);
		System.out.println(dt1 == dt2);
		
		Character ct1 = Character.valueOf('A');
		Character ct2 = Character.valueOf('A');
		System.out.println(ct1 == ct2);
		
		Boolean bot1 = Boolean.valueOf(true);
		Boolean bot2 = Boolean.valueOf(true);
		System.out.println(bot1 == bot2);
		
		System.out.println();
		bt1 = Byte.valueOf((byte)150);
		bt2 = Byte.valueOf((byte)150);
		System.out.println(bt1 == bt2);
		
		st1 = Short.valueOf((short)150);
		st2 = Short.valueOf((short)150);
		System.out.println(st1 == st2);
		
		it1 = Integer.valueOf(150);
		it2 = Integer.valueOf(150);
		System.out.println(it1 == it2);
	}
}