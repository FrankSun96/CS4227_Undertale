package com.undertale.model.factory;
import com.undertale.model.Creature;
import com.undertale.model.Item;

public interface RoomFactory {
	public Creature createCreature(int id, String name, String description, float HP, float arm, float armor);
	public Item createRedPotion(int id, String name, String description, float effect);
	public Item createArm(int id, String name, String description, float effect);
	public Item createArmor(int id, String name, String description, float effect);
}
