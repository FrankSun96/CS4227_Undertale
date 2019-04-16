package com.undertale.chainofresponsibility.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.undertale.chainofresponsibility.CreepAttackConcreteHandler;
import com.undertale.model.Charactor;
import com.undertale.model.Creep;

import org.junit.Ignore;


public class CreepAttackConcreteHandlerTest {

	@Test(timeout = 10000)
	public void testHandleAttackRequest() {
		Charactor ch = new Charactor("Alex", 100, 0, 0, 10, 5);
		Creep cr = new Creep(2,"a creep", "It is a Meow.", 4, 20, 4);
		CreepAttackConcreteHandler creep = new CreepAttackConcreteHandler();
		creep.handleAttackRequest(ch,cr);
	}
}
