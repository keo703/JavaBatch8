package com.syntax.review01;

import java.util.Scanner;

public class Task11111 {

	public static void main(String[] args) {
		
		  
		  Scanner scan;
		  scan=new Scanner(System.in);
		  
		    System.out.println("Enter your name");
		   String name=scan.toString();
		   String mo=scan.findInLine("\\d{3}[-]\\d{3}[-]\\d{4}");
		    System.out.println("Enter your mobile numer ");
		   int age=scan.nextInt();
		    System.out.println("Enter your age");
		  		    System.out.println(("Your name is ")+name+(" your age is ")+age+(" your mobile number is ")+mo);
	}
}
