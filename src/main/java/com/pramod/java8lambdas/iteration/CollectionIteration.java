package com.pramod.java8lambdas.iteration;

import java.util.Arrays;
import java.util.List;

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
		
	}

}
