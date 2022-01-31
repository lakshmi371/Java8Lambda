package com.b.basics;


	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;

	public class Java7 {

		public static void main(String[] args) {
			
			List<Person> people = Arrays.asList(
					new Person("Rose", "Mary", 33),
					new Person("Alice", "Antony", 14),
					new Person("Jasmine", "Jose", 22),
					new Person("Jony", "George", 28)
					);
			
		
			
			Collections.sort(people, new Comparator<Person>() {

				@Override
				public int compare(Person o1, Person o2) {
					return o1.getLastName().compareTo(o2.getFirstName());
				}
			});
			
			
			
			printAll(people);
			
			System.out.println("--------");
			
//			lastName(people);
			System.out.println("---------Last Name Begins with A------");
			printConditionally(people, new Condition(){

				@Override
				public boolean Test(Person p) {
					
					return p.getLastName().startsWith("A");
				}
				
			});
			
			System.out.println("-------------------First Name Begins with M--------------");
			printConditionally(people, new Condition(){

				@Override
				public boolean Test(Person p) {
					
					return p.getFirstName().startsWith("M");
				}
				
			});
		}

//		private static void lastName(List<Person> people) {
//			for(Person p:people){
//				if(p.getLastName().startsWith("A"))
//					System.out.println(p); 
//				
//			}
//			
//		}
		
		private static void printConditionally(List<Person> people,Condition condition) {
			for(Person p:people){
				if(condition.Test(p))
					System.out.println(p); 
				
			}
			
		}

		private static void printAll(List<Person> people) {
			for(Person p: people){
				System.out.println(p);
			}
			
		}
	}

	interface Condition{
		boolean Test(Person p);
	
	}

}
