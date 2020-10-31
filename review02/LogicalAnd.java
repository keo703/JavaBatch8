package com.syntax.review02;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		
		if(number>0) {
			if(number<=100) {
				System.out.print("Number is between 0 and 100");
			}else {
			System.out.print("Number not is between 0 and 100");	
			}
		}else {
			System.out.println("Number is not between 0 and 100");
		}
		if(number >= 0 && number <=100) {
			System.out.print("Number is between 0 and 100");
		}else {
			System.out.println("Number is not between 0 and 100");
		}
		}
	}



