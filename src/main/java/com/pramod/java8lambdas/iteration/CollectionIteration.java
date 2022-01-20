package com.pramod.java8lambdas.iteration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pramod.lambda8.Person;


public class CollectionIteration{

	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person(60, "Charles", "Dickens"),
				new Person(42, "Lewis", "Carroll"),
				new Person(51, "Thomas", "Carlyle"),
				new Person(45, "Charlotte", "Bronte"),
				new Person(39, "Mathew", "Arnold")
			);
		// Java 7
			// method 1 (indexed FOR loop):
			for (int i = 0; i < people.size(); i++) {
				System.out.println(people.get(i));
			}
			// method 2: (forEach Loop)
			for (Person p : people) {
				System.out.println(p.toString());
			}
		// Java 8
			System.out.println("JAVA 8");
			people.forEach(System.out::println);
			
		Map<String, Integer> map = new HashMap<>();
		map.put("Pramod", 5);
		map.put("Praveen", 3);
		map.put("Pradeep", 1);
		map.put("Vinayak", 10);
		map.put("Raj", 19);
		
		// Iterate over map using Java8 Lambdas		
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		
	}

}
