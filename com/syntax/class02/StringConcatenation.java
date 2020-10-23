package com.syntax.class02;

public class StringConcatenation {
	public static void main(String[] args) {
		
		String name="Olga";
				// I would like to say : My name is Olga
				
				System.out.println("My name is "+name);
				String lastName="Sorrels";
				// I would like to prin Olga Sorrels
				System.out.println(name+lastName);
				//Olga lives in miami
				String city="Miami";
				System.out.println(name +"Lives in "+city);
				//Olga is B student
				char grade='B';
						System.out.println(name+" is "+grade+" student");
				int age=21;
				//olga is 21 years old
				System.out.println(name+" is "+age+" years old");
				
				int date=27 ;
				String month="September";
				System.out.println(date+month);
				String State="DC";
				String anotherState="DC ";
	}

}
