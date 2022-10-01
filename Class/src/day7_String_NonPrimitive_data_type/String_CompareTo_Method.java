package day7_String_NonPrimitive_data_type;

public class String_CompareTo_Method {

	public static void main(String[] args) {
		
		
/*	
  String comparsion using compareTo()------>			.compareTo()	
  
	compareTo() method
	result criteria for this method is int
	- this method present inside the java.lang package
	- it will support 3 way comparison.
	
e.g
	if string 1== string 2----->			then result will be zero
	if string 1>  string 2----->			then result will be positive value
	if string 1<  string 2----->			then result will be negative value
	
			
	as per ANSI american national standard institue they define character code.
	
A to Z 	65 to 90
a to z	97 to 122
0 to 9	48 to 57		
*/		
//=====================================================================================		
		String a="abc";
		String b="ABC";
		
	//	97		65
		System.out.println(a.compareTo(b));
		
//-----------------------------------------------------------------------------------		
		String d="abc";
		String e="ABC";
		String f="abc";
		String g="abC";
		
	
		System.out.println(d.compareTo(e));
		
		System.out.println(d.compareTo(f));
		
		System.out.println(d.compareTo(d));	
		
		System.out.println(f.compareTo(g));	
		
	}

}
