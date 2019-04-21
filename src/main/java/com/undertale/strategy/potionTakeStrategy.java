package com.undertale.strategy;

import com.undertale.model.Command;
import com.undertale.model.RedPotion;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

public class potionTakeStrategy implements Strategy {

	public void take(Command command, UndertaleMap map) {
		
		Room currentRoom = map.getCurrentRoom();
		int count = map.getCharactor().getMyInventory().getCurrentCount();
		if(count >= 5)
			System.out.println("full");
		else {
			RedPotion potion = new RedPotion(1, "a red [potion]", "this red potion can add hp", 5);
			map.getCharactor().getMyInventory().addItem(potion);
			currentRoom.deleteItem(potion);
		}
	}
}
