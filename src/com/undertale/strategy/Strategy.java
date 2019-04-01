package com.undertale.strategy;

import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;

public interface Strategy {
	public void take(Command command, UndertaleMap map);
}