package com.nit.hk.cursors;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Retrieving elements by using for each loop
public class Test11_forEachMethod {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al);

		for(String str : al) {
			System.out.println(str.toUpperCase());
		}

		System.out.println();
		//Using anonymous inner class
		al.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});

		System.out.println();
		//Using lambda
		al.forEach((String s)-> {
			System.out.println(s);
		});

		System.out.println();
		al.forEach((String s)->System.out.println(s));

		System.out.println();
		al.forEach(s->System.out.println(s));

		System.out.println();
		al.forEach(System.out::println);

		System.out.println();
		al.forEach(s->System.out.println(s.toUpperCase()));
		System.out.println();
		///////////////////////////////

		Set<String> set = Set.of("a", "b", "c", "d");
		set.forEach(s->System.out.println(s));
		System.out.println();
		set.forEach(System.out::println);
		System.out.println();

		///////////////////////////////
		Map<Integer, String> map = Map.of(1,"a",2,"b");
		map.forEach(new BiConsumer<Integer, String>() {
			@Override
			public void accept(Integer k, String v) {
				System.out.println(k+" "+v);
			}
		});

		System.out.println();

		map.forEach((Integer k, String v)-> {
			System.out.println(k+" "+v);
		});

		System.out.println();

		map.forEach((k, v)->System.out.println(k+" "+v));
	}
}
