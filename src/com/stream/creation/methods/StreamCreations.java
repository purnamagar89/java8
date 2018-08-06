package com.stream.creation.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreations {

	public static void main(String[] args) {
		
		List<String> students = new ArrayList<String>(
				Arrays.asList(			
						new String("string1"),
						new String("string2"),
						new String("string3"),
						new String("string4")
						)
				
				);
	
		Stream<String> stream1 = students.stream();
		Stream <String> stream2 = Stream.generate(() -> "one");
		Stream <Integer> stream3 = Stream.of(1,2,3,4,5,6);
		Stream <Integer> stream4 = Stream.iterate(1, i -> i+1);
		IntStream stream5 = ThreadLocalRandom.current().ints();
		
		stream1.forEach(System.out::println);
		stream2.limit(3).forEach(System.out::println);
		stream3.forEach(System.out::println);
		stream4.limit(5).forEach(System.out::println);
		stream5.limit(5).forEach(System.out::println);

	}

}
