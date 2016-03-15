package com.cloudgensys.training.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PojoExample> emps = new ArrayList<PojoExample>();
		emps.add(new PojoExample(1,"Sai",10000,true));
		emps.add(new PojoExample(2,"Satya",20000,true));
		emps.add(new PojoExample(3,"Hari",10000,true));
		
		System.out.println("\nId \tName \tSalary \t\tStatus");
	
		for(PojoExample e:emps){
			System.out.println(e.getID()+" \t"+e.getEmpName()+" \t"+e.getSalary()+" \t"+e.isStatus());
		}
	}
}
