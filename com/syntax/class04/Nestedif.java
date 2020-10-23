package com.syntax.class04;

public class Nestedif {
	public static void main(String[] args) {

		boolean allergy = true;
		boolean petAllergy = true;
		boolean peanutAllergy = false;
		boolean pollenAllergy = false;

		if (allergy) {
			System.out.println("Lets do further check");
			if (petAllergy) {
				System.out.println("Please no cats or dogs in the house");
			} else {
				System.out.println("You dont have any pet allergy");
			}
			if (peanutAllergy) {
				System.out.println("Please avoid peanuts");
			} else {
				System.out.println("No peanut allergy");
			}
			if (pollenAllergy) {
				System.out.println("Avoid being around trees");
			} else {
				System.out.println("You don't have pollen allergy");
			}

		} else {
			System.out.println("You are lucky");
		}

		System.out.println("__________________________________");

		boolean friday = true;
		int date = 4;
		boolean monday = true;
		if (friday) {
			if (date == 13) {
				System.out.println("We are watching a scary movie");
			} else {
				System.out.println("We will watch comedy, action");
			}
		} else {
			if (monday) {
				System.out.println("I am not studying, I am working");
			} else {
				System.out.println("I am studying");
			}
		}
	}
}
