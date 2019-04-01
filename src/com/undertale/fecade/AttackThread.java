package com.undertale.fecade;

import java.util.concurrent.Callable;

import com.undertale.model.Boss;
import com.undertale.model.Creature;
import com.undertale.model.Creep;

public class AttackThread extends Thread implements Callable {
	private String result;
	Creature cr;
	Character ch;
	public AttackThread(Creature crea, Character chara) {
		this.cr = crea;
		this.ch = chara;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			System.out.println("\n***************************************");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
