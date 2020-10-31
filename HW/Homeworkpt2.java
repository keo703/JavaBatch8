package com.syntax.HW;

import java.util.Scanner;

public class Homeworkpt2 {
 public static void main(String[] args) {
	
	 Scanner scan;
	 double sales1,com1;
	 
	 scan= new Scanner(System.in);
	 System.out.println("Please put number of sales");
	 sales1 = scan.nextDouble();
	 
	 if(sales1>=10 && sales1<=100) {
		 com1=(sales1*10)/100;
	 }else if (sales1>=100 && sales1<=200) {
		 com1=(sales1*20)/100;
		 }else if (sales1>=200 && sales1<=500) {
		 com1=(sales1*30)/100;
		 }
		 else if (sales1>=500) {
			 com1=(sales1*50)/100;
		 }else {
		 com1=0;
		 } 
	 System.out.println("You will get "+com1+"commission");
 }
}

