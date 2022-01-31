package com.b.basics;

public class TypeInterface {



		public static void main(String[] args) {
			
			stringLambda myLambda = s->s.length();
			System.out.println(myLambda.getLength("Hello"));

		}
		
		interface stringLambda{
			int getLength(String s);
		}

	}

