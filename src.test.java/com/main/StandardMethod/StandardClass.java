package com.main.StandardMethod;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StandardClass {
	
	
	
	@Before
	public void dis3()
	{
		System.out.println("before annotation");
	}
	@Test
	public void test1()
	{
		System.out.println("test annotation");
	}
	@After 
	public void dis()
	{
		System.out.println("after anotation");
	}

}
