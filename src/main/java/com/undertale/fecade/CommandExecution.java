package com.undertale.fecade;

import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;

public class CommandExecution implements Execution{
	private HelpExecution help;
	private GoExecution go;
	private ReadExecution read;
	private SaveExecution save;
	private NewExecution newGame;
	private CheckExecution check;
	private GrabExecution grab;
	private AttackExecution attack;
	private UseExecution use;
	
	
	public CommandExecution() {
		help = new HelpExecution();
		go = new GoExecution();
		read = new ReadExecution();
		save = new SaveExecution();
		newGame = new NewExecution();
		check = new CheckExecution();
		grab = new GrabExecution();
		attack = new AttackExecution();
		use = new UseExecution();
	}
	
	public void execute(Command command, UndertaleMap map) {
		String firstword = command.getfirstWord();
		if(firstword.equals("HELP")) {
			help.execute(command, map);
		} else if(firstword.equals("GO")) {
			go.execute(command, map);
		} else if(firstword.equals("READ")) {
			read.execute(command, map);
		} else if(firstword.equals("NEW")) {
			newGame.execute(command, map);
		} else if(firstword.equals("SAVE")) {
			save.execute(command, map);
		} else if(firstword.equals("CHECK")) {
			check.execute(command, map);
		} else if(firstword.equals("GRAB")) {
			grab.execute(command, map);
		} else if(firstword.equals("ATTACK")) {
			attack.execute(command, map);
		} else if(firstword.equals("USE")) {
			use.execute(command, map);
			
		}

	}
}

