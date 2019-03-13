package com.undertale.fecade;

import com.undertale.model.Command;
import com.undertale.model.Inventory;
import com.undertale.model.UndertaleMap;
import com.undertale.util.TextTable;

public class CheckExecution implements Fecade{
	@Override
	public void excute(Command command, UndertaleMap map) {
		float arm = map.getCharactor().getArm();
		float hp = map.getCharactor().getHP();
		float armor = map.getCharactor().getArmor();
		float attack = map.getCharactor().getAttack();
		float defense = map.getCharactor().getDefense();
		String name = map.getCharactor().getName();
		Inventory inventory = map.getCharactor().getMyInventory();
		System.out.println(charFormatOutput(name, hp, defense, attack, armor, arm));
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

}
