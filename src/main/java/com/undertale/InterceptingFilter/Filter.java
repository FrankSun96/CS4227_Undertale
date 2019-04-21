package com.undertale.InterceptingFilter;

import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;

public interface Filter {
	public boolean execute(Command command, UndertaleMap map);
}
