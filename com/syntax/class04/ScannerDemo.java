package com.syntax.class04;

import java.util.Scanner;
 //shortcut to import Ctr+shift+o

public class ScannerDemo {

	public static void main(String[] args) {
		
		int num=80;
		String str="I am a String";
		Scanner scan=new Scanner(System.in);//enable input to the console
		System.out.println("Please enter any text");
		String value=scan.nextLine(); //waits for your input once you provide input-->hit Enter button
		
		System.out.println("I captured value = "+value);
		
		System.out.println("Please enter Name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
		
	}

}
