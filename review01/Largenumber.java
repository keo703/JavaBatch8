package com.syntax.review01;

import java.util.Scanner;

public class Largenumber {

	public static void main(String[] args) {
		
		Scanner userIn= new Scanner(System.in);
		
			  int num1= userIn.nextInt();
			  int num2= userIn.nextInt();
			  int num3= userIn.nextInt();
			  
			  System.out.println("Please put in the numbers");
			  
			  if(num1>num2) { 
			  }if (num2>num3) {
			    System.out.println("Largest number is "+num1);
			  }if (num3>num1) {
				  System.out.println("Largest numerber is "+num2);
			  
			  }else {
			    System.out.println("Largest number is "+num3);
			  }
			
			  
			
	}

}
