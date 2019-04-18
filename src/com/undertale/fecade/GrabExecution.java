package com.undertale.fecade;

import java.util.ArrayList;

import com.undertale.model.Command;
import com.undertale.model.Inventory;
import com.undertale.model.Item;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;
import com.undertale.strategy.GrabContext;
import com.undertale.strategy.armTakeStrategy;
import com.undertale.strategy.armorTakeStrategy;
import com.undertale.strategy.potionTakeStrategy;

public class GrabExecution implements Fecade{
	public GrabExecution() {
		
	}
	
	@Override
	public void excute(Command command, UndertaleMap map) {
		
		Room currentRoom = map.getCurrentRoom();
		// TODO Auto-generated method stub
		if(command.getSecondWord().equals("POTION") ) {
			if(currentRoom.checkItem(1)) {
				GrabContext grabContext = new GrabContext(new potionTakeStrategy());    
				grabContext.executeStrategy(command, map);
				System.out.println("(√) Grab successfully.");
			}
			else
				System.out.println("There is no POTION in this room.");
		}
		
		else if(command.getSecondWord().equals("ARM")) {
			if(currentRoom.checkItem(2)) {
				GrabContext grabContext = new GrabContext(new armTakeStrategy());    
				grabContext.executeStrategy(command, map);
				System.out.println("(√) Grab successfully.");
			}
			else
				System.out.println("There is no ARM in this room.");
		}
		
		else if(command.getSecondWord().equals("ARMOR")) {
			if(currentRoom.checkItem(3)) {
				GrabContext grabContext = new GrabContext(new armorTakeStrategy());    
				grabContext.executeStrategy(command, map);
				System.out.println("(√) Grab successfully.");
			}
			else
				System.out.println("There is no ARMOR in this room.");
		}
		
	}
}