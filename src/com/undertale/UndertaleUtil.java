package com.undertale;

import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

public class UndertaleUtil {
	private UndertaleMap map;
	public void welcome() {
		System.out.println("\n" + 
				" █    ██  ███▄    █ ▓█████▄ ▓█████  ██▀███  ▄▄▄█████▓ ▄▄▄       ██▓    ▓█████ \n" + 
				" ██  ▓██▒ ██ ▀█   █ ▒██▀ ██▌▓█   ▀ ▓██ ▒ ██▒▓  ██▒ ▓▒▒████▄    ▓██▒    ▓█   ▀ \n" + 
				"▓██  ▒██░▓██  ▀█ ██▒░██   █▌▒███   ▓██ ░▄█ ▒▒ ▓██░ ▒░▒██  ▀█▄  ▒██░    ▒███   \n" + 
				"▓▓█  ░██░▓██▒  ▐▌██▒░▓█▄   ▌▒▓█  ▄ ▒██▀▀█▄  ░ ▓██▓ ░ ░██▄▄▄▄██ ▒██░    ▒▓█  ▄ \n" + 
				"▒▒█████▓ ▒██░   ▓██░░▒████▓ ░▒████▒░██▓ ▒██▒  ▒██▒ ░  ▓█   ▓██▒░██████▒░▒████▒\n" + 
				"░▒▓▒ ▒ ▒ ░ ▒░   ▒ ▒  ▒▒▓  ▒ ░░ ▒░ ░░ ▒▓ ░▒▓░  ▒ ░░    ▒▒   ▓▒█░░ ▒░▓  ░░░ ▒░ ░\n" + 
				"░░▒░ ░ ░ ░ ░░   ░ ▒░ ░ ▒  ▒  ░ ░  ░  ░▒ ░ ▒░    ░      ▒   ▒▒ ░░ ░ ▒  ░ ░ ░  ░\n" + 
				" ░░░ ░ ░    ░   ░ ░  ░ ░  ░    ░     ░░   ░   ░        ░   ▒     ░ ░      ░   \n" + 
				"   ░              ░    ░       ░  ░   ░                    ░  ░    ░  ░   ░  ░\n" + 
				"                     ░                                                        \n" + 
				"");
	}
	
	public void initalMap() {
		map = new UndertaleMap();
		map.initialMap();
		Room room = map.getCurrentRoom();
		System.out.println("\n"+room.showDetailedDescription());
	}
}
