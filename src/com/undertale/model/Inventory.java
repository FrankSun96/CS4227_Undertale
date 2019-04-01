package com.undertale.model;

import java.io.Serializable;
import java.util.ArrayList;
import com.undertale.model.Item;

public class Inventory implements Serializable{

	private static final long serialVersionUID = -2719571101775439535L;
	private ArrayList<Item> inventory = new ArrayList<Item>();
	private int maximunCount = 5;
	private int currentCount = 0;
	
	public Inventory() {
		this.inventory = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		if(currentCount < 5) {
			inventory.add(item);
			currentCount++;
		}
	}
	
	public ArrayList<Item> getItems(){
		return inventory;
	}
	
	public int getCurrentCount() {
		return currentCount;
	}
	
}
