package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Collection;

public class Test02_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Object> al1 = new ArrayList<>();
		System.out.println(al1.size());
		System.out.println(al1);
		System.out.println();
		
		al1.add("a");
		al1.add("b");
		al1.add(5);
		al1.add(6.7);
		al1.add('p');
		al1.add(true);
		al1.add(null);
		al1.add("a");
		al1.add(5);
		al1.add(6.7);
		al1.add(true);
		al1.add(11);
		al1.add(new A(7,8));
		al1.add(new A(7,8));
		System.out.println(al1);
		System.out.println(al1.size());
		System.out.println(al1.get(3));
		System.out.println();
		
		System.out.println(al1.contains("a"));
		System.out.println(al1.contains(new String("a")));
		System.out.println(al1.contains("A"));
		System.out.println();
		
		System.out.println(al1);
		System.out.print(al1.remove("a")+"  ");
		System.out.println(al1);
		System.out.print(al1.remove(new String("a"))+"  ");
		System.out.println(al1);
		System.out.print(al1.remove("A")+" ");
		System.out.println(al1);
		
		//System.out.print(al1.remove(11)+"  ");
		//System.out.println(al1);
		System.out.print(al1.remove((Integer)11)+"  ");
		System.out.println(al1);
		System.out.print(al1.remove(6.7)+"  ");
		System.out.println(al1);
		//System.out.print(al1.remove('p')+"  ");
		System.out.print(al1.remove((Character)'p')+"  ");
		System.out.println(al1);
		System.out.println();
		
		System.out.println(al1.contains(new A(7,8))+" ");
		System.out.print(al1.remove(new A(7,8))+"  ");
		System.out.println(al1);
		System.out.println();
		
		System.out.println(al1.contains(null)+" ");
		System.out.print(al1.remove(null)+"  ");
		System.out.println(al1);
		System.out.println();
		
		Collection<Object> c = new ArrayList<>();
		c.add(true);
		System.out.print(al1.removeAll(c)+"  ");
		System.out.println(al1);
		
		ArrayList<Object> al2 = new ArrayList<>(al1);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println();
	
		al2.add(10);
		al2.add(11);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println();
		
		ArrayList<Object> al3 = new ArrayList<>(5);
		al3.add(9);
		al3.add(10);
		al3.add(11);
		System.out.println(al3.size());
		System.out.println(al3);
		System.out.println();
		
		ArrayList<Object> al5 = new ArrayList<>(2);
		System.out.println(al5.size());
		System.out.println(al5);
		System.out.println();

		al5.add(5);
		al5.add(6);
		al5.add(8);

		System.out.println(al5.size());
		System.out.println(al5);
		System.out.println();
		
		//ArrayList<Object> al6 = new ArrayList<>(null);
		//ArrayList<Object> al7 = new ArrayList<>(-5);
		ArrayList<Object> al8 = new ArrayList<>();
		al8.addAll(al5);
		System.out.println(al8);
		System.out.println();
		
		al8.add(2, 7);
		System.out.println(al8);
		System.out.println();
		
		al8.addAll(4, al3);
		System.out.println(al8);
		System.out.println();
		
		al3.clear();
		System.out.println(al3);
		System.out.println();
		
		System.out.println(al8.containsAll(al5));
		System.out.println();
		
		al8.ensureCapacity(20);
		System.out.println(al8.equals(al5));
		System.out.println();
		
		al8.forEach(System.out::println);
		System.out.println();
		
		System.out.println(al8.get(4));
		System.out.println();
		
		System.out.println(al8.getClass());
		System.out.println();
		
		System.out.println(al8.hashCode());
		System.out.println();
		
		al8.trimToSize();
		System.out.println(al8);
	}
}