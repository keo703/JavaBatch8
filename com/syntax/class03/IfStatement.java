package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		int num1=180;
		int num2=900;
		System.out.println("writting my first if statement");
		
		if(num1>num2) {
			System.out.println("num1 is bigger than num2");
		}
		
		System.out.println("End of if statment");
		System.out.println("_____________");
		
		int temp=60;
		if(temp>=60) {
			System.out.println("I am going to the beach");
		}else {
			System.out.println("I will go for a walk");}
		
		
		
		System.out.println("______________________");
		
		double expectedHours=15;
		double actualHours=2;
		
		if(actualHours>=expectedHours) {
			System.out.println("You will love the course and you will succeed");
		}else {
			System.out.println("Course will be to hard for you!!");
		}
	}

}
