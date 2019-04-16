package com.undertale.fecade.attacktest.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		 Result result = JUnitCore.runClasses(AttackUtilTest.class);
	      for (Failure failure : result.getFailures()) {
	    	 System.out.println(failure.toString());
	         //System.out.println(failure.toString()+"\nBut it did not happen during junit test");
	      }
	      if(result.wasSuccessful()==true)
	      System.out.println("Attack Thread Invoke Test Pass. ");
	      else {
	    	  System.out.println("Here is an exception during junit test.");
	      }
	}
}
