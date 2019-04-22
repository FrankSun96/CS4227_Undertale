package com.undertale.chainofresponsibility;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.undertale.fecade.AttackUtil;
import com.undertale.fecade.attackimage.Image;
import com.undertale.model.Boss;
import com.undertale.model.Charactor;
import com.undertale.model.Creature;

public class BossAttackConcreteHandler extends Handler{
	
	private static Lock lock = new ReentrantLock();
	
	@Override
	public void handleAttackRequest(Charactor ch, Creature cr) {
		
		
		if(cr instanceof Boss) {
			
			Image.getBoss();
			System.out.println("The HP is : " + ((Boss)cr).getHP());
			System.out.println("The Damage is : " + ((Boss)cr).getDamage());
			System.out.println("The Armor is : " + ((Boss)cr).getArmor());
			System.out.println("\n***************************************");
			Image.getBossFight();
			lock.lock();
			try {
				AttackUtil.attackThreadInvokeMethod(ch,((Boss)cr).getHP(),((Boss)cr).getDamage(),((Boss)cr).getArmor());
			}finally {
				lock.unlock();
			}
		}else
		{
			if(getSuccessor()!= null) {
				System.out.println("error, no creature type found.");
				//getSuccessor().handleAttackRequest(ch, cr);
			}
		}
	}
	
}
