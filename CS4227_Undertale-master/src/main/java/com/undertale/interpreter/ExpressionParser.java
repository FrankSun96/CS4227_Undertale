package com.undertale.interpreter;

import java.util.Scanner;

import com.undertale.interpreter.OperatorUtil;
import com.undertale.model.Command;
public class ExpressionParser {
	private Scanner sc;
	private OperatorUtil util;
	private CommandHelper help;
	
	public ExpressionParser(boolean game) {
		sc = new Scanner( System.in );	
		util = new OperatorUtil(game);
		help = new CommandHelper(game);
	}
	
	public Command parse() {	
		String str = sc.nextLine();
		str = str.toUpperCase();
		if(str.equals("")) {
			return null;
		}
		String[] commands = str.split(" ");
		if(!util.isOperator(commands[0])) {
			String helpWord = help.similarWord(commands[0]);
			System.out.println("(?) Do you mean " + helpWord);
			return null;
		} else {
			if(util.hasSecondWord(commands[0])) {
				String firstWord = commands[0];
				if(commands.length == 1) {
					System.out.println("Invalid command");
				} else {
					String secondWord = commands[1];
					Interpreter command = new ActionInterpreter(firstWord, secondWord);
					return command.interpret();
				}
			} else {
				String firstWord = commands[0];
				Interpreter command = new SingleActionInterpreter(firstWord);
				return command.interpret();
			}
		}
		return null;
	}
}
