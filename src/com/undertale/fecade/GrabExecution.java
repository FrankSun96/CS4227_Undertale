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
		// TODO Auto-generated method stub
		if(command.getSecondWord().equals("POTION") ) {
			GrabContext grabContext = new GrabContext(new potionTakeStrategy());    
			grabContext.executeStrategy(command, map);
		}
		else if(command.getSecondWord().equals("ARM")) {
			GrabContext grabContext = new GrabContext(new armTakeStrategy());    
			grabContext.executeStrategy(command, map);
			System.out.println("ARM.");
		}
		else if(command.getSecondWord().equals("ARMOR")) {
			GrabContext grabContext = new GrabContext(new armorTakeStrategy());    
			grabContext.executeStrategy(command, map);
			System.out.println("ARMOR.");
		}
		
		System.out.println("(√) Grab successfully.");
		
	}
}