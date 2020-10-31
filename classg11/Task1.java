package com.syntax.classg11;

public class Task1 {

	public static void main(String[] args) {
	
		//Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and 
		//Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.


		String[][] array= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"},
			
		};
		System.out.print(array[0][0]+" "+array[1][0]);
		System.out.print(", ");
		System.out.print(array[0][0]+" "+array[1][3]);
		System.out.print(", ");
		System.out.print(array[0][2]+" "+array[1][2]);
		System.out.print(", ");
		System.out.print(array[0][2]+" "+array[1][1]);
		System.out.println();
		System.out.println("*******************************************");
		
		//Create an array of cars : american, german, korean, italian. And print all values from a 2D array
		String[][] cars= {
				{"American", "German","Ford"}, 
				{"Korean", "Italian","Ferrari"},
				{"Lamborgini","Honda","Toyota"},
		};
		for(int i=0; i<cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
				String car=cars[i][j];
				System.out.print(car+"  ");
				
			}
			System.out.println();
		}
		
		System.out.println("*******************************************");
		
		for(String[] carArray:cars) {
			for(String car:carArray) {
				System.out.println(car+"  ");
				
			}
			
			
			
		}
		
	}

}
