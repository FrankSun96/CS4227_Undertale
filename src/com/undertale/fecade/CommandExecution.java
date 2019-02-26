package com.undertale.fecade;

import com.undertale.model.Command;

public class CommandExecution {
	private HelpExecution help;
	private GoExecution go;
	
	public CommandExecution() {
		help = new HelpExecution();
		go = new GoExecution();
	}
	
	public void execute(Command command) {
		String firstword = command.getfirstWord();
		if(firstword.equals("HELP")) {
			help.excute(command);
		} else if(firstword.equals("GO")) {
			go.excute(command);
		} 
	}
}
