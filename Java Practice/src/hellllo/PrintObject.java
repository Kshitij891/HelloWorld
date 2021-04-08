package hellllo;

public class PrintObject {
	 
	public static void main(String[] args) 
	{
      Clothing arr[]=new Clothing[2];
      arr[0]=new Clothing("Shirt", "L");
      arr[1]=new Clothing("Pant", "M");
      for(Clothing x:arr) {System.out.println(x);}
      System.out.println(arr[0]);
		
//		Clothing x=new Clothing("Shirt", "L", 15);
//		System.out.print(x);
    }

}

class Clothing {
	    private String type;
	    private String size;
	  

	    public Clothing(String type, String size) 
	    {
	        this.type = type;
	        this.size = size;
	    }
	    
	    public String toString()  //This method called by deafult when we print object .So its mandatory method to define.
	    { return type+ " " + size; }
}


