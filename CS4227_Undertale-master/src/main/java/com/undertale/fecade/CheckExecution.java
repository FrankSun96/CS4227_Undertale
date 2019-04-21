package com.undertale.fecade;

import java.util.ArrayList;

import com.undertale.model.Arm;
import com.undertale.model.Command;
import com.undertale.model.Inventory;
import com.undertale.model.Item;
import com.undertale.model.RedPotion;
import com.undertale.model.UndertaleMap;
import com.undertale.util.TextTable;

public class CheckExecution implements Fecade{
	
	public void execute(Command command, UndertaleMap map) {
		float arm = map.getCharactor().getArm();
		float hp = map.getCharactor().getHP();
		float armor = map.getCharactor().getArmor();
		float attack = map.getCharactor().getAttack();
		float defense = map.getCharactor().getDefense();
		String name = map.getCharactor().getName();
		Inventory inventory = map.getCharactor().getMyInventory();
		
		System.out.println(charFormatOutput(name, hp, defense, attack, armor, arm));
		System.out.println(inventoryOutput(inventory));
		
	}
	
	public TextTable charFormatOutput(String name, float hp, float defense, float attack, float armor, float arm) {
		String[] header = {"info", "base", "plus"};
	    String[][] rows = {
	        {"name", name, null},
	        {"hp", ""+hp, null},
	        {"defense", ""+defense, "+"+armor},
	        {"attack", ""+attack, "+"+arm},
	    };
		return new TextTable(header, rows);
	}
	
	public TextTable inventoryOutput(Inventory inventory) {

		ArrayList<Item> inventoryItems = new ArrayList<Item>();
		inventoryItems = inventory.getItems();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<String> description = new ArrayList<String>();
		ArrayList<Integer> sum = new ArrayList<Integer>();
		for(int i = 0; i < inventoryItems.size(); i++) {
			boolean flag = false;
			for(int j = 0; j < name.size(); j++) {
				if(inventoryItems.get(i).getId() == id.get(j)) {
					flag = true;
					int num = sum.get(j)+1;
					sum.set(j, num);
					continue;
				}
			}
			if(flag == false) {
				if(inventoryItems.get(i).getId() == 1)
					description.add(inventoryItems.get(i).getDescription()+" "+((RedPotion)inventoryItems.get(i)).getEffect());
				else if(inventoryItems.get(i).getId() == 2)
					description.add(inventoryItems.get(i).getDescription()+" "+((Arm)inventoryItems.get(i)).getEffect());
				else if(inventoryItems.get(i).getId() == 3) {
					continue;
				}
				sum.add(1);
				name.add(inventoryItems.get(i).getName());
				id.add(inventoryItems.get(i).getId());

			}
		}
		String[] header = {"name","info","number"};
		if(id.size() <= 0) {
			String[][] rows = new String[1][3];
			return new TextTable(header, rows);
		}
		else {
			if(id.size() == 0) {
				String[][] rows = {
				        {" ", " ", " "},
				    };
				return new TextTable(header, rows);
			}
			else {
				String[][] rows = new String[(id.size())][3];
				for(int i = 0;i < (id.size()); i++) {
					rows[i][0] = name.get(i);
					rows[i][1] = description.get(i);
					rows[i][2] = String.valueOf(sum.get(i));				
				}
				return new TextTable(header, rows);
			}
			
		}

	}
}
