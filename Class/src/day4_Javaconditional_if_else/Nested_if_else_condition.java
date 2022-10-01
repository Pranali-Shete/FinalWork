package day4_Javaconditional_if_else;

import java.sql.Date;

public class Nested_if_else_condition {

	public static void main(String[] args) {
		

//----------------------------------------------------------------------------------------------	
	// Mark sheet Data with Name, Father_Name,Last_Name and DOB
	
	
		String Name = "Tushar";
		String F_name = "Bajirao";
		String L_name = "Kadam";
		String Place = "Malegaon";
		int Mar_F = 80,Mar_L = 75;
		int Eng_F = 62,Eng_L = 60;
		int Hin_F = 45,Hin_L = 50;
		int His_F = 77,His_L = 59;
		int Geo_F = 69,Geo_L = 71;
		
		int T_1=Mar_F+Mar_L,T_2=Eng_F+Eng_L,T_3=Hin_F+Hin_L,T_4=His_F+His_L,T_5=Geo_F+Geo_L;
		
		if((Name=="Tushar")&&((F_name=="Bajirao"))&&((L_name=="Kadam"))&&(Place=="Malegaon"))
		{
			System.out.println("Hello,");
			System.out.println("Mr "+Name+",");
			System.out.println("       Your Result is Declared & You Can Check Your Marks Below.");
			System.out.println(" ___________________________________________________       "); 
			System.out.println("| Subject     |  F_Term    |  L_Term     |   Total   |   ");
			System.out.println("|_____________|____________|_____________|___________|   "); 
			System.out.println("| Marathi     |    "+Mar_F+"      |     "+Mar_L+"      |     "+T_1+"   |   ");
			System.out.println("| English     |    "+Eng_F+"      |     "+Eng_L+"      |     "+T_2+"   |   ");
			System.out.println("| Hindi       |    "+Hin_F+"      |     "+Hin_L+"      |     "+T_3+"    |   ");
			System.out.println("| History     |    "+His_F+"      |     "+His_L+"      |     "+T_4+"   |   ");
			System.out.println("| Geography   |    "+Geo_F+"      |     "+Geo_L+"      |     "+T_5+"   |   ");
			System.out.println("|===================================================   |  "); 
			System.out.println("| Total       |    00     |     00    |     00         |  ");
			System.out.println("|___________________________________________________   |  "); 
	
		
		
		
		
		}
		
		
		
		
		
		
		
	

	
	}
}