package com.undertale;

import java.util.Scanner;

import com.undertale.InterceptingFilter.VerificationFilter;
import com.undertale.fecade.CommandExecution;
import com.undertale.interpreter.ExpressionParser;
import com.undertale.model.Command;

public class Undertale {
	public static void main(String args[]) {
		
		boolean finish = false;
		
		ExpressionParser expression = new ExpressionParser();
		VerificationFilter verification = new VerificationFilter();
		CommandExecution execution = new CommandExecution();
		
		UndertaleUtil.welcome();
		
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
