package com.undertale.interpreter;

import com.undertale.model.CommandKeywords;

public class OperatorUtil {
	private CommandKeywords com;
	
	public OperatorUtil(boolean game) {
		com = new CommandKeywords(game);
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
