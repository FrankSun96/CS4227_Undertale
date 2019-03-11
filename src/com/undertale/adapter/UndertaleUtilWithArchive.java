package com.undertale.adapter;

import com.undertale.UndertaleUtil;
import com.undertale.model.memento.GameMemento;
import com.undertale.model.memento.GameMementoManager;

public class UndertaleUtilWithArchive extends UndertaleUtil implements Archive {

	@Override
	public void welcome() {
		super.initialMap();
		super.welcome();
		System.out.println("Do you want to start a \n[NEW] game or \n"
				+ "[READ] an archive.");
		super.executeCommand();
		UndertaleUtil.setFinish(false);
		super.setGameBegin();
		super.showCurrentRoomDetails();
		super.executeCommand();
	}
}
