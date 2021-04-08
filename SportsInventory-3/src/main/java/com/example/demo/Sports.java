package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sports 
{    
	 @Id                          //Make sid as primary key
	 private int sid;
	 
	 private String equipment;
	 private String game;
     private int price;
     
     public Sports()  //Springboot creates object of class Sports behind. = new Sports() so default constructor is called.
     {
    	 
     }
     
     
     //So if we want to use parameterised constructor its compulsory to write default constructor
     public Sports(int sid, String equipment, String game, int price) {
		super();
		this.sid = sid;
		this.equipment = equipment;
		this.game = game;
		this.price = price;
	}



	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getEquipment() {
		return equipment;
	}



	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}



	public String getGame() {
		return game;
	}



	public void setGame(String game) {
		this.game = game;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Sports [sid=" + sid + ", game=" + game + ", equipment=" + equipment + ", price=" + price + "]";
	}
	
	
}