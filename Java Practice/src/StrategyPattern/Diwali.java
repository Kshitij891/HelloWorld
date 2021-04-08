package StrategyPattern;
// Diwali give Discount of 10 rs
public class Diwali implements Offer // Diwali is one of the offer user can choose . Diwali class define Discount 
{
   public int discount(int itemOgPrice) //Step 11: We got originalg price
      {  
	    return itemOgPrice-10;         //Step 12:Calculated & returned the Final price
	  }
}
