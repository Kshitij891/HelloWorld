package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ForrLoops {

	public static void main(String[] args) 
	{   
		//List<Integer> num=new ArrayList<Integer>();              List of Integer Objects
		List<Object> num=new ArrayList<Object>();                  // List of any type ofobject
		num.add(1);
		num.add(2.0);
		num.add("hello");
		
		num.forEach(System.out::println); //forEach to print list items
		
		for(Object x:num)                  //Enhance for loop
		{
			System.out.println(x);
		}
		
		num.forEach(p->System.out.println(p));   //Using lamda expression + for each
		
	}

}
