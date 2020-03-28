package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assume;
import org.junit.Ignore;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
	static Calculator cal;
	@BeforeAll
	public static void getCal() {
		cal=new Calculator();
	
	}
	@ParameterizedTest
	//@ValueSource(string s= {"pavan","nagendra","ka"})
	void m1(String s) {
		assertTrue(s.length()>3);
	}
	
	
	
    @RepeatedTest(4)
	//@Disabled
    
	void testAdd() {
		//assertEquals(10, cal.add(5, 5));
		assumeTrue(10==cal.add(5, 5));
		System.out.println("helo");
	}

	@Test
	void testSub() {
		assertSame(5, cal.sub(8, 3));
	}

	@Test
	void testMul() {
		assertTrue(15  == cal.mul(5, 3));
	}

}
