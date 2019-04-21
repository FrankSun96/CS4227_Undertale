package com.undertale.aop.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.undertale.aop.AfterHandler;

public class LoggerHandler extends AfterHandler {

	@Override
	public void handleAfter(Object proxy, Method method, Object[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        fileWriter(sdf.format(date) + "\t" + args[0].toString());
	}
	
	private void fileWriter(String lines) {
		String fileName="./src/logger.txt";
        try {
        	FileWriter writer=new FileWriter(fileName,true);
            writer.write(lines+"\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}