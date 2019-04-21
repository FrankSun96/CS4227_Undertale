package com.undertale.model.factory;

import java.io.Serializable;

import com.undertale.model.Arm;
import com.undertale.model.Armor;
import com.undertale.model.Creature;
import com.undertale.model.Creep;
import com.undertale.model.Item;
import com.undertale.model.RedPotion;

public class NormalRoom implements RoomFactory,Serializable{
	private static final long serialVersionUID = -6751698289019441562L;

	public Creature createCreature(int id, String name, String description, float HP, float arm, float armor) {
		return new Creep(id, name, description, HP, arm, armor);
	}

	public Item createRedPotion(int id, String name, String description, float effect) {
		return new RedPotion(id, name, description, effect);
	}

	public Item createArm(int id, String name, String description, float effect) {
		return new Arm(id, name, description, effect);
	}

	public Item createArmor(int id, String name, String description, float effect) {
		return new Armor(id, name, description, effect);
	}
}
