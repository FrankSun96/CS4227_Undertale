package com.undertale.fecade;

import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;

public class TakeExecution implements Fecade{
	
	public TakeExecution() {
	}
	
	@Override
	public void excute(Command command, UndertaleMap map) {
		// TODO Auto-generated method stub
		System.out.println("(√) Take successfully.");
		
	}
}
