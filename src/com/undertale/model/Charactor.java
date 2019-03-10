package com.undertale.model;

public class Charactor {
	private String name;
	private float HP;
	private float arm;
	private float armor;
	private Inventory myInventory;
	
	public Charactor(String name, float hP, float arm, float armor) {
		this.name = name;
		HP = hP;
		this.arm = arm;
		this.armor = armor;
		this.myInventory = new Inventory();
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
		String details = "我叫：" + this.name;
		details += "\n我还有" + this.HP + "血";
		details += "\n Arm:" + this.arm + "\tArmor: " + this.armor + "\n";
		return details;
	}
}
