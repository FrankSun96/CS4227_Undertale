package com.undertale;

import com.undertale.InterceptingFilter.VerificationFilter;
import com.undertale.fecade.CommandExecution;
import com.undertale.interpreter.ExpressionParser;
import com.undertale.model.Command;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

public class UndertaleUtil {
	protected ExpressionParser expression;
	protected VerificationFilter verification;
	protected CommandExecution execution;
	protected static UndertaleMap map;
	private static boolean isFinish;
	
	public UndertaleUtil() {
		expression = new ExpressionParser(false);
		verification = new VerificationFilter();
		execution = new CommandExecution();
		map = new UndertaleMap();
		isFinish = false;
	}
	
	public void setGameBegin() {
		this.expression = new ExpressionParser(true);
	}
	public void welcome() {
		System.out.println("\n" + 
				" █    ██  ███▄    █ ▓█████▄ ▓█████  ██▀███  ▄▄▄█████▓ ▄▄▄       ██▓    ▓█████ \n" + 
				" ██  ▓██▒ ██ ▀█   █ ▒██▀ ██▌▓█   ▀ ▓██ ▒ ██▒▓  ██▒ ▓▒▒████▄    ▓██▒    ▓█   ▀ \n" + 
				"▓██  ▒██░▓██  ▀█ ██▒░██   █▌▒███   ▓██ ░▄█ ▒▒ ▓██░ ▒░▒██  ▀█▄  ▒██░    ▒███   \n" + 
				"▓▓█  ░██░▓██▒  ▐▌██▒░▓█▄   ▌▒▓█  ▄ ▒██▀▀█▄  ░ ▓██▓ ░ ░██▄▄▄▄██ ▒██░    ▒▓█  ▄ \n" + 
				"▒▒█████▓ ▒██░   ▓██░░▒████▓ ░▒████▒░██▓ ▒██▒  ▒██▒ ░  ▓█   ▓██▒░██████▒░▒████▒\n" + 
				"░▒▓▒ ▒ ▒ ░ ▒░   ▒ ▒  ▒▒▓  ▒ ░░ ▒░ ░░ ▒▓ ░▒▓░  ▒ ░░    ▒▒   ▓▒█░░ ▒░▓  ░░░ ▒░ ░\n" + 
				"░░▒░ ░ ░ ░ ░░   ░ ▒░ ░ ▒  ▒  ░ ░  ░  ░▒ ░ ▒░    ░      ▒   ▒▒ ░░ ░ ▒  ░ ░ ░  ░\n" + 
				" ░░░ ░ ░    ░   ░ ░  ░ ░  ░    ░     ░░   ░   ░        ░   ▒     ░ ░      ░   \n" + 
				"   ░              ░    ░       ░  ░   ░                    ░  ░    ░  ░   ░  ░\n" + 
				"                     ░                                                        \n" + 
				"");
	}
	
	public void initialMap() {
		map.initialMap();
	}
	
	public void showCurrentRoomDetails() {
		Room room = map.getCurrentRoom();
		System.out.println("\n"+room.showDetailedDescription());
	}
	
	public void executeCommand() {
		while(!isFinish) {
			Command command = expression.parse();
			if(command != null) {
				boolean valid = verification.excecute(command, map);
				if(valid) {
					execution.execute(command, map);
				}
			}
		}
	}
	
	public static boolean isFinish() {
		return isFinish;
	}
	
	public static void setFinish(boolean finish) {
		isFinish = finish;
	}

	public static void setGameState(UndertaleMap map) {
		UndertaleUtil.map = map;
	}
	
}