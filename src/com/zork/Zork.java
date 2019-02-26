package com.zork;

import java.util.Scanner;

import com.zork.InterceptingFilter.VerificationFilter;
import com.zork.fecade.CommandExecution;
import com.zork.interpreter.ZorkExpressionParser;
import com.zork.model.Command;

public class Zork {
	public static void main(String args[]) {
		
		boolean finish = false;
		
		ZorkExpressionParser expression = new ZorkExpressionParser();
		VerificationFilter verification = new VerificationFilter();
		CommandExecution execution = new CommandExecution();
		
		ZorkUtil.welcome();
		
		while(!finish) {
			Command command = expression.parse();
			if(command != null) {
				boolean valid = verification.excecute(command);
				if(valid) {
					execution.execute(command);
				}
			}
		}		
	}
}
