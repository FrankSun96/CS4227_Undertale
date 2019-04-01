package com.undertale;

import com.undertale.adapter.UndertaleUtilWithArchive;

public class Undertale {
	public static void main(String args[]) {
		UndertaleUtilWithArchive util = new UndertaleUtilWithArchive();
		util.welcome();
		util.initialMap();
		util.executeCommand();
		System.out.println("Here is yiran");
	}
}
