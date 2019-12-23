package com.main.demo;

public class EmployeeBussiness {
	
	public double getYearlySalry(Employee e)
	{
		double d=e.getMonthSalry()*12;
		return d;
	}
	
	public double getAppraisial(Employee e)
	{
		if(e.getMonthSalry()<10000)
		{
			return 1000;
		}
		else
		{
			return 2000;
		}
	}

}
