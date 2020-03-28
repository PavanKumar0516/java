package com.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapdemo {

	public static void main(String[] args) {
		Map<Employ, String> map=new Hashtable<Employ, String>();
		Employ e1=new Employ(101,"pavan",553.23);
		//Employ e2=new Employ();
        map.put(e1, "nagendra");
        //map.put(e2, "nag");
        //map.put(e3, "king");
       /* //map.put("abd", "nagendra");
        map.put(e2, "nagendra");
        map.put(13, "nagendra");*/
        System.out.println(map);
        
	}

}
