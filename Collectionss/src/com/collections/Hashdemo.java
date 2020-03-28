package com.collections;

import java.util.HashSet;
import java.util.Set;

public class Hashdemo {
     public static void main(String args[]) {
	    Set<Employ> set=new HashSet<Employ>();
		
		Employ e1=new Employ(101,"pavan",553.23);
		Employ e2=new Employ(101,"pavan",553.23);
		Employ e3=new Employ(101,"pavan",553.23);
		Employ e4=new Employ(101,"pavan",553.23);
	
       set.add(e1);
       set.add(e2);
       set.add(e3);
     }
}
