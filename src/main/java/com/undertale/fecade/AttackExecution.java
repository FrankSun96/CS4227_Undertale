package com.undertale.fecade;

import java.util.ArrayList;

import com.undertale.UndertaleUtil;
import com.undertale.model.Charactor;
import com.undertale.model.Command;
import com.undertale.model.Creature;
import com.undertale.model.UndertaleMap;

public class AttackExecution implements Fecade {

	public void execute(Command command, UndertaleMap map) {
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