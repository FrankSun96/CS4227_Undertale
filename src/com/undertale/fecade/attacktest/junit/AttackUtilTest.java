package com.undertale.fecade.attacktest.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import com.undertale.fecade.AttackUtil;
import com.undertale.model.Boss;
import com.undertale.model.Charactor;

import org.junit.Ignore;

public class AttackUtilTest {

	@Test//(expected = IllegalThreadStateException.class)
	public void testAttackThreadInvokeMethod() {
		Charactor ch = new Charactor("Alex", 100, 0, 0, 10, 5);
		Boss cr = new Boss(1,"a boss", "It is a Boss! Be careful.", 8, 40, 8);
		AttackUtil.attackThreadInvokeMethod(ch, cr.getHP(),cr.getDamage(), cr.getArmor());
	}
}
