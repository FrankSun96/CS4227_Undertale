package com.undertale.strategy;

import java.util.ArrayList;

import com.undertale.model.Armor;
import com.undertale.model.Command;
import com.undertale.model.Inventory;
import com.undertale.model.Item;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

public class armorTakeStrategy implements Strategy {

	@Override
	public void take(Command command, UndertaleMap map) {
		// TODO Auto-generated method stub
		Room currentRoom = map.getCurrentRoom();
		float armor = map.getCharactor().getArmor();
		ArrayList<Item> items =  map.getItems(currentRoom);
		float addArmor = 0;
		for(Item it: items) {
			if(it.getId() == 3) {
				addArmor = ((Armor)it).getEffect();
				break;
			}
		}
		map.getCharactor().setArmor(armor+addArmor);
	}

}
