package hellllo;
import java.math.*;

public class BigDecimal {

	public static void main(String[] args) {
		double x=374.56;
		double y=374.26;
		double z=x-y;
		System.out.print(z);
		
		BigDecimal k =new BigDecimal("374.56");
		BigDecimal p =new BigDecimal("374.26");
		System.out.println(k.subtract(p)); If multiplied it should be multiplied by big decimal number only.
		
		
		
//		double m=374829923002313422672829920;
//		double n=368485009939837383883873873;
//		System.out.println(m-n);
//		
		BigInteger a=new BigInteger("374829923002313422672829920"); //BigInteger always deal with string
		BigInteger b=new BigInteger("368485009939837383883873873");
		System.out.println(a.subtract(b));  // a.divide(b) , a.multiply(b) and there are many other methods
		
		

	}

}
