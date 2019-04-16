package com.undertale.fecade;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.undertale.model.Boss;
import com.undertale.model.Charactor;
import com.undertale.model.Creature;
import com.undertale.model.Creep;

public class AttackUtil {

	static Boss boo;
	static Creep cre;
	static Character chara;
	private static Lock lock = new ReentrantLock();
	protected static float Attack(Creature cr, Charactor ch) {
		// TODO Auto-generated method stub
		float arm = ch.getArm();
		float hp = ch.getHP();
		float armor = ch.getArmor();
		float attack = ch.getAttack();
		float defense = ch.getDefense();
		float result = hp;
		
		System.out.println("***************************************\n");
		System.out.println("For now, you are attacking " + cr.getName()+" ! \n");
		System.out.println("The creature is : " + cr.getDescription());
		System.out.println("\nAnd you feel you fill with determination ! \n");
		System.out.println("***************************************\n");
		
		
		
		//boss
		if(cr instanceof Boss) {
			System.out.println("The HP is : " + ((Boss)cr).getHP());
			System.out.println("The Damage is : " + ((Boss)cr).getDamage());
			System.out.println("The Armor is : " + ((Boss)cr).getArmor());
			System.out.println("\n***************************************");
			lock.lock();
			try {
				attackThreadInvokeMethod(ch,((Boss)cr).getHP(),((Boss)cr).getDamage(),((Boss)cr).getArmor());
			}finally {
				lock.unlock();
			}
			
		}else//creep 
		if(cr instanceof Creep) {
			System.out.println("The HP is : " + ((Creep)cr).getHP());
			System.out.println("The Damage is : " + ((Creep)cr).getDamage());
			System.out.println("The Armor is : " + ((Creep) cr).getArmor());
			System.out.println("\n***************************************");
			lock.lock();
			try {
				attackThreadInvokeMethod(ch,((Creep)cr).getHP(),((Creep)cr).getDamage(),((Creep) cr).getArmor());
			}finally {
				lock.unlock();
			}
		}
		result  = ch.getHP();
		return result;
	}
	
	private static void attackThreadInvokeMethod(Charactor ch, float hp, float damage, float armor) {
		// TODO Auto-generated method stub
		Thread attackThread = new AttackThread(ch,hp,damage,armor);
		attackThread.start();
		try
		{
			attackThread.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Fight finish.");
	}
	
}
