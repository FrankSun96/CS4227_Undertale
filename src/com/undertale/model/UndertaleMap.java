package com.undertale.model;

public class UndertaleMap {
	private static Room currentRoom;
	private static Room a, b, c;
	
	public void initialMap() {
		a = new Room("room a");
		b = new Room("room b");
		c = new Room("room c");
		
		// north, south, west, east
		a.setExits(b, null, null, null);
		b.setExits(null, a, c, null);
		
		this.currentRoom = a;
	}
	
	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}
	
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	
	public boolean hasRoom(String direction) {
		boolean next = currentRoom.hasRoom(direction);
		if(!next) {
			return false;
		} else {
			return true;
		}
	}
}
