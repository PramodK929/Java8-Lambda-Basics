package com.pramod.lambda8;

public class Greeter {
	
	// Java7 style
	public void greet() {
		System.out.println("Hello world!");
	}
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		
		// Java7 style
		Greeter greet = new Greeter();
		HelloWorldGreet helloWorldGreet = new HelloWorldGreet();
		greet.greet();
		greet.greet(helloWorldGreet);
		
		
		// Java8 Lambdas
		Greeting greet1 = () -> System.out.println("Hello world from java 8 Lambdas...");
		greet1.perform();
		Stringlength stringlength = (s) -> s.length();  
		System.out.println(stringlength.getLength("pramod"));
	}

}

interface Stringlength {
	int getLength(String s); 
}
