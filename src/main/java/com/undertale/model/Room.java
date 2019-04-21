package com.undertale.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

import com.undertale.model.Item;

public class Room implements Serializable{

	private static final long serialVersionUID = -4916722174082874247L;
	private String name;
	private String description;
	private Map<String, Room> exits;
	private ArrayList<Item> itemList;
	private ArrayList<Creature> creatureList;
	
	public Room(String name, String description) {
		this.name = name;
		this.description = description;
		exits = new HashMap<String, Room>();
		this.itemList = new ArrayList<Item>();
		this.creatureList = new ArrayList<Creature>();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void putItem(Item item) {
		this.itemList.add(item);
	}
	
	public ArrayList<Item> getItem() {
		return itemList;
	}
	
	public boolean deleteItem(Item item) {
		int itemId = item.getId();
		Item find = itemList
					.stream()
					.filter(it -> it.getId() == itemId)
					.findFirst()
					.get();
		
		if(find == null) {
			return false;
		} else {
			itemList.remove(find);
			return true;
		}
	}
	
	public boolean checkItem(int itemId) {
		Item find = itemList
				.stream()
				.filter(it -> it.getId() == itemId)
				.findFirst()
				.get();
	
		if(find == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void putCreature(Creature creature) {
		this.creatureList.add(creature);
	}
	
	public boolean deleteCreature(Creature creature) {
		int creatureId = creature.getId();
		Creature find = creatureList
				.stream()
				.filter(ct -> ct.getId() == creatureId)
				.findFirst()
				.get();
	
		if(find == null) {
			return false;
		} else {
			creatureList.remove(find);
			return true;
		}
	}
	
	public void setExits(Room north, Room south, Room west, Room east) {
		if(north != null) {
			exits.put("NORTH", north);
		}
		if(south != null) {
			exits.put("SOUTH", south);
		}
		if(west != null) {
			exits.put("WEST", west);
		}
		if(east != null) {
			exits.put("EAST", east);
		}
	}
	
	public boolean hasRoom(String direction) {
		Room next = exits.get(direction);
		if(next != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public Room nextRoom(String direction) {
		Room next = exits.get(direction);
		if(next != null) {
			return next;
		} else {
			return null;
		}
	}
	
	public String showDescription() {
		return this.description;
	}
	
	public String showDetailedDescription() {
		String details = "############################################################################"
				+ "\nYou are in room " + this.name + "\n";
		details += this.description + "\n";
		details += itemsFormat();
		details += creatureFormat();
		return details;
	}
	
	public String itemsFormat() {
		if(itemList.isEmpty()) {
			return "";
		} else {	
			String items = "(?) You find: \n";
			for(Item it: itemList) {
				String name = it.getName();
				items += "● " + name + "\n";
			}
			return items;
		}
	}
	
	public String creatureFormat() {
		if(creatureList.isEmpty()) {
			return "";
		} else {
			String creature = "\n(!) There is: \n";
			for(Creature ct: creatureList) {
				String name = ct.getName();
				String description = ct.getDescription();
				creature += name + "\n";
				creature += description + "\n";
			}
			return creature;
		}
	}
	
	public ArrayList<Creature> getCreature(){
		return creatureList;
	}

}
