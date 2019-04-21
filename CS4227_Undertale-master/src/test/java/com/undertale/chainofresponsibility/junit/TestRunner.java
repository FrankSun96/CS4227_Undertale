package com.undertale.chainofresponsibility.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing Boss:");
		Result result = JUnitCore.runClasses(BossAttackConcreteHandlerTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	     // System.out.println(result.wasSuccessful());
	      
	    System.out.println("Testing Creep:");
	    Result result1 = JUnitCore.runClasses(BossAttackConcreteHandlerTest.class);
	      for (Failure failure1 : result1.getFailures()) {
	         System.out.println(failure1.toString());
	      }
	      System.out.println("Boss result: " + result.wasSuccessful());
	      System.out.println("Creep result: " + result1.wasSuccessful());
	}

}
