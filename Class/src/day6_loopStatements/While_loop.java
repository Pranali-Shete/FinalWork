package day6_loopStatements;

public class While_loop {

	public static void main(String[] args) {
	
	/*	While loop
		================================================
			it repeats a block of statement while condition is true.

		step 1: 
			declare the variable or start value
		step 2:
			while(condition/ end value)
			{
				//statement
			increment or decrement;

			}
	 */
		
//----------------------------------------------------------------------------------	
		
	//	print 1 to 5 value	

		int i=1;

		while(i<=5)
		{
			System.out.println(i);//1  2  3  4	5
			i++;
		}
		
		
//-----------------------------------------------------------------------------------		
		
		//print 1 to 5 value using while loop.
		
				int a=1;
				
				while(a<=5)
				{
					System.out.println(a);//1  2   3  4   5
					a++;
				}		
		
		
//------------------------------------------------------------------------------------		
		
		//print 20 to 10 value using while loop
				
				int b=20;
				
				while(b>=10)
				{
					System.out.println(b);
					b--;
				}		
		
//------------------------------------------------------------------------------------				
				
		//print 30 to 40 value using while loop
				
				int pune =30;
				
				while(pune<=40)
				{
					System.out.println(pune);
					pune++;
				}				
				
				
//-------------------------------------------------------------------------------------				
				
		//print 25 to 35 value except the 30 number.
				
				
				int c=25;
				
				while(c<=35)
				{
					if(c!=30)
					{
						System.out.println(c);
						
					}
					c++;
				}				
				
//-------------------------------------------------------------------------------------				
				
		//print 25 to 35 value except the 30 number.
				
				
				int d=25;
			
				while(d<=35)
				{	
					
					if(d!=30)
					{
						System.out.println(d);//25   26  27 28 29  31  32 33 34  35
					}
					d++;
					System.out.println("Pune");//1  2 3 4 5  6 7 8 9 10 11
				}				
				
//----------------------------------------------------------------------------------------				
		//print 25 to 35 value except the 30 number.
				
				
				int e=25;
			
				while(e<=35)
				{	
					
					if(e!=30)
					{
						System.out.println("e Value inside if cond "+e);//25  26    27
					}
					e++;
					System.out.println("e value outside if condition "+e);//26 27  28
					System.out.println("Pune");//1  2 3
				}
			
//-----------------------------------------------------------------------------------------				
				
				int f=20;
				
				while(true)
				{
					
					if(f==25)
					{
						System.out.println("Month is captured");
						break;
					}
					f++;
					System.out.println(f);
				}
					
//-------------------------------------------------------------------------------------------				
				
				
				
				
		
			

	}
}
