package com.undertale.fecade;

import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;

public interface Execution {
	public void execute(Command command, UndertaleMap map);
}
