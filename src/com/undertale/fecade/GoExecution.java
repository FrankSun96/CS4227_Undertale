package com.undertale.fecade;

import com.undertale.model.Command;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

public class GoExecution implements Fecade {
	UndertaleMap map;
	
	public GoExecution() {
		map = new UndertaleMap();
	}
	@Override
	public void excute(Command command, UndertaleMap map) {
		String direction = command.getSecondWord();
		Room currentRoom = map.getCurrentRoom();
		Room nextRoom = currentRoom.nextRoom(direction);
		map.setCurrentRoom(nextRoom);
		
		Room roomNow = map.getCurrentRoom();
		System.out.println("\n" + map.getCharactor().showDetailedDescription()
				+ "\n"+roomNow.showDetailedDescription());
	}

}
