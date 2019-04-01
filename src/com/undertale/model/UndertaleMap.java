package com.undertale.model;
import java.io.Serializable;

import com.undertale.model.Item;
import com.undertale.model.factory.*;

public class UndertaleMap implements Serializable{
	
	private static final long serialVersionUID = 7892133818163125709L;
	private Charactor charactor;
	private Room currentRoom;
	private Room a, b, c;
	private int id;
	private RoomFactory normalFactory;
	private RoomFactory bossFactory;
	
	public UndertaleMap() {
		normalFactory = new NormalRoom();
		bossFactory = new BossRoom();
		id = 0;
	}
	
	public void initialMap() {
		charactor = new Charactor("Alex", 100, 0, 0, 10, 5);
		
		a = new Room("a", "this is room a");
		b = new Room("b", "this is room b");
		c = new Room("c", "this is room c");
		
		// north, south, west, east
		a.setExits(b, null, null, null);
		b.setExits(null, a, c, null);
		
		// initialize items in each room
		Item i = createItem("redpotion", "a red potion", "this red potion can add hp", 5);			
		Item i2 = createItem("arm", "an arm", "this arm can add arm", 5);
		Item i3 = createBossRoomItem("armor", "an armor", "this armor can add armor", 5);
		
		setRoomItem(a, i);
		setRoomItem(b, i2);
		setRoomItem(c, i3);
		
		// initialize creatures in each room
		Creature c1 = createCreature("a meow", "It is a normal creature.", 4, 20, 4);//armor hp arm
		Creature c2 = createBoss("a boss", "It is a Boss! Be careful.", 8, 40, 8);
		setRoomCreature(b, c1);
		setRoomCreature(c, c2);
		
		setCurrentRoom(a);
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
	
	public String showCurrentRoomDetails() {
		return currentRoom.showDetailedDescription();
	}
	
	public void setRoomItem(Room room, Item item) {
		room.putItem(item);
	}
	
	public void setRoomCreature(Room room, Creature creature) {
		room.putCreature(creature);
	}
	
	public Item createBossRoomItem(String item, String name, String description, float effect) {
		id++;
		if(item.equals("arm")) {
			return bossFactory.createArm(id, name, description, effect);
		} else if (item.equals("armor")) {
			return bossFactory.createArmor(id, name, description, effect);
		} else if(item.equals("redpotion")) {
			return bossFactory.createRedPotion(id, name, description, effect);
		} else {
			return null;
		}
	}
	
	public Creature createBoss(String name, String description, float HP, float arm, float armor) {
		id++;
		return bossFactory.createCreature(id, name, description, HP, arm, armor);
	}
	
	public Item createItem(String item, String name, String description, float effect) {
		id++;
		if(item.equals("arm")) {
			return normalFactory.createArm(id, name, description, effect);
		} else if (item.equals("armor")) {
			return normalFactory.createArmor(id, name, description, effect);
		} else if(item.equals("redpotion")) {
			return normalFactory.createRedPotion(id, name, description, effect);
		} else {
			return null;
		}
	}
	
	public Creature createCreature(String name, String description, float HP, float arm, float armor) {
		id++;
		return normalFactory.createCreature(id, name, description, HP, arm, armor);
	}
}
