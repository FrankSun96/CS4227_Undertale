package com.zork.interpreter;

import com.zork.model.Command;

public class SingleActionInterpreter implements Interpreter {
	private String firstWord;
	
	public SingleActionInterpreter(String firstWord) {
		this.firstWord = firstWord;
	}

	@Override
	public Command interpret() {
		return new Command(this.firstWord);
	}


}
