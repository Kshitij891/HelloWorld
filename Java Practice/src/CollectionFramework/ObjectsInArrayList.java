package CollectionFramework;
import java.util.ArrayList;

class Student
{  int roll;
   String name; 
  
  public Student( String name,  int roll)
  {   this.roll=roll;
      this.name=name;
  }
  
  public String toString()      // Require to print object if you are using Method 1
  { return roll+" " +name; }
 
}
  
public class ObjectsInArrayList
{
	public static void main(String args[])
	{
		Student s1=new Student("shiv",10);
		Student s2=new Student("kshitij",11);
		Student s3=new Student("diksha",12);
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		
		ArrayList<Student> list2=new ArrayList<Student>();
		list2.add(s3);
		list2.add(s2);
		System.out.println(list.equals(list2)); //Compare list and send true if equal
		
		for(Student s:list)       // Method 1: Print objects store in ArrayList
     	{
			System.out.println(s);
			
		}
		
		list.set(1,s3);                  //Add object at particular index
		System.out.println(list.get(1));
		
		
		
//   	Method 2 of printing objects store in ArrayList
//		for( Student s:list) 
//		{
//		  System.out.print(s.roll+" "+s.name);
//	    }
	}
	
}