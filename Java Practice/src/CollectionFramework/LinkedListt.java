/* 
 1. Linked List implements List & Queue,Dequeue. It can use methods of all 3
 2.It is best to use an ArrayList when:

      a) You want to access random items frequently
      b) You only need to add or remove elements at the end of the list

3.It is best to use a LinkedList when:

      a)You only use the list by looping through it instead of accessing random items
      b)You frequently need to add and remove items from the beginning, middle or end of the list

 
 */

package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListt {

	public static void main(String[] args)
	{
	  LinkedList<String> a=new LinkedList<String>();
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Enter first element of linked list");
	  a.add("1");
	  a.add("3");
	  a.add("2");
	  for(String s:a ) 
	  {System.out.println(s);}
	  //System.out.println(a);
	  a.add(1,"8");                   //Adding element at particular index
	  System.out.println(a);
	  System.out.println(a.get(1));   // Get element at index 1
	  a.addFirst("5");	              // Adds an item to the beginning of the list.	
	  a.addLast("6");  	              // Add an item to the end of the list	
	  System.out.println(a);
	  a.removeFirst();	             //Remove an item from the beginning of the list.	
	  a.removeLast();                //Remove an item from the end of the list	
	  System.out.println(a);
	  System.out.println( a.getFirst());    //Get the item at the beginning of the list	
	  System.out.println(  a.getLast());    //Get the item at the end of the list
      Collections.sort(a);                  //Sort link list
      System.out.println(a);
      
      
	  


	  
	}

}
