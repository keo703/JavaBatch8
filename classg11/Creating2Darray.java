package com.syntax.classg11;

public class Creating2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] food= {
				{"Steak", "Hot Dog", "Cheesburger"},
				{"Pizza", "Pasta", "Canoli"},
				{"Sushi","Ramen", "Fried Rice","Dumplings"},
				{"Kebab","Manto"},
				{"Beriyani","Masal","Curry","Chicken tikka Masala"},
		};
		
		for(String[] dishes:food) {
			for(String dish:dishes){
			System.out.print(dish+" ");	
			}
			System.out.println();
			}


		System.out.println();
	}
	
	


}
