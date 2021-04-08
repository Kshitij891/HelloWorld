package hellllo;

public class Wrapper {

	public static void main(String[] args) {
		String s="891";
		System.out.print(s+1);
		
		System.out.print("\n");      // For line break
		
		int t=Integer.parseInt(s);   //Converting string vale into any primitive data type.
		System.out.print(t+1);
		System.out.print("\n");
		
	    int x=2;
     	Integer y=Integer.valueOf(x); // Converting from primitive to object
     	Integer z=x;                  //Auto boxing
 		
 		System.out.print(y);
 		System.out.print(z);
 		System.out.print("\n"); 
 		
 		Integer m=98;
 		int n=m;                       //Auto unboxing
    	int p=m.intValue();            // Converting from object to primitive
 		System.out.print(n);
 		System.out.print(p);
 		
	}

}
