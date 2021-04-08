package hellllo;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		int i;
		 ArrayList<String>x= new ArrayList<String>();
		 x.add("10");
		 x.add("hello");
		 x.add("3.0");
		
		ArrayList<String>y= new ArrayList<String>();
		 y.add("y");
		 y.add("y");
		 y.add("y");
	
		int n=y.size(); //get size of list
		
		System.out.print("List 2 is:");
		for(i=0;i<n;i++)
		{
		System.out.print(x.get(i)+y.get(i)+" "); 
		}
		
	
		}

}
