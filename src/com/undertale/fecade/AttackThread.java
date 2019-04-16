package com.undertale.fecade;

import java.util.concurrent.Callable;

import com.undertale.model.Boss;
import com.undertale.model.Charactor;
import com.undertale.model.Creature;
import com.undertale.model.Creep;

public class AttackThread extends Thread{
	private Charactor chara;
	private float hp;
	private float damage;
	private float armor;
	private float ch_hp;
	private float ch_arm;
	private float ch_armor;
	private float ch_attack;
	private float ch_defense;
	private String ch_name;
	
	AttackThread(Charactor charactor, float hp, float damage, float armor){
		this.hp = hp;
		this.damage = damage;
		this.armor = armor;
		this.chara = charactor;
		this.ch_name = chara.getName();
		this.ch_arm = chara.getArm();
		this.ch_armor = chara.getArmor();
		this.ch_attack = chara.getAttack();
		this.ch_defense = chara.getDefense();
		this.ch_hp = chara.getHP();
	}
	
	@Override
	public void run() {
		if((ch_armor + ch_defense) > damage) {
			damage = damage - 2;
		}
		if((ch_attack + ch_arm) < armor) {
			ch_arm = ch_arm - 2;
		}
		while(true) {
			boolean crit = false;
			float ch_damage = ch_attack + ch_arm;
			System.out.println("\n******************************************************************************");
			System.out.println(ch_name + "! Now you are fighting with a creature !");
			System.out.println("Your hp: "+ ch_hp + "  The creature hp: "+ hp + " Beat it warrior!");
			System.out.println("\n******************************************************************************");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			crit = critMethod();
			if(ch_arm != 0 && crit == true) {
				ch_hp = ch_hp - damage;
				hp = hp - ch_damage -2;
			}else {
				ch_hp = ch_hp - damage;
				hp = hp - ch_damage;
			}
			System.out.println("\n******************************************************************************");
			System.out.println(ch_name + "! Now you are fighting with a creature !");
			System.out.println("Your hp: "+ ch_hp + "  The creature hp: "+ hp + " Keep going on warrior!");
			System.out.println("\n******************************************************************************");
			chara.setHP(ch_hp);
			if(hp <= 0 && ch_hp > 0) {
				break;
			}
			if(ch_hp <= 0 ) {
				break;
			}
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Thread.sleep(1000);
		}
		
	}
	
	private boolean critMethod() {
		boolean crit = false;
		int num =(int)(Math.random() * 10);
		if(10 > num && num >= 5) {
			crit = true;
		}
		if(crit == true) {
			System.out.println("\n\nYes! You got a crit! Your damage will plus two in this round!\n\n");
		}
		return crit;
	}
	
}















/*public class AttackThread extends Thread implements Callable {
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
}*/
