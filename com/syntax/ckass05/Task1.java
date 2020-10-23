package com.syntax.ckass05;

import java.util.Scanner;

public class Task1 {
 public static void main(String[] args) {
	 int worked;
	 int salary;
	 Scanner scan;
	 scan = new Scanner(System.in);
	 System.out.println("Please enter how many years worked");
	 worked= scan.nextInt();
	 System.out.println("Please enter your salary");
	 salary= scan.nextInt();
	 if (worked>=5) {
		System.out.println("You are eligible for bonus");
	
	 if (salary>50000) {
		 System.out.println("Your bonus is 5000");
	 }else {
		 System.out.println("Your bonus is 3000");
	 }
 }else {
	 System.out.println("You are not eligible for bonus");
 }
	 
 }
}
