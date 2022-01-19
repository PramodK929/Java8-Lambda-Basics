package com.pramod.java8lambdas.builtinterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class BuiltInFunctionalInterfaces {
	public static void main(String args[]) {
		Consumer<String> printThisConsumer = (msg) -> System.out.print(msg); 
		printThisConsumer.accept("pramod");
		
		System.out.println();
		
		BiConsumer<String, String> concBiConsumer = (s1, s2) -> System.out.println(s1.concat(s2));
		concBiConsumer.accept("pramod", " kumar");
		
		System.out.println();
		
		Predicate<Integer> elegiblePredicate = (age) -> age >= 18;
		System.out.print(elegiblePredicate.test(18));
		
		System.out.println();
		
		BiPredicate<Integer, Integer> checkGreaterBiPredicate = (a, b) -> a > b;
		boolean greaterValue = checkGreaterBiPredicate.test(25, 26);
		System.out.println(greaterValue);
		
		Supplier<Integer> checkSupplier = () -> 10 * 10;
		System.out.println(checkSupplier.get());
		
		System.out.println();
		
	}
}
