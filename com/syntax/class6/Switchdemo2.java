package com.syntax.class6;

import java.util.Scanner;

public class Switchdemo2 {

	public static void main(String[] args) {
		Scanner scan;
		String browser;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Pleaser enter a Browser");
		browser=scan.nextLine();
		
		switch(browser) {
			
		case "safari":
			message="Your code will be executed on Safari browser";
			break;
		case "chrome":
			message="Your code will be executed on Chrome browser";
			break;
		case "chrome":
			message="Your code will be executed on Firefox browser";
			break;
		default:
			message="Enetered browser is not supported";
		}
		System.out.println(message);
	}

}
