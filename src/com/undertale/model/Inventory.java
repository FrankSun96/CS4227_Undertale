package com.undertale.model;

import java.util.ArrayList;
import com.undertale.model.Item;

public class Inventory {
	private ArrayList<ArrayList<ArrayList<Item>>> inventory = new ArrayList<ArrayList<ArrayList<Item>>>();
	
	public Inventory() {
		this.inventory = new ArrayList<ArrayList<ArrayList<Item>>>();
	}
}
