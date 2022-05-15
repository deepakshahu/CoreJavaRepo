package com.nit.hk.cursors;

import java.util.List;
import java.util.stream.Stream;

public class Test12_StreamAPI {

	public static void main(String[] args) {

		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

		//Read and display all values
		list.forEach(System.out::println);
		System.out.println();

		//Read and display only even values by using forEach method
		list.forEach(value->{
			if(value%2 == 0)
				System.out.println(value);
		});
		System.out.println();

		//Read and display only even values by using stream api
		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = stream1.filter(value->value%2 == 0);
		stream2.forEach(System.out::println);
		System.out.println();

		//The above code can be written like below
		list.stream()
		.filter(value->value%2==0)
		.forEach(System.out::println);

		System.out.println();
		//Read and display only even values which are lesser than 5
		list.stream()
		.filter(value -> value%2 == 0)
		.filter(value -> value < 5)
		.forEach(System.out::println);

		list.parallelStream()
		.filter(value -> value%2 == 0)
		.filter(value -> value < 5)
		.forEach(System.out::println);

	}

}
