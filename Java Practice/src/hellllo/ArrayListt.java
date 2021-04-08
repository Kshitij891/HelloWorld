package hellllo;
import java.io.*;
import java.util.*;
public class arrList {
        public static void main(String args[]){
            //elements in arraylist are objects
            //to use specific primitive datatypes use wrapper class
            Scanner sc = new Scanner(System.in);
            int N;
            ArrayList<String> arr1 = new ArrayList<String>();
            ArrayList<String> arr2 = new ArrayList<String>();
            System.out.println("Enter prompt for N");
            N = sc.nextInt();
            System.out.println("Enter the "+ N + " elements");
            for(int i=0;i<N;i++){
                String temp = sc.next();
                arr1.add(temp);
            }
            System.out.println("Now enter for second array list");
            for(int i=0;i<N;i++)
            {
                String temp = sc.next();
                String temp2 = temp.concat(arr1.get(i));
                arr2.add(temp2);
            }
            for(int i=0;i<N;i++)
            {
                System.out.print(arr2.get(i));
                System.out.println();
            }
        }
    }
	
