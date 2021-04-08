package StrategyPattern;

//Holi give Discount of 20 rs
public class Holi implements Offer // Holi is one of the offer user can choose . Diwali class define Discount 
{
public int discount(int itemOgPrice) //Step 11: We got original price
   {  
	    return itemOgPrice-20;         //Step 12:Calculated & returned the Final price
	  }
}

