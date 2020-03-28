package com.collections;

public class Employ implements Comparable<Employ>{
	private int eid;
    private String ename;
    private double sal;
    
	public Employ(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
     public String toString(){
    	 return eid+"";
     }
     public int hashCode() {
    	 return eid;
     }
	@Override
	public int compareTo(Employ e2) {
		Employ e1=this;
		String s1=e1.toString();
		String s2=e2.toString();
		return s1.compareTo(s2);
	}
	
	
}
