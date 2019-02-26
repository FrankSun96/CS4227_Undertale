package com.undertale.InterceptingFilter;

import com.undertale.model.Command;

public interface Filter {
	public boolean excecute(Command command);
}
