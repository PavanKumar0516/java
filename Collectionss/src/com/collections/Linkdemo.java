package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Linkdemo {
    
	public static void main(String[] args) {
		Set<String> set=new TreeSet<String>();
		//System.out.println(set.add(new Integer(5)));
		set.add("kiran");
		set.add("pak");
		//set.add(null);
		//System.out.println(set.add(new Integer(1)));
       System.out.println(set);
	}

}
