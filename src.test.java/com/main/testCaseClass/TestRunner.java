package com.main.testCaseClass;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestResult;
import junit.framework.TestSuite;

import org.junit.runner.JUnitCore;

public class TestRunner {
	
	public static void main(String[] args)
	{
//		Result result=JUnitCore.runClasses(TestClass.class);
//		
//		for(Failure failure:result.getFailures())
//		{
//			System.out.println(failure.toString());
//		}
//		System.out.println(result.wasSuccessful());
		
		
		TestSuite testsuit=new TestSuite(TestClass.class,testResultClass.class);
		TestResult result=new TestResult();
		
		testsuit.run(result);
		System.out.println(result.runCount());
		System.out.println(result.failureCount());
	    
	}
		

}
