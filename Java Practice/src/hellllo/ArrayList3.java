package hellllo;

import java.util.ArrayList;

public class ArrayList3 
{

	public static void main(String[] args) 
	{
		int k;
		 ArrayList<String> x= new ArrayList<String>();
		 x.add("10");
		 x.add("hello");
		 x.add("3.0");
		
		
		 ArrayList<String> y= new ArrayList<String>();
		 int m=x.size();
		 
		for(k=0;k<m;k++)
		{
		  y.add(k,x.get(k)+"y"); //add y to list 1 while copying to list 2
		}
		
		System.out.print(y); //print list 2
		
	
	}

}

