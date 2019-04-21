package com.undertale.fecade;

import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;
import com.undertale.model.memento.GameMemento;
import com.undertale.model.memento.GameMementoManager;

public class SaveExecution implements Fecade {
	private GameMementoManager manager;
	
	public SaveExecution() {
		manager = new GameMementoManager();
	}
	public void execute(Command command, UndertaleMap map) {
		GameMemento memo =  new GameMemento(map);
		manager.addMemento(memo);
		System.out.println("(√) Save successfully.");
	}

}
