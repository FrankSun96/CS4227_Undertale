package com.undertale.model;

import java.io.Serializable;

public class Charactor implements Serializable{
	
	private static final long serialVersionUID = -831573866198241188L;
	private String name;
	private float HP;
	private float arm;
	private float armor;
	private float attack;
	private float defense;
	private Inventory myInventory;
	
	public Charactor(String name, float hP, float arm, float armor, float attack, float defense) {
		this.name = name;
		HP = hP;
		this.arm = arm;
		this.armor = armor;
		this.attack = attack;
		this.defense = defense;
		this.myInventory = new Inventory();
	}

	public float getDefense() {
		return defense;
	}

	public void setDefense(float defense) {
		this.defense = defense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAttack() {
		return attack;
	}

	public void setAttack(float attack) {
		this.attack = attack;
	}

	public float getHP() {
		return HP;
	}

	public void setHP(float hP) {
		HP = hP;
	}

	public float getArm() {
		return arm;
	}

	public void setArm(float arm) {
		this.arm = arm;
	}

	public float getArmor() {
		return armor;
	}

	public void setArmor(float armor) {
		this.armor = armor;
	}

	public Inventory getMyInventory() {
		return myInventory;
	}

	public void setMyInventory(Inventory myInventory) {
		this.myInventory = myInventory;
	}
	
	public String showDetailedDescription() {
		return "";
	}
}
