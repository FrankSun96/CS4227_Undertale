package com.undertale;

import com.undertale.adapter.UndertaleUtilWithArchive;

public class Undertale {
	public static void main(String args[]) {
		UndertaleUtilWithArchive util = new UndertaleUtilWithArchive();//adapter
		util.welcome();
		util.initialMap();
		util.executeCommand();
	}
}
