package com.undertale.model;
import com.undertale.model.Item;

public class UndertaleMap {
	private static Charactor charactor;
	private static Room currentRoom;
	private static Room a, b, c;
	
	public void initialMap() {
		charactor = new Charactor("王大锤", 20, 10, 5);
		
		a = new Room("a", "this is room a");
		b = new Room("b", "this is room b");
		c = new Room("c", "this is room c");
		
		// north, south, west, east
		a.setExits(b, null, null, null);
		b.setExits(null, a, c, null);
		
		// initialize items in each room
		Item i = new RedPotion(0, "a red potion", "this red potion can add hp", 5);
		Item i2 = new Arm(1, "an arm", "this arm can add arm", 5);
		Item i3 = new Armor(3, "an armor", "this armor can add armor", 5);
		
		a.putItem(i);
		b.putItem(i2);
		b.putItem(i3);
		
		// initialize creatures in each room
		Creature c1 = new Creep(0, "a meow", "kill people", 10, 5, 5);
		Creature c2 = new Boss(1, "a boss", "kill people", 20, 3, 4);
		b.putCreature(c1);
		c.putCreature(c2);
		
		this.currentRoom = a;
	}
	
	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}
	
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	
	public Charactor getCharactor() {
		return this.charactor;
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
