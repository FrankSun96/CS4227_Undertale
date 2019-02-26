package com.zork.InterceptingFilter;

import com.zork.model.Command;

public class VerificationFilter implements Filter {

	@Override
	public boolean excecute(Command command) {
		String firstword = command.getfirstWord();
		if(firstword.equals("HELP")) {
			System.out.println("you wanna help? ");
			return true;
		} else if(firstword.equals("GO")) {
			System.out.println("where do you wanna go? ");
			return false;
		} else if(firstword.equals("USE")) {
			System.out.println("what do you wanna use?");
			return false;
		} else if(firstword.equals("ATTACT")) {
			System.out.println("who do you wanna attact?");
			return false;
		} else if(firstword.equals("GRAP")) {
			System.out.println("what do you wanna grap?");
			return false;
		}
		return false;
	}

}
