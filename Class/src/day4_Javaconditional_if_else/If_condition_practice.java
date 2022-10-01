package day4_Javaconditional_if_else;

public class If_condition_practice {

	public static void main(String[] args) {
		
/* Single Conditional Statement
		
		 Syntax: 
		
				if(condition)
				{
					statement
				}
			



*/
		
		// Example - 1
		
			
			int a=100;
			int b=200;
			int c=180;
			if((a>b)&&(a>c))
			{
				System.out.println("a is small number");
			}
			else System.out.println("a is big number");
			
//----------------------------------------------------------------------		
		// Example - 2
			
			
		if(a>b)
		{
			System.out.println("a is big number");
		}
	
		else
	{
			System.out.println("c is big number");
	}

//-----------------------------------------------------------------------------------------	
	
	
		// Example - 3
		
		
		int English=55;
		int Marathi=70;
		int	Hindi=74;
		int Sanskrit=40;
		
		
		if((English>Marathi)&&(English>Hindi)&&(English>Sanskrit))
		{
			System.out.println("I have more marks in English than Marathi,Hindi and Sanskrit");
		}
		else if ((Marathi>Hindi)&&(Marathi>Sanskrit))
		{
			System.out.println("I have more marks in Marathi than English,Hindi and Sanskrit");
		}
		
		else if (Hindi>Sanskrit)
		{
			System.out.println("I have more marks in Hindi than English,Marathi and Sanskrit");
		}
		else 
		{
			System.out.println("I have more marks in Sanskrit than English,Marathi and Hindi");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
