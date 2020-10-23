package com.syntax.ckass05;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int quiz;
		int midTerm;
		int finalTest;
		int finalScore;

		System.out.println("Please type your quiz number");
		quiz = scan.nextInt();
		System.out.println("Please type your midterm");
		midTerm = scan.nextInt();
		System.out.println("Please type your final test");
		finalTest = scan.nextInt();
		
		finalScore = (quiz + midTerm+ finalTest) / 3;
		System.out.println(finalScore);
		if (finalScore >= 90) {
			System.out.println("Your final Score is A");
		}else if (finalScore >= 70 && finalScore < 90) {
			System.out.println("Your final Score is B");
		}else if (finalScore >= 50 && finalScore < 70) {
			System.out.println("Your final Score is C");
		}else
		
			System.out.println("Your final Score is F");

	}

}
