package com.b.basics;

public class TypeInterfacee {
	
		public static void main(String[] args) {
			
			printLambda(s->s.length());

		}
		
		public static void printLambda(LambdaStringLength l){
		System.out.println(l.getLength("Hello World"));
		}

		interface LambdaStringLength{
			int getLength(String s);
		}
	}
	

