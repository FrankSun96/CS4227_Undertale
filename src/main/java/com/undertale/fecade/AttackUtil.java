package com.undertale.fecade;


import com.undertale.chainofresponsibility.BossAttackConcreteHandler;
import com.undertale.chainofresponsibility.CreepAttackConcreteHandler;
import com.undertale.chainofresponsibility.Handler;
import com.undertale.fecade.attackimage.Image;
import com.undertale.model.Boss;
import com.undertale.model.Charactor;
import com.undertale.model.Creature;
import com.undertale.model.Creep;

public class AttackUtil {

	static Boss boo;
	static Creep cre;
	static Character chara;
	protected static float Attack(Creature cr, Charactor ch) {
		float hp = ch.getHP();
		float result = hp;
		
		System.out.println("***************************************\n");
		System.out.println("For now, you are attacking " + cr.getName()+" ! \n");
		System.out.println("The creature is : " + cr.getDescription());
		System.out.println("\nAnd you feel you fill with determination ! \n");
		System.out.println("***************************************\n");
		
		Handler creepHandler = new CreepAttackConcreteHandler();
		Handler bossHandler = new BossAttackConcreteHandler();
		
		creepHandler.setSuccessor(bossHandler);
		
		creepHandler.handleAttackRequest(ch,cr);
		result  = ch.getHP();
		if(cr instanceof Boss && result > 0) {
			Image.getBossLoss();
			Image.getWin();
			System.exit(1);
		}
		return result;
	}
	
	public static void attackThreadInvokeMethod(Charactor ch, float hp, float damage, float armor) {
		Thread attackThread = new AttackThread(ch,hp,damage,armor);
		attackThread.start();
		try
		{
			attackThread.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		} finally {
			System.out.println("Fight finish.");
		}
		
	}
	
}
