package com.example.demo;

import javax.ws.rs.WebApplicationException;

public class DataNotFoundException extends RuntimeException
{
   public DataNotFoundException(String str) 
   {
	 super(str);
   }
}
