package com.undertale.InterceptingFilter;

import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;

public class VerificationFilter implements Filter {
	private UndertaleMap map;
	
	public VerificationFilter() {
		map = new UndertaleMap();
	}

	@Override
	public boolean excecute(Command command, UndertaleMap map) {
		String firstword = command.getfirstWord();
		if(firstword.equals("HELP")) {
			return true;
		} else if(firstword.equals("GO")) {
			String direction = command.getSecondWord();
			boolean room = map.hasRoom(direction);
			if(room) {
				return true;
			} else {
				System.out.println("Oops, there is a wall in front of me. Maybe I should try another side\n");
				return false;
			}
		} else if(firstword.equals("USE")) {
			System.out.println("what do you wanna use?");
			return false;
		} else if(firstword.equals("ATTACT")) {
			System.out.println("who do you wanna attact?");
			return false;
		} else if(firstword.equals("GRAP")) {
			System.out.println("what do you wanna grap?");
			return false;
		} else if(firstword.equals("CHECK")) {
			System.out.println("here is your inventory:");
			return false;
		} else if(firstword.equals("READ")) {
			return true;
		} else if(firstword.equals("NEW")) {
			return true;
		} else if(firstword.equals("SAVE")) {
			return true;
		}
		return false;
	}

}
