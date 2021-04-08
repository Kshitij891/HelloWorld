package Basic;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class SumOfArray {
public static void main(String[] args) 

{   
	int i;
	
	
	Scanner ob=new Scanner(System.in);
	System.out.println("Program to print Sum of Array elements");
	System.out.println("Enter length of array");
	int len=ob.nextInt();
	int arr[]=new int[len];
	System.out.println("Enter the elements");
	for(i=0;i<len;i++)
	{
		arr[i]=ob.nextInt();
	}
	
	//System.out.print(Arrays.toString(arr));
	System.out.print(arr);
	
}
}
