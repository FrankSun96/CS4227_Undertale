package com.undertale.fecade;

import java.util.ArrayList;

import com.undertale.model.Command;
import com.undertale.model.Inventory;
import com.undertale.model.Item;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;
import com.undertale.strategy.Context;
import com.undertale.strategy.armTakeStrategy;
import com.undertale.strategy.armorTakeStrategy;
import com.undertale.strategy.potionTakeStrategy;

public class TakeExecution implements Fecade{
	UndertaleMap map;
	
	public TakeExecution() {
		map = new UndertaleMap();
	}
	
	@Override
	public void excute(Command command, UndertaleMap map) {
		// TODO Auto-generated method stub
		String item = command.getSecondWord();
		
		if(command.getSecondWord() == "potion") {
			Context context = new Context(new potionTakeStrategy());    
			context.executeStrategy(command, map);
			System.out.println("potion");
		}
		else if(command.getSecondWord() == "arm") {
			Context context = new Context(new armTakeStrategy());    
			context.executeStrategy(command, map);
		}
		else if(command.getSecondWord() == "armor") {
			Context context = new Context(new armorTakeStrategy());    
			context.executeStrategy(command, map);
		}
		
		
		System.out.println("(√) Take successfully.");
		
	}
}
