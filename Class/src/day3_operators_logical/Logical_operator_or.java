package day3_operators_logical;

public class Logical_operator_or {

	public static void main(String[] args) {
// or( sign of or operator is "||")
		
	/* Note - Result criteria is boolean ( true or false )		
			  
		System.out.println( true ! false );
		System.out.println((100>50)&&(100<190));
					
	*/
					
	// Example 1
			         
			int a=100;
			int b=90;
			int c=80;

	// Normal syntax	

				System.out.println(a>b);	// Ans is True
				System.out.println(a>c);    // Ans is True
				System.out.println(a<c);    // Ans is false
				
	// Now	using || logical operator
					
					
				System.out.println((a>b)||(a<c));	// Ans is true
				
				System.out.println((a<b)||(a>c));	// Ans is true
				
				System.out.println((a<b)||(a<c));	// Ans is false
				
				System.out.println((b<c)||(c>a));	// Ans is false


	}

}
