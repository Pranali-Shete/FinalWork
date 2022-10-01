package day7_String_NonPrimitive_data_type;

public class String_lenght_method {

	public static void main(String[] args) {
	
//		length() method
//    	return type of this method is int 
		
		String a="TestNG";
		
		int abc=a.length()-1;
		

		for(int i=abc;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		
		

	}

}
