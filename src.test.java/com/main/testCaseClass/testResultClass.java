package com.main.testCaseClass;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestResult;
public class testResultClass extends TestResult{
	
	@Override
	public synchronized void addError(Test test, Throwable e) {
		// TODO Auto-generated method stub
		super.addError(test, e);
	}
	
	@Override
	public synchronized void addFailure(Test test, AssertionFailedError e) {
		// TODO Auto-generated method stub
		super.addFailure(test, e);
	}
	
	@Override
	public void endTest(Test test) {
		// TODO Auto-generated method stub
		System.out.println("end test");
		super.endTest(test);
		
	}
	
	@org.junit.Test
	public void addtest()
	{
		Example2 ex=new Example2();
		ex.display();
	}
	 @Override
	public void startTest(Test test) {
		// TODO Auto-generated method stub
		 System.out.println("start test");
		super.startTest(test);
		
	}
}
