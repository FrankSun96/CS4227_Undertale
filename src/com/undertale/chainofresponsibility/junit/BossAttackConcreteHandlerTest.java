package com.undertale.chainofresponsibility.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import com.undertale.chainofresponsibility.BossAttackConcreteHandler;
import com.undertale.model.Boss;
import com.undertale.model.Charactor;

import org.junit.Ignore;

public class BossAttackConcreteHandlerTest {

	@Test(timeout = 10000)
	public void testHandleAttackRequest() {
		Charactor ch = new Charactor("Alex", 100, 0, 0, 10, 5);
		Boss cr = new Boss(1,"a boss", "It is a Boss! Be careful.", 8, 40, 8);
		BossAttackConcreteHandler boss = new BossAttackConcreteHandler();
		boss.handleAttackRequest(ch,cr);
	}

}
