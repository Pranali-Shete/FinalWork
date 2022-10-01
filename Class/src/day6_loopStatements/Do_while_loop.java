package day6_loopStatements;

public class Do_while_loop {

	public static void main(String[] args) {
	
/*		do while loop
		it repeats a block of statement while condition is true.
		
		- it execute the a block of statement at least once before checking the condition.


	syntax:
			declare the variable;

			do{
				//statement
				increment/decrement;

			}
			while(condition);		*/
		
//==================================================================================		
		
		//print 1 to 5 value

				int i=1;

				do{
					System.out.println(i);
					i++;
				  }
				while(i<=5);		
		
//------------------------------------------------------------------------------------		
		//print 1 to 5 value using do while loop
				
				int a=1;
				
				do{
					System.out.println(a);//1  2   3    4 5
					a++;//2   3  4   5  6
				}
				while(a<=5);
				
//------------------------------------------------------------------------------------				
				
				int b=50;
				
				do{
					System.out.println(b);
					b--;
				}
				while(b>=40);			
		
		
//------------------------------------------------------------------------------------		
		
		
		

	}

}
