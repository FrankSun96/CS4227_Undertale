package com.undertale.fecade;

import java.util.ArrayList;

import com.undertale.UndertaleUtil;
import com.undertale.model.Charactor;
import com.undertale.model.Command;
import com.undertale.model.Creature;
import com.undertale.model.UndertaleMap;

public class AttackExecution implements Fecade {

	public void execute(Command command, UndertaleMap map) {
		// TODO Auto-generated method stub
		
		//boolean attackResult = false;
		Charactor ch = map.getCharactor();
		boolean attackResult = UndertaleUtil.getFinish();
		float hpAfterFight = 0;
		if(attackResult == false) {
			ArrayList<Creature>  creatureList = map.getCurrentRoom().getCreature();
			for(int i = 0; i < creatureList.size(); i++){
				hpAfterFight = AttackUtil.Attack(creatureList.get(i),ch);
				if(hpAfterFight <= 0) {
					attackResult = true;//fail
					System.out.println("You died.");
					System.exit(1);
				}else {
					System.out.println("congratz, you beat the creature! Now you have HP: " + hpAfterFight+ "\n What you want to do next? \n");
					map.getCurrentRoom().deleteCreature(creatureList.get(i));
				}
			}
			UndertaleUtil.setFinish(attackResult);
		}
		else {
			System.out.println("You have died, so you cannot attack.");
			return;
		}
	}

}





//System.out.print("Helloword");
		// TODO Auto-generated method stub
		/*float arm = map.getCharactor().getArm();
		float hp = map.getCharactor().getHP();
		float armor = map.getCharactor().getArmor();
		float attack = map.getCharactor().getAttack();
		float defense = map.getCharactor().getDefense();*/
		
		//creature info
	/*	float creatureId = 0;
		String creatureName = "";
		String creatureDes = "";
		float creatureHP = 0;
		float creatureArmor = 0;
		float creatureArm = 0;*/
		//boolean attackResult = false;
		//Charactor ch = map.getCharactor();
		//ArrayList<Creature>  creatureList = map.getCurrentRoom().getCreature();
		//for(int i = 0; i < creatureList.size(); i++){
			/*creatureId = creatureList.get(i).getId();
			creatureName = creatureList.get(i).getName();
			creatureDes = creatureList.get(i).getDescription();*/
			/*if(creatureList.get(i) instanceof Boss) {*/
				//AttackUtil.Attack(creatureList.get(i),ch);
				/*Boss b = (Boss)creatureList.get(i);
				creatureHP = b.getHP();
				creatureArm = b.getDamage();
				creatureArmor = b.getArmor();*/
			/*}else if(creatureList.get(i) instanceof Creature) {*/
				//AttackUtil a = new AttackUtil();
			/*	Thread t = new Thread(a);
				t.start();*/
				//AttackUtil.Attack(creatureList.get(i),ch);
				/*Creep c = (Creep)creatureList.get(i);
				creatureHP = c.getHP();
				creatureArm = c.getDamage();
				creatureArmor = c.getArmor();*/
			//}
		//}
		