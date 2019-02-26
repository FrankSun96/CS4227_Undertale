package com.undertale.model;

public class Command {
	private String firstCommand;
	private String secondCommand;
	
	public Command(String firstCommand, String secondCommand) {
		this.firstCommand = firstCommand;
		this.secondCommand = secondCommand;
	}
	
	public Command(String firstCommand) {
		this.firstCommand = firstCommand;
	}
	
	public String getfirstWord() {
		return this.firstCommand;
	}
	
	public String getSecondWord() {
		return this.secondCommand;
	}
	
	public String toString() {
		if(this.secondCommand != null) {
			return this.firstCommand + this.secondCommand;
		} else {
			return this.firstCommand;
		}
	}
	
}
