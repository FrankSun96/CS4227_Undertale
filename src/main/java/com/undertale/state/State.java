package com.undertale.state;

import com.undertale.model.UndertaleMap;

public interface State {
	public void doAction(UseContext useContext, UndertaleMap map);
}
