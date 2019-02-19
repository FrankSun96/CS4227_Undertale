package com.zork.interpreter;

import com.zork.model.CommandKeywords;

public class OperatorUtil {
	private CommandKeywords com;
	
	public OperatorUtil() {
		com = new CommandKeywords();
	}
	public boolean isOperator(String symbol) {
		return (com.isCommand(symbol));
	}
	
	public boolean hasSecondWord(String symbol) {
		return (com.hasSecondWord(symbol));
	}
	
	public Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
		return null;
	}
}
