package day5_loopStatements;

public class For_loop {

	public static void main(String[] args) {
	
	/*	for loop:
			it repeats a block of  statement for specific number of times.

		syntax:
			for(data_type variable_name=start value;end_value;increment/decrement)
			{
				//statement
			}
	*/			

		// Request :'
		//	print 1 to 5 number in console.

			for(int a=1;a<=5;a++)
			{
				System.out.println(a);//1	2	3	4	5
			}
			
//-------------------------------------------------------------------------------		
		

			//print 10 to 15 value by using for loop
			
			for(int i=10;i<=15;i++)
			{
				System.out.println(i);
			}		
		
		
//------------------------------------------------------------------------------		

			//print 20 to 10 value using for loop
			
			for(int i=20;i>=10;i--)
			{
				System.out.println(i);
			}
		
//-----------------------------------------------------------------------------		
		
			//print 100 to 90 value using for loop.
			
			for(int i=100;i>=90;i--)
			{
				System.out.println("Value of i is "+i);
			}		
		
//-----------------------------------------------------------------------------		
		
			//print 1 to 5 value expect 3 number.
			
			for(int i=1;i<=5;i++)
			{
				if(i!=3)
				{
					System.out.println(i);//1 2  4   5
				}	
			}
//----------------------------------------------------------------------------		
		
			//print 20 to 10 value except 15 number
			
			for(int i=20;i>=10;i--)
			{
				if(i!=15)
				{
					System.out.println(i);
				}
			}

//---------------------------------------------------------------------------			
			
			//print 20 to 30 value except 23 and 27 number
			
			for(int i=20;i<=30;i++)
			{
				if((i!=23) && (i!=27))
				{
					System.out.println(i);
				}
			}			

//--------------------------------------------------------------------------			
			
			//print 0 to 10 even number
			
			for(int i=0;i<=10;i=i+2)
			{
				System.out.println(i);
			}			
			
//--------------------------------------------------------------------------
			
			//print 11 to 20 odd number
			
			for(int i=11;i<=20;i=i+2)
			{
				System.out.println(i);
			}					
			
			
			
			

	}
}
