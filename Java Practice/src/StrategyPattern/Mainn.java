package StrategyPattern;

public class Mainn {

	public static void main(String[] args) {
		Item i=new Item("Mobile",100);  // Step 1: Passign Item name & Original Price to Item class
		System.out.println(i);
		
		
		Context y=new Context(new Holi()); //Step 4: We pass which festival offer User want. We Create object of Context because we want to call FinalPrice()
		y.FinalPrice(i); //Step 7: We want final price of item
		                 //Step 8: passed refrence variable i because it is pointing to item
		
		
		
	}

}
