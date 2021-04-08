package StrategyPattern;

public class Item {
	
	String itemname;
	int ogprice;
	public Item(String name, int price) //Step 2: name= Mobile price=100;
	{
		this.itemname=name;            // Step 3: i.itemname=Mobile i.ogprice=100;
		this.ogprice=price;
	}
	
	public String toString()
	{
		return "Item Name:" + this.itemname +"\n" + "Original Price:"+ this.ogprice;
	}

}
