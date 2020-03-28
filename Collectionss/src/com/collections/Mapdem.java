package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapdem {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "b");
		map.put(4,"l");
		map.put(3, "u");
		map.put(2, "e");
		System.out.println(map);
		Set<Integer> set=map.keySet();
		Collection<String> c=map.values();
		Iterator<Integer> itr=set.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			
		}

	}

}
