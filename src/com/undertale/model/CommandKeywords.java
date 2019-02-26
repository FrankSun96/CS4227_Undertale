package com.undertale.model;

import java.util.HashMap;
import java.util.Map;

public class CommandKeywords {
	Map<String, Integer> validCommands;
	
	public CommandKeywords() {
		validCommands = new HashMap<String, Integer>();
		
		validCommands.put("GO", 2);
		validCommands.put("HELP", 1);
		validCommands.put("USE", 2);
		validCommands.put("ATTACK", 1);
		validCommands.put("GRAP", 2);
	}
	
	public boolean isCommand(String command) {
		if(validCommands.containsKey(command)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean hasSecondWord(String command) {
		if(validCommands.get(command) == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void showValidCommand() {
		System.out.println("GO [NORTH]|[SOUTH]|[WEST]|[EAST]");
		System.out.println("USE [Item]");
		System.out.println("ATTACK");
		System.out.println("GRAP [Item]");
		System.out.println("HELP");
	}
}

