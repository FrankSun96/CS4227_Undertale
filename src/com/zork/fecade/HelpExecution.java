package com.zork.fecade;

import com.zork.model.Command;
import com.zork.model.CommandKeywords;

public class HelpExecution implements Fecade{
	@Override
	public void excute(Command command) {
		System.out.println("Valid inputs are:");
		CommandKeywords.showValidCommand();
	}

}
