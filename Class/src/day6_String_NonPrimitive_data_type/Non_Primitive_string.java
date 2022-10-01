package day6_String_NonPrimitive_data_type;

public class Non_Primitive_string {

	public static void main(String[] args) {
	
/*
	what is String?
	string a sequence of character which is written in double quote.
	String may have number, special character or alphabets.

	e.g
		"Pune", 	"1234", "pune123" ,"pune@123"

	there are 4 diff ways we can declare the string
	1) String literals
			String a="selenium";
	
	2) by using new keyword
			String obj =new String("TestNG");			//Heap memory

	3) by using StringBuffer
			StringBuffer abc=new StringBuffer("cucumber");		//Heap memory

	4) by using Stringbuilder
			StringBuilder xyz = new Stringbuilder("POM");		//Heap memory

==================================
1) String literals
syntax:
		datatype variablename=value;
	
	
	
			String a="selenium";

	it will store this variable inside the String constant pool memory .

	
method of String
	1)combine the 2 string.	
		
		
*/		
		
		
//=====================================================================================		
		String a="selenium";
		
		String b="testing";
		
		System.out.println(a+b);	
		
//-----------------------------------------------------------------------------------		
	/*	1) concat() method
		return type is String.
	*/	
		
		//String java.lang.String.concat(String str)
				String d="selenium";
				
				String e="testing";
				
				//String f=d.concat(e);
				
				System.out.println(d.concat(e));
	
//-----------------------------------------------------------------------------------		
		
				String g="Selenium";
				
				
				System.out.println(g.concat("Testing"));	
		
		
//-----------------------------------------------------------------------------------		
/*				int + int				 	int
				String + int				String
				int + String				String
				int + int +string			String					
				int + string + int			String
				String + int + int			String	
*/				
		
				System.out.println(10+10);//20
				
				System.out.println(10+10+"selenium");//20selenium
				
				System.out.println(10+"selenium"+10);//10selenium10

				//BODMAS
				System.out.println("selenium"+(10+10));//selenium20
				
				System.out.println("selenium"+10);//selenium10
				
				System.out.println("selenium"+10+10);//selenium1010
		
//---------------------------------------------------------------------------------	
		
		//		String comparison using relational operator		==
		//		String comparison using equals()			.equals()
		//		String comparison using compareTo()			.compareTo()			
				
//----------------------------------------------------------------------------------				
				

				
				
				
				
				
				
				
		
	}

}
