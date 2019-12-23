package com.main.testCaseClass;

import org.junit.Test;

import com.main.java.Example;

import junit.framework.TestCase;

public class TestClass extends TestCase {
	
	@Test
	public void test1()
	{
		Exampal1 ex=new Exampal1();
		ex.display();
	}
	
	@Test
	public void test2() {
		Example2 ex=new Example2();
		ex.display();
	}
	@Test
	public void test3() {
		test2();
		System.out.println(this.countTestCases());
		System.out.println(this.createResult().toString());
		System.out.println(this.getName());
				
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println(countTestCases());
	}

}
