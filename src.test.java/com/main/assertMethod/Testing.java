package com.main.assertMethod;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Testing {

	@Test
	public void display()
	{
		Test1 t=new Test1();
		int n=t.squre(5);
		String s=null;
		String p="hello world";
		//assertEquals(25,n);
		//assertFalse(n<225);
		//assertTrue(true);
		//assertNull(s);
		assertNotNull(s);
	}
}
