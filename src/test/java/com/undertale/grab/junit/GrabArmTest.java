package com.undertale.grab.junit;

import org.junit.Test;

import com.undertale.model.Command;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;
import com.undertale.strategy.GrabContext;
import com.undertale.strategy.armTakeStrategy;

public class GrabArmTest {
	
	@Test
	public void testGrabPotionMethod() {
		
		UndertaleMap map = new UndertaleMap();
		Command command = new Command("GRAB","ARM");
		map.initialMap();
		Room currentRoom = map.getCurrentRoom();
		Room nextRoom = currentRoom.nextRoom("NORTH");
		map.setCurrentRoom(nextRoom);
		
		if(command.getSecondWord().equals("ARM")) {
			if(map.getCurrentRoom().checkItem(2)) {
				GrabContext grabContext = new GrabContext(new armTakeStrategy());    
				grabContext.executeStrategy(command, map);
				System.out.println("(√) Grab successfully.");
			}
			else
				System.out.println("(x) There is no ARM in this room.");
		}
	}
}
