package com.zork.interpreter;

import com.zork.model.Command;

public class ActionInterpreter implements Interpreter {
	private String firstWord;
	private String secondWord;
	
	public ActionInterpreter(String firstWord, String secondWord) {
		this.firstWord = firstWord;
		this.secondWord = secondWord;
	}

	@Override
	public Command interpret() {
		return new Command(this.firstWord, this.secondWord);
	}

}
