package day6_String_NonPrimitive_data_type;

public class String_equals_method {

	public static void main(String[] args) {
		/*				
		equals() method
			return type of this method is boolean
			- this method presents inside the java.lang package.
			
		equalsIgnoreCase()
			return type of this method is boolean
			- this method presents inside the java.lang package.
			it will ignore the upper and lower case.			
									
		*/				
						
				String l="selenium";
				String m="Selenium ";
				String n="SELENIUM";
				String o="selenium";
						
				System.out.println(l.equals(m));//false
						
				System.out.println(l.equals(n));//false

				System.out.println(l.equals(o));//true
						
						
				System.out.println(l.equalsIgnoreCase(m));//false
						
				System.out.println(l.equalsIgnoreCase(n));//true
						
				System.out.println(l.equalsIgnoreCase(o));//true
						

	}

}
