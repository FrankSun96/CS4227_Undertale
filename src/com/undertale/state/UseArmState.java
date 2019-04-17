package com.undertale.state;

import java.util.ArrayList;

import com.undertale.model.Arm;
import com.undertale.model.Inventory;
import com.undertale.model.Item;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

public class UseArmState implements State{
	public void doAction(UseContext useContext, UndertaleMap map) {
		
		useContext.setState(this); 
	    int itemtoUse = 2;
		Inventory inventory = map.getCharactor().getMyInventory();
		ArrayList<Item> items = inventory.getItems();
		boolean itemFound = false ;

		for(int i = 0;i < items.size(); i ++){
			int item = items.get(i).getId();
			if(itemtoUse==item) {
				itemFound = true;
				break;					
			}
		}
		
		if(itemFound) {
			System.out.println("Player is using arm...");
			Arm arm = new Arm(2, "an [arm]", "this arm can add arm", 5);
			map.getCharactor().setArm(arm.getEffect());
			map.getCharactor().getMyInventory().deleteItem(arm);
			System.out.println("Item used.");
		}
		else {
			System.out.println("Item not found.");
		}
	}
}
