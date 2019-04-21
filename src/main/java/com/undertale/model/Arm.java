package com.undertale.model;
import com.undertale.model.Item;

public class Arm extends Item {
	private float effect;

	public Arm(int id, String name, String description, float effect) {
		super(id, name, description);
		this.effect = effect;
	}

	public float getEffect() {
		return effect;
	}

	public void setEffect(float effect) {
		this.effect = effect;
	}
}