package com.undertale.fecade;

import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;

import com.undertale.state.UseArmState;
import com.undertale.state.UseContext;
import com.undertale.state.UsePotionState;



public class UseExecution implements Fecade {
	
	public void execute(Command command, UndertaleMap map) {
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
