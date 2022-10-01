package day7_String_NonPrimitive_data_type;

public class String_enhance_method {

	public static void main(String[] args) {

/*		enhance for loop
		for(data_type variablename:arrayname)
		{
			//statement
		}		
*/		
		
//===================================================================================		
		
		String[] xyz = new String[5];

		xyz[0] = "Rest Assured";
		xyz[1] = "JDBC";
		xyz[2] = "github";
		xyz[3] = "jenkins";
		xyz[4] = "pune";

		for(String abc:xyz)
		{
			System.out.println(abc);
		}		
		
//---------------------------------------------------------------------------------		
		
		String[] pqr = new String[5];

		pqr[0] = "Rest Assured";
		pqr[1] = "JDBC";
		pqr[2] = "github";
		pqr[3] = "jenkins";
		pqr[4] = "pune";

		
		int a=pqr[3].length()-1;
		
		
		for(int i=a;i>=0;i--)
		{
			System.out.print(pqr[3].charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
