package com.undertale.model;

import java.io.Serializable;
import java.util.ArrayList;
import com.undertale.model.Item;

public class Inventory implements Serializable{

	private static final long serialVersionUID = -2719571101775439535L;
	private ArrayList<ArrayList<ArrayList<Item>>> inventory = new ArrayList<ArrayList<ArrayList<Item>>>();
	
	public Inventory() {
		this.inventory = new ArrayList<ArrayList<ArrayList<Item>>>();
	}
}
