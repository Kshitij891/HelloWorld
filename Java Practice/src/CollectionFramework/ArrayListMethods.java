/* 
 
1. Arraylist is class & List is interface.
2. ArrayList implements List
3.Insertion order is maintained.
4.Duplicate element is allowed.
5. Use when there is need to retrieve data from list
6. Dont use when you need to add/remove element everytime in project bcoz shift operation take too much time 
7. By Default capacity of ArrayList is 10.
8. ArrayList cant store int we create arraylist of type Integer and store int values in it.
*/


package CollectionFramework;                         
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;                       
public class ArrayListMethods 
{

	public static void main(String[] args) 
	{
	  //List <Integer> x=new Arraylist<>();       -------> x then could only use methods of List interface
	  //ArrayList<Integer> x=new ArrayList<>(5);  --------> Give initial size of array
	// ArrayList<Integer> m=new ArrayList<>(Arrays.asList(1,2,3,4)); ------> Declare & intialize t same time
	  ArrayList<Integer> x=new ArrayList<>();
	  x.add(1);      // add elements in ArrayList
	  x.add(2);
	  x.add(3);
	  System.out.println(x);               //Print ArrayList
	  System.out.println(x.get(2));       // Print particular element
	  
	 
	  System.out.println("\nInserted element in Array List");
	  x.add(1,8);              // Insert element 8 at index 1
	  System.out.println(x);  
	  
	  System.out.println("\nChecked if element present in Array List");
	  boolean b=x.contains(1);  //This method() returns Boolean value if element present in list.
	  System.out.println(b);
	  
	  System.out.println("\nGiven number of elements present in Array List");
	  int y=x.size();         // Give number of elements in array list
	  System.out.println(y); 
	  
	  
	  System.out.println("\nReturning element present at particular index");
	  System.out.println(x.get(1));        //Return element present at index 1
	  
	  System.out.println("\nReturning index of particular element");
	  System.out.println(x.indexOf(8));    //Return index at which element 8 is present.
	 
	  System.out.println("\nChange element of particular index");
	  x.set(2,9);                          // Change element of particular index.
	  System.out.println(x); 
      
	  System.out.println("\nRemoved all elements from the list");
	  x.clear();                          //Remove all elements from the list
	  System.out.println(x); 
	  
	 
	  System.out.println("\nCombining two Array List");
      ArrayList<Integer> m=new ArrayList<>();
	  ArrayList<Integer> n=new ArrayList<>();
	  
	  m.add(1);
	  m.add(2);
	  n.add(3);
	  n.add(4);
	  System.out.println(m); 
	  System.out.println(n); 
	  m.addAll(n);                          // Combine two ArrayList
	  System.out.println(m);
	  
	System.out.println("\nCloned Array List");
	ArrayList<Integer> clonelist=(ArrayList<Integer>)m.clone();     // Clone an ArrayList . clone() return ArrayList Object.
	System.out.println("Newlist:"+clonelist);
	
	  
	System.out.println("\nFinding last index of particular duplicate element in Array List"); 
	ArrayList<Integer> r=new ArrayList<>(Arrays.asList(1,2,1,4,1));
    int lastindex=r.lastIndexOf(1);                    //Finding last index of particular duplicate element in Array List
    System.out.println("Newlist:"+r);
	System.out.println("Last index of element 1 is:"+lastindex);
	
	System.out.println("\nCreating sublist");
	ArrayList<Integer> MainList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	System.out.println("\nMain List :"+MainList);
	ArrayList<Integer> SubList=new ArrayList<>(MainList.subList(2,6)); // Create Sublist. It will give list fro 2 to 6-1
	System.out.println("Sub List :"+SubList);
	
	ArrayList<Integer>gr=new ArrayList<>(Arrays.asList(1,2,1,4,1));
    Object arr[]=gr.toArray();                                        // Converting ArrayList to Array . toArray() returns Object type.
    System.out.println(Arrays.toString(arr));
    
    ArrayList<Integer> firstlist=new ArrayList<>(Arrays.asList(1,2,4,3,5,8,6,7));
    ArrayList<Integer> secondlist=new ArrayList<>(Arrays.asList(1,2,3,4));
    Collections.sort(firstlist);                                         // Always sort list before comapring
    Collections.sort(secondlist);
    System.out.println(firstlist.equals(secondlist));   // Compare list --return true/false
    firstlist.removeAll(secondlist);                    // Compare with list 2 & display elements not present in list 2
    System.out.println(firstlist); 
    
    
    ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,4,3,5,8,6,7));
    ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4));
	list1.retainAll(list2);                               // Display elements that are common with list 2
	System.out.println(list1);      
	}

}
