package com.undertale.model;

public class UndertaleMap {
	private Room currentRoom;
	
	public void initialMap() {
		Room a, b, c;
		a = new Room("room a");
		b = new Room("room b");
		c = new Room("room c");
		
		// north, south, west, east
		a.setExits(b, null, null, null);
		b.setExits(null, a, c, null);
	}
	
	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}
}
