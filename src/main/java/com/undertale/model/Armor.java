package com.undertale.model;
import java.io.Serializable;

import com.undertale.model.Item;

public class Armor extends Item  implements Serializable{
	private static final long serialVersionUID = 1L;
	private float effect;

	public Armor(int id, String name, String description, float effect) {
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
