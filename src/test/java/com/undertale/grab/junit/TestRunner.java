package com.undertale.grab.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
	public static void main(String[] args) {
		
		System.out.println("Testing Grab Potion:");
		Result potionResult = JUnitCore.runClasses(GrabPotionTest.class);
	      for (Failure failure : potionResult.getFailures()) {
	         System.out.println(failure.toString());
	      }
	    System.out.println("Result: " + potionResult.wasSuccessful());
	    
	    System.out.println("Testing Grab Arm:");
		Result armResult = JUnitCore.runClasses(GrabArmTest.class);
	      for (Failure failure : armResult.getFailures()) {
	         System.out.println(failure.toString());
	      }
	    System.out.println("Result: " + armResult.wasSuccessful());
	    
	    System.out.println("Testing Grab Armor:");
		Result armorResult = JUnitCore.runClasses(GrabArmorTest.class);
	      for (Failure failure : armorResult.getFailures()) {
	         System.out.println(failure.toString());
	      }
	    System.out.println("Result: " + armorResult.wasSuccessful());
	}

}
