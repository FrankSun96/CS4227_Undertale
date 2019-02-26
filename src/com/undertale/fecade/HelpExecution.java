package com.undertale.fecade;

import com.undertale.model.Command;
import com.undertale.model.CommandKeywords;

public class HelpExecution implements Fecade{
	@Override
	public void excute(Command command) {
		System.out.println("Valid inputs are:");
		CommandKeywords.showValidCommand();
		System.out.println("");
	}

}
