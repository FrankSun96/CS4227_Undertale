package com.undertale.fecade;

import java.util.ArrayList;

import com.undertale.model.Command;
import com.undertale.model.Inventory;
import com.undertale.model.Item;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;
import com.undertale.state.Context;


public class UseExecution implements Fecade {
	UndertaleMap map;

	@Override
	public void excute(Command command, UndertaleMap map) {
		// TODO Auto-generated method stub
		float hp = map.getCharactor().getHP();
		float attack = map.getCharactor().getAttack();
		float defense = map.getCharactor().getDefense();
		
		String itemtoUse = command.getSecondWord();
		Inventory inventory = map.getCharactor().getMyInventory();
		ArrayList<Item> items = inventory.getItems();
		/*
		
		Context context = new Context();
		UseArm useArm = new UseArm();
		useArm.doAction(context);
		
		UsePotion usePotion = new UsePotion();
		usePotion.doAction(context);
		
		
		for(int i = 0;i < items.size(); i ++){
			String item = items.get(i).getName();
			if(itemtoUse.equalsIgnoreCase(item)) {
				hp = hp + 10;
				items.remove(i);
				
			}
		}
		map.getCharactor().setHP(hp);
		System.out.println("hp="+ hp);
		*/
		
		
	}
	
	

}
