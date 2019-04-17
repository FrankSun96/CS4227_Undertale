package com.undertale.fecade;

import java.util.ArrayList;

import com.undertale.model.Command;
import com.undertale.model.Inventory;
import com.undertale.model.Item;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

import com.undertale.state.UseArmState;
import com.undertale.state.UseContext;
import com.undertale.state.UsePotionState;
import com.undertale.strategy.GrabContext;
import com.undertale.strategy.potionTakeStrategy;


public class UseExecution implements Fecade {
	
	@Override
	public void excute(Command command, UndertaleMap map) {
		// TODO Auto-generated method stub
		if(command.getSecondWord().equals("POTION") ) {
			UseContext useContext = new UseContext();
			UsePotionState usePotionState = new UsePotionState();
			usePotionState.doAction(useContext, map);
		}
		
		else if(command.getSecondWord().equals("ARM") ) {
			UseContext useContext = new UseContext();
			UseArmState usePotionState = new UseArmState();
			usePotionState.doAction(useContext, map);
		}
	}
}
