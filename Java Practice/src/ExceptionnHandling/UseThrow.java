package ExceptionnHandling;

public class UseThrow extends RuntimeException
{
//    1.static ArithmeticException e= new ArithmeticException("Withdraw amount more than the savings"); 
	public static void main(String[] args) 
	{   
		int savings=100;
	    int withdraw=101;
		if( savings < withdraw)
		{
//			2.throw new ArithmeticException("Withdraw amount more than the savings");	
			
//			1.throw e;
			
		}
		else 
		{
			System.out.println("Cash withdraw successfull");
		}
		System.out.println("Last line");
	}

}

public class Use extends RuntimeException { } 

// We can only throw throwable object ..  new UseThrow() is an object. For that we extend class RuntimeException