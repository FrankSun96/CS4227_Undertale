package com.undertale.grab.junit;

import org.junit.Test;

import com.undertale.model.Command;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;
import com.undertale.strategy.GrabContext;
import com.undertale.strategy.armorTakeStrategy;

public class GrabArmorTest {
	
	@Test
	public void testGrabPotionMethod() {
		
		UndertaleMap map = new UndertaleMap();
		Command command = new Command("GRAB","ARMOR");
		map.initialMap();
		Room currentRoom = map.getCurrentRoom();
		Room nextRoom = currentRoom.nextRoom("NORTH");
		map.setCurrentRoom(nextRoom);
		currentRoom = map.getCurrentRoom();
		nextRoom = currentRoom.nextRoom("WEST");
		map.setCurrentRoom(nextRoom);
		
		if(command.getSecondWord().equals("ARMOR")) {
			if(map.getCurrentRoom().checkItem(3)) {
				GrabContext grabContext = new GrabContext(new armorTakeStrategy());    
				grabContext.executeStrategy(command, map);
				System.out.println("(√) Grab successfully.");
			}
			else
				System.out.println("(x) There is no ARMOR in this room.");
		}
	}
}
