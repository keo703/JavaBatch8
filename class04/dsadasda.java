package com.syntax.class04;

public class dsadasda {

	public static void main(String[] args) {
		boolean hasDiploma = false;
		int gpaScore = 4;
		if (hasDiploma == true) { 
			System.out.println("Congrats!");
		} if (gpaScore < 3.5) { // inner if
			System.out.println("You should’ve studied harder");
		} else if (gpaScore >= 3.5) { // inner if
			System.out.println("You’re eligible for scholarship");
		
		} else {
			System.out.println("Go get a gegree!");
		}

	}

}
