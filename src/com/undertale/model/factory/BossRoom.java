package com.undertale.model.factory;

import com.undertale.model.Creature;
import com.undertale.model.Boss;
import com.undertale.model.Item;
import com.undertale.model.RedPotion;

import java.io.Serializable;

import com.undertale.model.Arm;
import com.undertale.model.Armor;

public class BossRoom implements RoomFactory, Serializable{
	private static final long serialVersionUID = 2930546360722969342L;

	@Override
	public Creature createCreature(int id, String name, String description, float HP, float arm, float armor) {
		return new Boss(id, name, description, HP, arm, armor);

	}

	@Override
	public Item createRedPotion(int id, String name, String description, float effect) {
		return new RedPotion(id, name, description, effect);
	}

	@Override
	public Item createArm(int id, String name, String description, float effect) {
		return new Arm(id, name, description, effect);
	}

	@Override
	public Item createArmor(int id, String name, String description, float effect) {
		return new Armor(id, name, description, effect);
	}

}
