package com.syntax.class04;

public class task1 {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.6;

		if (diploma) {
			System.out.println("Congratulations");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("Try to get a diploma");
		}

		System.out.println("___________________________");

		double rate = 5;
		double mortgage = 400000;

		if (rate < 4.5) {
			System.out.println("User will consider to buy a house");
			if (mortgage > 200000) {
				System.out.println("User will take a loan");
			} else {
				System.out.println("User will pay cash");
			}

		} else {
			System.out.println("User will not buy a house");
		}

	}

}
