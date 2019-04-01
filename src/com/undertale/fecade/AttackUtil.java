package com.undertale.fecade;

import java.util.ArrayList;

import com.undertale.model.Boss;
import com.undertale.model.Charactor;
import com.undertale.model.Creature;
import com.undertale.model.Creep;

public class AttackUtil {

	/*
	AttackUtil(Boss b){
		
	}
	AttackUtil(Creep c){
		
	}
	*/
	static Boss boo;
	static Creep cre;
	static Character chara;
	protected static boolean Attack(Creature cr, Charactor ch) {
		// TODO Auto-generated method stub
		float arm = ch.getArm();
		float hp = ch.getHP();
		float armor = ch.getArmor();
		float attack = ch.getAttack();
		float defense = ch.getDefense();
		boolean result = false;
		
		System.out.println("***************************************\n");
		System.out.println("For now, you are attacking " + cr.getName()+" ! \n" + "The creature is : " + cr.getDescription() + "\nAnd you feel you fill with determination ! \n");
		//creature

		if(cr instanceof Boss) {
			System.out.println("The HP is : " + ((Boss)cr).getHP());
			System.out.println("The Damage is : " + ((Boss)cr).getDamage());
			System.out.println("The Armor is : " + ((Boss)cr).getArmor());
			System.out.println("\n***************************************");
		}else if(cr instanceof Creep) {
			System.out.println("The HP is : " + ((Creep)cr).getHP());
			System.out.println("The Damage is : " + ((Creep)cr).getDamage());
			System.out.println("The Armor is : " + ((Creep) cr).getArmor());
			System.out.println("\n***************************************");
		}
		//AttackUtil a = new AttackUtil();
		//Thread t = new Thread(a);
		
		//t.start();                                              
		return result;
	}

	
}
