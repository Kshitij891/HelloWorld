package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3};                     //1. Declaration & intialization
		int[] arr4= new int[]{11,21,31};        //2. Declaration & intialization
		
	    System.out.println(Arrays.toString(arr));// Use this method to PRINT ARRAY using name.Cant print array using array name directly
	    System.out.println(Arrays.toString(arr4));
	    
	    int length=arr.length;                    // Use to find Length of array
	    System.out.println("Length of Array is:"+ " "+length);
	    
	    
//	    int[] ar=new int[3];                      // THIS CANT BE DONE
//	    arr= {1,2,3};
//	    System.out.println(arr); 
	    
	    Scanner obj=new Scanner(System.in);       //Created Object of Scanner
	    
	    System.out.println("Enter size of array");
	    int size=obj.nextInt();
	    int[] ar=new int[size];                    // Use this Declaration when you need to take inputs from user.
	    System.out.println("Enter elements");
	    for(int i=0;i<size;i++)
	    {
	    	ar[i]=obj.nextInt();
	    }
	    System.out.println(Arrays.toString(ar)); 
	    
   
	    System.out.println("Enter size of array");
	    int sizee=obj.nextInt();
	    String[] sr=new String[sizee];                    // Use this Declaration when you need to take inputs from user.
	    System.out.println("Enter elements");
	    for(int j=0;j<sizee;j++)
	    {
	    	sr[j]=obj.next();
	    }
	    System.out.println(Arrays.toString(sr)); 
	    
	    
	    
	   }

}


