package com.pramod.java8lambdas.builtinterfaces;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambdas {
	
	public static void main(String[] args) {
		int[] arr = {4, 12, 6, 84, 34, 90, 200};
		int  n = 0;
		
		// Java 7
		try {
			for(int a: arr) {
				System.out.println(a/n);
			}
		} catch (ArithmeticException e) {
			System.out.println("Error : "+ e.getMessage());
		}
		
		// Java 8
		process(arr, n, safeDivideBiConsumer((v, k)-> System.out.println(v/k)));
	}

	private static BiConsumer<Integer, Integer> safeDivideBiConsumer(BiConsumer<Integer, Integer> biConsumer) {
		return (v, k) -> {
			try {
				biConsumer.accept(v, k);
			} catch (Exception e) {
				System.out.println("Error : "+ e.getMessage());
			}
		};
	}

	private static void process(int[] arr, int n, BiConsumer<Integer, Integer> consumer) {
		for(int i: arr) {
			consumer.accept(i, n);
		}
	}
}
