package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sports 
{    
	 @Id
	 private int sid;
	 private String equipment;
	 private String game;
     private int price;
     
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