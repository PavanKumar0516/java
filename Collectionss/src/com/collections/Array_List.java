package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Array_List {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();     //LinkedList<String>();//ArrayList<String>();
		List<String> mylist=getList(list);
		/*for (String s : mylist) {
			System.out.println(s);
		}*/
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			String s=itr.next().toString();
			System.out.println(s);
		}
	}
	public static List<String> getList(List<String> l) {
		l.add("shiva");
		l.add("manu");
		l.add("sri");
		l.add("msd");
		l.add("ppsd");
		l.remove(1);
		return l;
	}

}
