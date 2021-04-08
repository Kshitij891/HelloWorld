package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalciTest {
	private Calci obj;
	
	@BeforeEach
	public void setup()
	{
		obj=new Calci();
	}
	
	@Test
	public void addtest() 
	{   
		assertEquals(3, obj.add(2,1),"Error in addition");
		assertEquals(1, obj.add(2, -1),"Error in addition");
		assertEquals(-1, obj.add(-2, 1),"Error in addition");
		assertEquals(-3, obj.add(-2,-1),"Error in addition");
	}
	
	@Test
	public void subtest() 
	{   
		assertEquals(1, obj.sub(2, 1),"Error in subtraction");
		assertEquals(3, obj.sub(2, -1),"Error in subtraction");
		assertEquals(-3, obj.sub(-2, 1),"Error insubtraction");
		assertEquals(-1, obj.sub(-2,-1),"Error in subtraction");
	}
	
	@Test
	public void multest() 
	{   
		assertEquals(2, obj.mul(2, 1),"Error in Multiplication1");
		assertEquals(-2, obj.mul(2, -1),"Error in Multiplication");
		assertEquals(-2, obj.mul(-2, 1),"Error in Multiplication");
		assertEquals(2, obj.mul(-2,-1),"Error in Multiplication");
		assertEquals(0, obj.mul(-2,0),"Error in Multiplication");
	}
	
	@Test()
	public void divtest() 
	{  
		assertEquals(2,obj.div(10, 5),"Error in Dvision");
		assertEquals(0,obj.div(5, 10),"Error in Division");
	}
	
	
	@Test()
	public void divideByZerotest() 
	{  
		assertThrows(ArithmeticException.class,()->{obj.div(2, 0);});
	}
	
	@AfterEach
	public void clean()
	{
		obj=null;
	}


}
