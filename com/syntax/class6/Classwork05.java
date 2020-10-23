package com.syntax.class6;

import java.util.Scanner;

public class Classwork05 {

	public static void main(String[] args) {
		boolean sale;
		Scanner x;
		double price;
		double total;
		double finalprice;
		x=new Scanner(System.in);
		
		System.out.println("Is there a sale at the store");
		sale=x.nextBoolean();
		System.out.println("Please put in the price");
		price=x.nextDouble();
		if (sale) {
			(price>10 || price<50)
			total=price*.1;
		}else if (price>=50 || price<100) {
			total=price*.2;
		}else if (price>100 || price<500) {
			total=price*.4;
		}else if (price>=500) {
			total=price*.5;
		}else {
			total=0;
		
			finalprice=price-total;
			System.out.println("Total discound is " +total+" with the price"+price+" you will pay "+finalprice);
		}
			System.out.println("No shopping");
		}
		
		
		
		
				
	}


