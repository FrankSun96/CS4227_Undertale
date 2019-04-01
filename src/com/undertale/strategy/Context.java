package com.undertale.strategy;

import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;

public class Context {
	   private Strategy strategy;
	 
	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }
	 
	   public void executeStrategy(Command command, UndertaleMap map){
	      strategy.take(command, map);
	   }
	}