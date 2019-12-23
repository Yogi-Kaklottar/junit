package com.main.java;

import org.junit.Test;

import junit.framework.TestCase;

public class Example extends TestCase {
	@Test
	public void test()
	{
		System.out.println("example run");
	}
	//any task tobe done after will be execute this method
	@Override
	protected void tearDown() throws Exception {
		System.out.println("last call");
		super.tearDown();
	}
	//any task to be run before will be execute
	@Override
	protected void setUp() throws Exception {
		System.out.println("first call");
		super.setUp();
	}
	
}
