package com.syntax.class10;

public class CountriesTask9 {

	public static void main(String[] args) {
		int africa=54;
		int asia=49;
		int europe=51;
		int NAmerica=23;
		int SAmerica=14;
		int total=0;
		String[][] country={
			{"Argentina", "Bolivia", "Brazil", "Chile"},
			{"Colombia", "Ecuador", "Falkland Islands", "French Guiana"},
			{"Guyana", "Paraguay", "Peru", "Suriname", "Uruguay","Venezuela"},
			{"Antigua","Barbuda","Bahamas"},
			{"Barbados","Belize","Canada","Costa Rica"},
			{"Cuba","Dominica","Dominican Republic", "El Salvador,"},
			{"Grenada","Guatemala","Haiti","Honduras","Jamaica","Mexico"},
			{"Nicaragua","Panama","Saint Kitts","Nevis"},
			{"Saint Lucia","Saint Vincent", "the Grenadines","Trinidad,Tobago","United States of America"}, 
			{"Albania","Andorra","Armenia","Austria","Azerbaijan","Belarus","Belgium","Bosnia","Herzegovina","Bulgaria"},
			{"Croatia","Cyprus","Czechia","Denmark","Estonia","Finland","France","Georgia","Germany","Greece"},
			{"Hungary","Iceland","Ireland","Italy","Kazakhstan","Kosovo","Latvia","Liechtenstein","Lithuania"},
			{"Luxembourg","Malta","Moldova","Monaco","Montenegro","Netherlands","North Macedonia"},
			{"Norway","Poland","Portugal","Romania","Russia","San Marino","Serbia","Slovakia","Slovenia","Spain","Sweden"},
			{"Switzerland","Turkey","Ukraine","United Kingdom ","Vatican City"},
			{"khstan","Kyrgyzstan","Tajikistan","Turkmenistan","Uzbekistan","Eastern Asia","China","China, Hong Kong Special Administrative"},
			{"China, Macao Special Administrative","Democratic People's Republic of Korea","Japan","Mongolia","Republic of Korea","Southern Asia"},
			{"Afghanistan","Bangladesh","Bhutan","India","Iran","Maldives","Nepal","Pakistan","Sri Lanka"},
			{"South-Eastern Asia","Brunei Darussalam","Cambodia","Indonesia","Lao People's Democratic Republic","Malaysia"},
			{"Myanmar","Philippines","Singapore","Thailand","Timor-Leste","Viet Nam"},
			{"Western Asia","Armenia","Azerbaijan","Bahrain","Cyprus","Georgia","Iraq","Israel","Jordan","Kuwait"},
			{"Lebanon","Oman","Qatar","Saudi Arabia","State of Palestine","Syrian Arab Republic","TurkeY","United Arab Emirates","Yeme"},
			{"Algeria","Angola","Benin","Botswana","Burkina Faso","Burundi","Cabo Verde","Cameroon","Central African Republic (CAR)","Chad"},
			{"Comoros","Congo Democratic Republic of the","Congo, Republic of the","Cote d Ivoire","Djibouti","Egypt","Equatorial Guinea"},
			{"Eritrea","Eswatini (formerly Swaziland)","Ethiopia","Gabon","Gambia","Ghana","Guinea","Guinea-Bissau","Kenya","Lesotho","Liberia","Libya"},
			{"Madagascar","Malawi","Mali","Mauritania","Mauritius","Morocco","Mozambique","Namibia","Niger","Nigeria","Rwanda","Sao Tome and Principe"},
			{"Senegal","Seychelles","Sierra Leone","Somalia","South Africa","South Sudan","Sudan","Tanzania","Togo","Tunisia","Uganda","Zambia","Zimbabwe"}
		};
			
		for(int i=0; i<country.length; i++) {
			for(int j=0; j<country[i].length; j++) {
				String cou=country[i][j];
				System.out.println(cou+"  ");
				}
			total=(africa+asia+europe+NAmerica+SAmerica);
			
			System.out.println(" ");
		
		
		}
		System.out.println((country.length));
		System.out.println("The total countries "+total);
		System.out.println("___*******-----------------**********--------------_____");
		String[][] $array = new String[3][4];
		// add values to first row
		$array[0][0] =  ("Argentina, Bolivia, Brazil, Chile, Colombia, Ecuador Falkland Islands, French Guiana, Guyana, Paraguay, Peru, Suriname, Uruguay, Venezuela");
		$array[0][1] = ("Antigua, Barbuda, Bahamas, Barbados, Belize, Canada, Costa Rica,Cuba, Dominica, Dominican Republic, El Salvador, Grenada, Guatemala, Haiti, Honduras, Jamaica, Mexico, Nicaragua, Panama, Saint Kitts, Nevis, Saint Lucia, Saint Vincent, the Grenadines, Trinidad,Tobago, United States of America");
		$array[0][2] = ("Albania, Andorra, Armenia, Austria, Azerbaijan, Belarus, Belgium, Bosnia, Herzegovina, Bulgaria, Croatia, Cyprus, Czechia, Denmark, Estonia, Finland, France, Georgia, Germany, Greece, Hungary, Iceland, Ireland, Italy, Kazakhstan, Kosovo, Latvia, Liechtenstein, Lithuania, Luxembourg, Malta, Moldova, Monaco, Montenegro, Netherlands, North Macedonia, Norway, Poland, Portugal, Romania, Russia, San Marino, Serbia, Slovakia, Slovenia, Spain, Sweden, Switzerland, Turkey, Ukraine, United Kingdom, Vatican City, khstan, Kyrgyzstan, Tajikistan, Turkmenistan, Uzbekistan");
//		$array[0][3] = 'D';
//
//		// 2 row
//		$array[1][0] = 'W';
//		$array[1][1] = 'X';
//		$array[1][2] = 'Y';
//		$array[1][3] = 'Z';
//
//		// 3 row
//		$array[2][0] = 'Q';
//		$array[2][1] = 'W';
//		$array[2][2] = 'B';
//		$array[2][3] = 'R';
		
		System.out.println($array.length);
		
		for (int row=0; row<$array.length; row++) {//loops through rows
			
			for(int col=0; col<$array[row].length; col++) {
				
				System.out.println($array[row][col]+"  ");
			}
			System.out.println();
		}
		
	}}		
		


