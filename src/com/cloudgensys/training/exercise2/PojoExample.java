package com.cloudgensys.training.exercise2;

public class PojoExample {
	
	private int ID;
	private String empName;
	private float salary;
	private boolean status;
	
	PojoExample(int id,String empName,float empSalary,boolean status){
		this.ID = id;
		this.empName=empName;
		this.salary=empSalary;
		this.status=status;		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

		
}
