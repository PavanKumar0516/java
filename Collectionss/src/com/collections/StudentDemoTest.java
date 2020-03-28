package com.collections;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StudentDemoTest {
	static StudentDemo obj;
	@BeforeAll
	public static void getStudentDemo() {
		obj=new StudentDemo();
		obj.setMarks(75);
		obj.setSid(101);
		obj.setSname("pavan");
	}
	
	
	@Test
	void testGetsname() {
     
	}

	@Test
	void testGetsid() {
       assertEquals(101,obj.getSid());
	}

	@Test
	void testGetmarks() {
		assertEquals(101,obj.getMarks());
	}

}
