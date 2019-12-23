package com.main.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeSalaryCount {
	
	EmployeeBussiness employeebussines=new EmployeeBussiness();
	
	@Test
	public void countYearSalry()
	{
		Employee e=new Employee("rajesh patel",7000,23);
		double f=employeebussines.getYearlySalry(e);
		assertEquals(84000, f,0.0);
	}
	@Test
	public void countAppraisial()
	{
		Employee e=new Employee("rajesh patel",7000,23);
		double f=employeebussines.getAppraisial(e);
		assertEquals(1000, f,0.0);
	}

}
