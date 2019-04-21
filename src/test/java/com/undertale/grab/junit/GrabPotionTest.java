package com.undertale.grab.junit;

import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;
import com.undertale.strategy.GrabContext;
import com.undertale.strategy.potionTakeStrategy;
import org.junit.Test;

public class GrabPotionTest {

	
	@Test
	public void testGrabPotionMethod() {
		
		UndertaleMap map = new UndertaleMap();
		Command command = new Command("GRAB","POTION");
		map.initialMap();
		
		if(command.getSecondWord().equals("POTION") ) {
			if(map.getCurrentRoom().checkItem(1)) {
				GrabContext grabContext = new GrabContext(new potionTakeStrategy());    
				grabContext.executeStrategy(command, map);
				System.out.println("(√) Grab successfully.");
				
			}
			else
				System.out.println("(x) There is no POTION in this room.");
		}
	}
}
