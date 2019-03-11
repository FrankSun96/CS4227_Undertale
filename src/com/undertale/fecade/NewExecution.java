package com.undertale.fecade;

import com.undertale.UndertaleUtil;
import com.undertale.model.Command;
import com.undertale.model.UndertaleMap;

public class NewExecution implements Fecade{

	@Override
	public void excute(Command command, UndertaleMap map) {
		System.out.println("(√) New game...");
		UndertaleUtil.setFinish(true);
	}
}
