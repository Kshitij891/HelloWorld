package SpringCore;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{

	public static void main(String[] args) 
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		System.out.println("config loaded");
		Airtel a = (Airtel)context.getBean("airtel");
		a.calling();
		a.data();
	}

}
