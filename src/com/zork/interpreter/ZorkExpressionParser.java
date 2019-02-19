package com.zork.interpreter;

import java.util.Scanner;
import java.util.Stack;
import com.zork.interpreter.OperatorUtil;
import com.zork.model.Command;
public class ZorkExpressionParser {
	private Stack<Interpreter> stack;
	private Scanner sc;
	private OperatorUtil util;
	
	public ZorkExpressionParser() {
		sc = new Scanner( System.in );	
		util = new OperatorUtil();
		stack = new Stack<Interpreter>();
	}
	
	public Command parse() {	
		String str = sc.nextLine();
		String[] commands = str.split(" ");
		if(!util.isOperator(commands[0])) {
			System.out.println("Invalid command");
		} else {
			if(util.hasSecondWord(commands[0])) {
				String firstWord = commands[0];
				String secondWord = commands[1];
				if(commands.length == 1) {
					System.out.println("Invalid command");
				} else {
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
