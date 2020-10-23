package com.syntax.review01;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Asghar";
		String pass="pass123";
		double accountBalance=10.25;
		double transferAmount=8;
		boolean transAllowed=true;
		
		if(pass.equals("pass123")) {
			System.out.println("Welcome to Syntax bank "+ name);
			if(transAllowed) {
				System.out.println("Initiating transfer");
				if(transferAmount>accountBalance) {
					System.out.println("Insufficient Balance");
				}else {
					System.out.println("Transfer Complete");
				}
			
			}
	    }else {
			System.out.println("Invalid credentials please try again");
		}

	}

}
