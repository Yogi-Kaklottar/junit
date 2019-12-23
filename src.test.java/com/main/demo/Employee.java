package com.main.demo;

public class Employee {
	private String name;
	private double monthSalry;
	private int age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double monthSalry, int age) {
		super();
		this.name = name;
		this.monthSalry = monthSalry;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthSalry() {
		return monthSalry;
	}

	public void setMonthSalry(double monthSalry) {
		this.monthSalry = monthSalry;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + getName() + ", MonthSalry=" + getMonthSalry() + ", Age=" + getAge() + "]";
	}

}
