package day3_operators_relational;

public class Relational_operator_lessthan {

	public static void main(String[] args) {
/* less than  ( sign of "less than" operator is "<")
		
		Note - Result criteria is boolean ( true or false )		*/
							  
					
		  // Example 1	
					
					int a=100;
					int b=200;
					
					
					System.out.println(a<b); //true
								
							
					System.out.println(b<a); //false
//-----------------------------------------------------------------------------------------------------------------------
					
		  // Example 2	
					
					int c=250;
					int d=250;
							
							
					System.out.println(c<d); //false
										
//-----------------------------------------------------------------------------------------------------------------------						
						
		// Example 3	
					
					int e=250;
				    float f=25.50f;
									
									
					System.out.println(e<f); //false			
//-----------------------------------------------------------------------------------------------------------------------						
					
		// Example 4	
						
					float g=25.50f;
					float h=25.50f;
										
										
					System.out.println(g<h); //false

	}

}
