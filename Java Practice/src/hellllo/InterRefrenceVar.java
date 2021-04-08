package hellllo;

public class InterRefrenceVar {

	public static void main(String[] args) {
		Sim ob=new Airtel();
		ob.data();
	}

}

public interface Sim 
{ 
	void data();
}

 class Voda implements Sim
{
	 public void data()
	 { System.out.println("Voda data");}
 }

 
 class Airtel implements Sim
 {
	 public void data()
	 { System.out.println("Airtel data");}
 }
