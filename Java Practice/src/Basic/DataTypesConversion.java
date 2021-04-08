package Basic;

public class DataTypesConversion {

	public static void main(String[] args)
{
	float f=2.0f;
	int x=1;
	f=x;                     //Converting from lower datatype to higher data type conversion takes place automatically(widening conversion)
	System.out.println(f);
	
	x=(int)f;                //Converting from higher datatype to lower data type conversion need to be done explicitly(narrowing conversion)
	System.out.println(x);
	
	
	
   }

}
