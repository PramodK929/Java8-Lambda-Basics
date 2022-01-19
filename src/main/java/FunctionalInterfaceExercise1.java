import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FunctionalInterfaceExercise1 {
	
	public static void printAllPeople(List<Person> list) {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}
	

	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
					new Person(60, "Charles", "Dickens"),
					new Person(42, "Lewis", "Carroll"),
					new Person(51, "Thomas", "Carlyle"),
					new Person(45, "Charlotte", "Bronte"),
					new Person(39, "Mathew", "Arnold")
				);
		
		//	JAVA 7:
			System.out.println("================JAVA 7=====================");
			
			// step1: Sort people list by name
				Collections.sort(people, new Comparator<Person>() {
					@Override
					public int compare(Person o1, Person o2) {
						return o1.getFirstName().compareTo(o1.getFirstName());
					}

				});
				
			// step2: create a method that prints all the elements in the list 
				printAllPeople(people);
				System.out.println("=====================================");
			
			
				// step3: create a method that prints all the people that have last name starts with C
				printAllPeopleConditionally(people, new Condition() {
					@Override
					public boolean test(Person p) {
						return p.getLastName().startsWith("C");
					}
				});
				
		
		//	JAVA 8:
			System.out.println("================JAVA 8=====================");
			// step1: Sort people list by name
			Collections.sort(people, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
				
			// step2: create a method that prints all the elements in the list 
			people.stream().forEach(System.out::println);
				
			// step3: create a method that prints all the people that have last name starts with C
			people.stream().filter((p) -> p.getLastName().startsWith("C"));
				
	}



	private static void printAllPeopleConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
		
	}
}

interface Condition {
	boolean test(Person p);
}