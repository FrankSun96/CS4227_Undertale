package com.undertale.fecade;

import com.undertale.UndertaleUtil;
import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;
import com.undertale.model.memento.GameMemento;
import com.undertale.model.memento.GameMementoManager;

public class ReadExecution implements Fecade{
	private GameMementoManager manager;

	public ReadExecution() {
		manager = new GameMementoManager();
	}

	public void execute(Command command, UndertaleMap map) {
		GameMemento memo = manager.getMemento();
		System.out.println("(*) Reading archive...");
		if(memo == null) {
			System.out.println("(×) No archive file detected.");
		} else {
			UndertaleUtil.setGameState(memo.getMap());
			System.out.println("(√) Archive file is detected\n");
			UndertaleUtil.setFinish(true);
		}
	}

}
