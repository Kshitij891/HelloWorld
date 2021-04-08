/*
 1."instanceof" returns boolean value.

*/
package Basic;
public class InstanceOf {

	public static void main(String[] args) 
	{
		Vehicle obj =new Vehicle();
		Car co=new Car();
		Bike bi=new Bike();
		System.out.println(co instanceof Car);       //instance of own class
		System.out.println(co instanceof Vehicle);   //instance of own Parent class
		System.out.println(bi instanceof Road);      //instance of own Interface 
		System.out.println(m instanceof Integer);
		
		Integer m=10;
		System.out.println(m.getClass().getName());  //get data type of variable. Not applicable to primitive data type
	

	}

}

class Vehicle{ String color;}
interface Road{ }
class Car extends Vehicle { }
class Bike implements Road{ }