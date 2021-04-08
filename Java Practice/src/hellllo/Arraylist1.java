package hellllo;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) 
	{
		int i;
		 ArrayList<String>x= new ArrayList<String>();
		 x.add("10");
		 x.add("hello");
		 x.add("3.0");
		
		ArrayList<String>y= new ArrayList<String>();
		y.addAll(x);  //copied first list to other
		
		int n=y.size(); //get size of list 2
		
		System.out.print("List 2 is:");
		for(String s:y)
		{
		System.out.print(s+"y"+ " "); }
//		
	
		}

}
