package Basic;

interface one
{
 void add(int a,int b);  
}

interface two
{
 int sub(int a,int b);  
}


public class LambdaIntro
{

	public static void main(String[] args) 
	{
		one obj=new one() { public void add(int m,int n) {System.out.println(m+n);} };
		one obj1=(m,n)->{System.out.println(m+n);};
		
		obj.add(2,3);   
		obj1.add(2,3);
		
		two obj2=(m,n) -> { return m-n;}
		System.out.println(obj2.sub(5, 1));
	
    }

}

