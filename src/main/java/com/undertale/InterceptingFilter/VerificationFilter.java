package com.undertale.InterceptingFilter;

import com.undertale.model.Command;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

public class VerificationFilter implements Filter {

	public boolean execute(Command command, UndertaleMap map) {
		String firstword = command.getfirstWord();
		if(firstword.equals("HELP")) {
			return true;
		} else if(firstword.equals("GO")) {
			String direction = command.getSecondWord();
			boolean room = map.hasRoom(direction);
			if(room) {
				return true;
			} else {
				System.out.println("(x) Oops, there is a wall in front of me. Maybe I should try another side\n");
				return false;
			}
		} else if(firstword.equals("USE")) {
			//System.out.println("what do you wanna use?");
			return true;
		} else if(firstword.equals("ATTACK")) {
			
			
			
			//这里需要检查是否有可攻击的怪物，如果没有 false， 有的话返回true
			System.out.println("(?) who do you wanna attack?");
			return true;
		} else if(firstword.equals("GRAB")) {
			Room currentRoom = map.getCurrentRoom();
			if(currentRoom.getItem().size() == 0) {
				System.out.println("(x) There is no item in this room.");
				return false;
			}
			else {
				return true;
			}
		} else if(firstword.equals("CHECK")) {
			return true;
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
