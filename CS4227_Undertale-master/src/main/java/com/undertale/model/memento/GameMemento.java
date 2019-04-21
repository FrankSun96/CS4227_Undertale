package com.undertale.model.memento;

import java.io.Serializable;

import com.undertale.model.UndertaleMap;

public class GameMemento implements Serializable{
	private static final long serialVersionUID = 4171869445758509802L;
	private UndertaleMap map;
	
	public GameMemento(UndertaleMap map) {
		this.map = map;
	}
	
	public UndertaleMap getMap() {
		return map;
	}
}
