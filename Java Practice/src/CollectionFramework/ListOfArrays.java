package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListOfArrays {

	public static void main(String[] args)
	{
	  Integer nums[]=new Integer[] {1,2,3};
	  System.out.println(Arrays.toString(nums));
	  List list1 = Arrays.asList(nums);
	  System.out.println("The list is:" + list1);
		
	  int arr7[]=new int[] {1,2,3,4,5};
	  System.out.println(Arrays.toString(arr7));
	  List list2 = Arrays.asList(arr7);
	  System.out.println("The list is:" + list2);
		
		
		
		
	}

}
