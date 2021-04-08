package ExceptionnHandling;

public class ExceptionHandlee 
{

	public static void main(String[] args) 
	{
		int a=10;
		try 
		{
			int arr[]=new int[5];
			arr[5]=a/0;
		}
		
//		catch(ArithmeticException e)
//		{
//			System.out.print("Cant divide by zero"); 
//		}
	
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.print("Array length is less"); 
//		}
		
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Not possible"); 
	    }

	}

}
