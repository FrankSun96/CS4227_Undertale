package com.zork;

import java.util.Scanner;

import com.zork.interpreter.ZorkExpressionParser;
import com.zork.model.Command;

public class Zork {
	public static void main(String args[]) {
		
		boolean finish = false;
		
		ZorkExpressionParser expression = new ZorkExpressionParser();
		ZorkUtil.welcome();
		
		while(!finish) {
			Command command = expression.parse();
			if(command != null) {
				System.out.println(command.toString());
			}
		}		
	}
}
