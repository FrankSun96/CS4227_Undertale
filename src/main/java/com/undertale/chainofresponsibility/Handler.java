package com.undertale.chainofresponsibility;

import com.undertale.model.Charactor;
import com.undertale.model.Creature;

public abstract class Handler {
	
	protected Handler successor = null;
	
	public abstract void handleAttackRequest(Charactor ch, Creature cr);
	
	public Handler getSuccessor() {
		return successor;
	}
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	
}
