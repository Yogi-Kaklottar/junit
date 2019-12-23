package com.main.java;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.main.testCaseClass.testResultClass;

public class ExamRunner {

	public static void main(String[] args)
	{
	  Result result=JUnitCore.runClasses(testResultClass.class);
	
       for(Failure failure: result.getFailures())
       {
    	  System.out.println(failure.toString());
       }
       System.out.println(result.wasSuccessful());
	}
}
