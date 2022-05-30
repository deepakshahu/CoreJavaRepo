package com.nit.hk.suncollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class Test01_Vector {
	public static void main(String[] args) {
		/*
		Vector<Integer> v1 = new Vector<>();
		v1.add(5);
		v1.add(7);
		v1.add(9);
		v1.add(5);
		v1.add(7);
		System.out.println(v1);

		Vector<Integer> v2 = new Vector<>();
		v2.add(25);
		v2.addAll(v1);
		v2.add(35);
		System.out.println(v2);

		Vector<String> v3 = new Vector<>();
		// v3.addAll(v1);

		System.out.println(v1.contains(5));
		System.out.println(v1.contains(8));
		System.out.println(v2.contains(v1));
		System.out.println(v2.containsAll(v1));
		System.out.println();
		
		System.out.println(v1);
		System.out.println(v1.remove(1));
		System.out.println(v1);
		
		System.out.println(v2);
		//System.out.println(v2.removeAll(v1));
		System.out.println(v2.retainAll(v1));
		System.out.println(v2);
		
		System.out.println(v1.size());
		System.out.println(v2.size());
		
		v1.clear();
		System.out.println(v1);
		
		Object[] obj = v2.toArray();
		System.out.println(obj.length);
		System.out.println(Arrays.toString(obj));
		
		Integer[] ia = new Integer[v2.size()];
		v2.toArray(ia);
		System.out.println(Arrays.toString(ia));
		*/
		Vector<Object> v1 = new Vector<>();
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println();

		v1.add("a");
		v1.add("b");
		v1.add(5);
		v1.add(6.7);
		v1.add('p');
		v1.add(true);
		v1.add("a");
		v1.add(5);
		v1.add(6.7);
		v1.add(true);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println();

		v1.add(11);

		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println();

		v1.add(null);
		v1.add(null);
		v1.add(null);

		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println();

		v1.add(new A(5,6));
		v1.add(new A(5,6));

		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println();

		System.out.println(v1.get(3));
		System.out.println();
		for(int i = 0; i<v1.size(); i++) {
			System.out.print(v1.get(i)+", ");
		}
		System.out.println();

		System.out.println(v1.contains("a"));
		System.out.println(v1.contains(new String("a")));
		System.out.println(v1.contains("A"));
		System.out.println();

		System.out.println(v1);
		System.out.print(v1.remove("a")+"  ");
		System.out.println(v1);
		System.out.print(v1.remove(new String("a"))+"  ");
		System.out.println(v1);
		System.out.print(v1.remove("A")+" ");
		System.out.println(v1);

		System.out.print(v1.remove(11)+"  ");
		System.out.println(v1);
		System.out.print(v1.remove((Integer)11)+"  ");
		System.out.println(v1);
		System.out.print(v1.remove(6.7)+"  ");
		System.out.println(v1);
		//System.out.print(v1.remove('p')+"  ");
		System.out.print(v1.remove((Character)'p')+"  ");
		System.out.println(v1);
		System.out.println();

		System.out.println(v1.contains(new A(5,6))+" ");
		System.out.print(v1.remove(new A(5,6))+"  ");
		System.out.println(v1);

		System.out.println();

		System.out.println(v1.contains(null)+" ");
		System.out.print(v1.remove(null)+"  ");
		System.out.println(v1);

		Collection<Object> c = new Vector();
		c.add(true);
		System.out.print(v1.removeAll(c)+"  ");
		System.out.println(v1);

		Vector<Object> v2 = new Vector<>(v1);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println();

		v2.add(10);
		v2.add(11);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println();

		Vector<Object> v3 = new Vector<>(5);
		System.out.println(v3.capacity());
		System.out.println(v3.size());
		System.out.println(v3);
		System.out.println();

		Vector<Object> v4 = new Vector<>(3,2);
		System.out.println(v4.capacity());
		System.out.println(v4.size());
		System.out.println(v4);
		System.out.println();

		v4.add(1);
		v4.add(2);
		v4.add(3);
		System.out.println(v4.capacity());
		System.out.println(v4.size());
		System.out.println(v4);
		System.out.println();

		v4.add(4);
		System.out.println(v4.capacity());
		System.out.println(v4.size());
		System.out.println(v4);
		System.out.println();

		Vector<Object> v5 = new Vector<>(2);
		System.out.println(v5.capacity());
		System.out.println(v5.size());
		System.out.println(v5);
		System.out.println();

		v5.add(5);
		v5.add(6);
		v5.add(7);

		System.out.println(v5.capacity());
		System.out.println(v5.size());
		System.out.println(v5);
		System.out.println();

		//Vector<Object> v6 = new Vector<>(null);
		//Vector<Object> v7 = new Vector<>(-5);
		Vector<Object> v8 = new Vector<>(3,-5);
		v8 = new Vector<>(3,0);
		v8.add(1);
		v8.add(2);
		v8.add(3);
		v8.add(4);
		System.out.println(v8.capacity());
		
	}
}