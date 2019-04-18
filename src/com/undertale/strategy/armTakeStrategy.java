package com.undertale.strategy;

import java.util.ArrayList;

import com.undertale.model.Arm;
import com.undertale.model.Command;
import com.undertale.model.Inventory;
import com.undertale.model.Item;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

public class armTakeStrategy implements Strategy  {

	@Override
	public void take(Command command, UndertaleMap map) {
		// TODO Auto-generated method stub
		Room currentRoom = map.getCurrentRoom();
		int count = map.getCharactor().getMyInventory().getCurrentCount();
		if(count >= 5)
			System.out.println("");
		else {
			Arm arm = new Arm(2, "an [arm]", "this arm can add arm", 5);
			map.getCharactor().getMyInventory().addItem(arm);
			currentRoom.deleteItem(arm);
		}
	}

}
