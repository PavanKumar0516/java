package com.collections;

import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class Setdemo {
	Set<Employee> set=new TreeSet<Employee>();
      public Set<Employee> getMethod() {
    	  set.add(new Employee(101));
    	  set.add(new Employee(102));
    	  set.add(new Employee(103));
    	  set.add(new Employee(104));
    	  return set;
      }
	public static void main(String[] args) {
		Setdemo obj=new Setdemo();
		obj.getMethod();
		Set<Employee> str=obj.getMethod();
		System.out.println(str);
		
      
	}

}
