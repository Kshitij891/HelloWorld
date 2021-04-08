package Basic;

//Step 1: Create interface
public interface perform
{
  int add(int a,int b);  //Step 2: Declare function
}


public class Lambdaa 
{
	public static void main(String[] args) 
	{                                              /*Variable of interface used to call function inside the interface*/
		perform refvar = (x,y) -> { return x+y;}; //Step 3: Define function
        System.out.println(refvar.add(2,3));      //Step 4: call function
        
        Arithmetic((x,y) -> { return x+y;});     //Calling arithmetic function & passing lambda expression
     }

	public static void Arithmetic(perform x)    // perform x = (x,y) -> { return x+y;}; 
	{
		 System.out.println(x.add(4,3)); 
	}

}


