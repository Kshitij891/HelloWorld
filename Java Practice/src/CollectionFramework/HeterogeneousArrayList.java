package CollectionFramework;

import java.util.ArrayList;

public class HeterogeneousArrayList {

	public static void main(String[] args) 
	{
		ArrayList x=new ArrayList();
		x.add("hi");
		x.add(1);
		x.add(3.0);
		System.out.println("Heterogeneous Array List is:"+x); //Print Array List
		
		//Print only String elements from list
		for(Object s:x)
		{
			if (s!= null && s instanceof String)
			{
				String ss=(String)s;
				System.out.println(ss);
			}
		}
		
   }

}
