package com.undertale.model;

import java.util.HashMap;
import java.util.Map;

public class Room {
	private String description;
	private Map<String, Room> exits;
	
	public Room(String description) {
		this.description = description;
		exits = new HashMap<String, Room>();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	
	public String showDescription() {
		return this.description;
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
	
	
}
