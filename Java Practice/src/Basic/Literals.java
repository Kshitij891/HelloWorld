package Basic;

public class Literals {

	public static void main(String[] args) 
	{   //Integer Literals
		int x=16;
		System.out.println(String.format("Value in decimal is %d",x));
		x=010; //Octal value
		System.out.println(String.format("Value in decimal is %d",x));
        x=0x10; // Hex value
    	System.out.println(String.format("Value in decimal is %d",x));
    	x=65;
    	System.out.println(String.format("Value in decimal is %c",x));
    	
    	
    	System.out.println("\n");
    	
    	 //Float Literals
		float f=1.5f;  //Write f at end for float values
		System.out.println(String.format("Value in float  is %f",f));
		System.out.println("Value in float is"+" "+f);
    	
    	//Character Literals
    	char c=65;  //ASCII value
    	System.out.println("Value of character" + " "+c);
    	char cha='A'; // character 
    	System.out.println("Value of character" + " "+cha);
    	
    	System.out.println("\n");
    	
    	//Binary Literals
    	int b=0b00010000; //Write 0b at start for binary value
		System.out.println(String.format("Value in decimal is %d",b));
		System.out.println("Value in decimal is"+" "+b);
    	
    	
    	

	}

}
