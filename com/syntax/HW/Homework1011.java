package com.syntax.HW;

import java.util.Scanner;

public class Homework1011 {

	public static void main(String[] args) {
		

				double x, y, z, largestNum;
				Scanner scan;
				scan = new Scanner(System.in);


				System.out.println("Please enter 3 different double value");
				x = scan.nextDouble();
				y = scan.nextDouble();
				z = scan.nextDouble();

				if (x > y && x > z) {
					largestNum = x;
				} else if (y > x && y > z) {
					largestNum = y;
				} else {
					largestNum = z;

				}
					System.out.println("Largest value is "+largestNum);
					
					System.out.println("++++++++++NEXTHW+++++++++++++");
					
					System.out.println("Please enter 3 different");
					
				
				int p1, p2, p3, num1;
				p1 = scan.nextInt();
				p2 = scan.nextInt();
				p3 = scan.nextInt();
				
				if (p1>p2) {
					
				}if (p1>p3) {
				  num1=p1;
				}else if(p2>p3){
					num1= p2;
				}else {
					num1=p3;
				} System.out.println("Largest number is "+num1);

	}

}
