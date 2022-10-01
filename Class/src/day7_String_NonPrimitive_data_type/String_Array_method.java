package day7_String_NonPrimitive_data_type;

public class String_Array_method {

	public static void main(String[] args) {
/*		Array:
			in java array is an object that hold fixed number of value of single data type.
			-length of array is established when array is created.
			- array is length fixed
			- index start with zero position.

		syntax:
			datatype [] arrayname =new datatype[size];
*/	
		
		int [] abc =new int[5];
		
		abc[0]=10;
		abc[1]=20;
		abc[2]=30;
		abc[3]=40;
		abc[4]=50;	
		System.out.println(abc[2]);
			
//--------------------------------------------------------------------------------		
String [] xyz =new String[5];
		
		xyz[0]="selenium";
		xyz[1]="TestNG";
		xyz[2]="cucumber";
		xyz[3]="POM";
		xyz[4]="BDD Framework";
		
		System.out.println(xyz.length);
		
		System.out.println(xyz[4]);
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(xyz[i]);
		}
		
//------------------------------------------------------------------------------
float [] pqr =new float[4];
		
		pqr[0]=10.45f;
		pqr[1]=34.55f;
		pqr[2]=3556.445f;
		pqr[3]=45.45f;
		
		for(int i=0;i<4;i++)
		{
			System.out.println(pqr[i]);
		}
		
//--------------------------------------------------------------------------------		
		String[] mno = new String[5];

		mno[0] = "Rest Assured";
		mno[1] = "JDBC";
		mno[2] = "github";
		mno[3] = "jenkins";
		mno[4] = "pune";

		for (int i = 0; i < 5; i++) 
		{
			System.out.println(mno[i]);		
		}
		
	}

}
