package com.syntax.class6;

import java.util.Scanner;

public class Taskinclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		char grade;
		scan=new Scanner(System.in);
		String reason;
		System.out.println("Please type your grade");
		grade=scan.next().charAt(0);
		
		switch(grade) {
		case('A'):
			reason= "A-Excellent";
			break;
		case('B'):
			reason= "B-Good";
			break;
		case('C'):
			reason= "C-Average";
			break;
		case('D'):
			reason= "D-Bad";
			break;
		default:
			reason="Not acceptabe";
		}
		System.out.println("Your grade is "+grade+", Grade comment: "+reason);	

		
	}

}
