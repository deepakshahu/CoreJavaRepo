package com.nit.hk.suncollections;

import java.util.Vector;

public class Test01_Vector {
	public static void main(String[] args) {
		/*		Vector<Integer> v1 = new Vector<>();
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
				System.out.println(v1.remove(9));
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
				System.out.println(Arrays.toString(ia));*/

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
		System.out.println(v1.remove(new A(5,6)));
	}
}