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
			exits.put("north", north);
		}
		if(south != null) {
			exits.put("north", south);
		}
		if(west != null) {
			exits.put("north", west);
		}
		if(east != null) {
			exits.put("north", east);
		}
	}
	
	public String showDescription() {
		return this.description;
	}
	
	public Room nextRoom(String direction) {
		Room next = exits.get(direction);
		if(next != null) {
			return (Room) exits.values();
		} else {
			return null;
		}
	}
}
