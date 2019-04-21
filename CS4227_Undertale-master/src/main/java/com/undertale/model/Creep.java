package com.undertale.model;

import java.io.Serializable;

public class Creep extends Creature  implements Serializable{
	private static final long serialVersionUID = 1L;
	private float armor;
	private float HP;
	private float damage;
	
	public Creep(int id, String name, String description, float armor, float HP, float damage) {
		super(id, name, description);
		this.armor = armor;
		this.HP = HP;
		this.damage = damage;
	}

	public float getArmor() {
		return armor;
	}

	public void setArmor(float armor) {
		this.armor = armor;
	}

	public float getHP() {
		return HP;
	}

	public void setHP(float hP) {
		HP = hP;
	}

	public float getDamage() {
		return damage;
	}

	public void setDamage(float damage) {
		this.damage = damage;
	}
	
	
}
