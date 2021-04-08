package StrategyPattern;

public class Context
{
	Offer InterfaceVariable2;
	
	//Constructor
    public Context(Offer InterfaceVariable1)  //Step 5: Offer InterfaceVariable1=new Diwali(); 
                               //Now InterfaceVariable.Discount will call Discount method of Diwali class since we assigned object of Diwali to it
     {
	    InterfaceVariable2=InterfaceVariable1;  // Step 6: Offer InterfaceVariable2=new Diwali(); ...this done because we need to use this variable
     }
 
 public void FinalPrice(Item j) //Step 9: Now j is pointing to Item object i. 
                                //        j.itemname=Mobile j.ogprice=100;
 {
	 System.out.println("Final Price of" + " "+ j.itemname + ":"+ InterfaceVariable2.discount(j.ogprice)); //Step 10: Diwali.Discount() called
	                                                                                                       //Step 13: Output printed.
 }
 
 
}
