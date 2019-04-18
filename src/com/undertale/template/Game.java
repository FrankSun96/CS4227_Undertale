package com.undertale.template;

public abstract class Game {
	public abstract void welcome();
	public abstract void initialMap();
	public abstract void executeCommand();
	
	public final void play() {
		welcome();
		initialMap();
		executeCommand();
	}
}
