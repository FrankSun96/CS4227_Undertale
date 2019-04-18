package com.undertale;

import java.util.ArrayList;
import java.util.List;

import com.undertale.InterceptingFilter.VerificationFilter;
import com.undertale.aop.AbstractHandler;
import com.undertale.aop.AfterHandler;
import com.undertale.aop.ProxyFactory;
import com.undertale.aop.impl.LoggerHandler;
import com.undertale.fecade.CommandExecution;
import com.undertale.fecade.Execution;
import com.undertale.interpreter.ExpressionParser;
import com.undertale.model.Command;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;
import com.undertale.template.Game;

public class UndertaleUtil extends Game{
	protected ExpressionParser expression;
	protected VerificationFilter verification;
	protected CommandExecution execution;
	protected static UndertaleMap map;
	private static boolean isFinish;
	private AfterHandler logger;
	private Execution proxy;
	private List<AbstractHandler> handlers;
	
	public UndertaleUtil() {
		expression = new ExpressionParser(false);
		verification = new VerificationFilter();
		execution = new CommandExecution();
		map = new UndertaleMap();
		isFinish = false;
		
		handlers = new ArrayList<AbstractHandler>();
		logger = new LoggerHandler();
		handlers.add(logger);
		proxy = (Execution) ProxyFactory.getProxy(execution, handlers);
	}
	
	public void setGameBegin() {
		this.expression = new ExpressionParser(true);
	}
	
	@Override
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
	
	@Override
	public void initialMap() {
		map.initialMap();
	}
	
	public void showCurrentRoomDetails() {
		Room room = map.getCurrentRoom();
		System.out.println("\n"+room.showDetailedDescription());
	}
	
	@Override
	public void executeCommand() {
		while(!isFinish) {
			Command command = expression.parse();
			if(command != null) {
				boolean valid = verification.excecute(command, map);
				if(valid) {
					proxy.execute(command, map);
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
	
	public static boolean getFinish() {
		return isFinish;
	}
}