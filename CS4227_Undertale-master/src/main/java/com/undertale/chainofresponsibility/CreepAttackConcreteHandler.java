package com.undertale.chainofresponsibility;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.undertale.fecade.AttackUtil;
import com.undertale.model.Charactor;
import com.undertale.model.Creature;
import com.undertale.model.Creep;

public class CreepAttackConcreteHandler extends Handler{
	
	private static Lock lock = new ReentrantLock();
	
	@Override
	public void handleAttackRequest(Charactor ch, Creature cr) {
		
		if(cr instanceof Creep) {
			System.out.println("The HP is : " + ((Creep)cr).getHP());
			System.out.println("The Damage is : " + ((Creep)cr).getDamage());
			System.out.println("The Armor is : " + ((Creep) cr).getArmor());
			System.out.println("\n***************************************");
			lock.lock();
			try {
				AttackUtil.attackThreadInvokeMethod(ch,((Creep)cr).getHP(),((Creep)cr).getDamage(),((Creep) cr).getArmor());
			}finally {
				lock.unlock();
			}
		}else {
			if(getSuccessor()!= null) {
				getSuccessor().handleAttackRequest(ch, cr);
			}
			
		}
		
	}
}
