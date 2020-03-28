package com.collections;

public class Test {

	public static void main(String[] args) {
		StudentDemo obj=new StudentDemo();
		obj.setMarks(65);
		obj.setSid(101);
		obj.setSname("Nafgag");
		try {
			boolean p=obj.getSname().matches("[A-Z][a-z]{5,}]");
			if(p==true) {
				System.out.println("valid name");
			}
			else {
				throw new StudentFailedException("fail.....");
			}
		/*if(obj.getMarks()>70 ) {
			System.out.println("passed.....");
		}
		else {
			throw new StudentFailedException("fail.....");
		}*/
		}
		catch(StudentFailedException e) {
			e.printStackTrace();
		}
			

	}

}
