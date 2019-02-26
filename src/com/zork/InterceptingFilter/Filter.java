package com.zork.InterceptingFilter;

import com.zork.model.Command;

public interface Filter {
	public boolean excecute(Command command);
}
