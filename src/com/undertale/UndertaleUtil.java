package com.undertale;

import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

public class UndertaleUtil {
	private static UndertaleMap map;
	public static void welcome() {
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
	
	public static void initalMap() {
		map = new UndertaleMap();
		map.initialMap();
	}
}
