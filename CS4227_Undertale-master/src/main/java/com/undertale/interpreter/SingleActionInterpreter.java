package com.undertale.interpreter;

import com.undertale.model.Command;

public class SingleActionInterpreter implements Interpreter {
	private String firstWord;
	
	public SingleActionInterpreter(String firstWord) {
		this.firstWord = firstWord;
	}

	public Command interpret() {
		return new Command(this.firstWord);
	}


}
