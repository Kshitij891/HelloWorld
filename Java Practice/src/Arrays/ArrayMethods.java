package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayMethods {

	public static void main(String[] args) {
	int array1[]= {1,2,3};
	int array2[]= {1,2,6};
	array2=array1;                      //Copy one array to another. Refrence variable of array 1 starts pointing to array 2.
	if(Arrays.equals(array1,array2))    //COMPARE TWO ARRAY. It returns Boolean value.
	{
		System.out.println("Arrays Equal");
	}
	else 
	{
		System.out.println("Arrays not Equal");
	}
 //----------------------------------------------------------------------------------------------------------
	
	Arrays.fill(array1,6);                        //Fill whole array with 6
    System.out.println(Arrays.toString(array1));
    
 //----------------------------------------------------------------------------------------------------------
 
 int array3[]= {6,2,1}; 
 Arrays.sort(array3);                           // Sort array in ascending order
 System.out.println(Arrays.toString(array3));
 int index=Arrays.binarySearch(array3,1);     // Perform binary search on array and help to find index of element.
 System.out.println(index);
 
 //----------------------------------------------------------------------------------------------------------
 
 System.out.println("Enter element to be checked");
 Scanner obj=new Scanner(System.in);
 int check=obj.nextInt();
 int find=Arrays.binarySearch(array3,check);           //Check if element is present in array
 if (find>=0) { System.out.println("Element found");}
 else{ System.out.println("Element not found");}
    
 //----------------------------------------------------------------------------------------------------------


 String a[] = new String[]{"abc","klm","xyz","pqr"};
 List list1 = Arrays.asList(a);
 System.out.println("The list is:" + list1); // Convert and display normal array in List.

	}

}
