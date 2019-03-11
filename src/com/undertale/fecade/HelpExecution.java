package com.undertale.fecade;

import com.undertale.model.Command;
import com.undertale.model.CommandKeywords;
import com.undertale.model.UndertaleMap;

public class HelpExecution implements Fecade{
	@Override
	public void excute(Command command, UndertaleMap map) {
		System.out.println("Valid inputs are:");
		CommandKeywords.showValidCommand();
		System.out.println("");
	}

}
