package hellllo;

import java.util.LinkedList;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args)
	{
	  LinkedList<String> a=new LinkedList<String>(3);
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Enter elements in linked list");
	  for(int i=0;i<3;i++)
	  {   int x=obj.next();
		  String s=Integer.toString(x);
		  a.add(s);
 
	  }
	  System.out.println(a);
	 

	}
}


