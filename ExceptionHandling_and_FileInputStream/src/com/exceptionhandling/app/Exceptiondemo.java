package com.exceptionhandling.app;

public class Exceptiondemo {

	public static void main(String[] args) {
		int res=0;
		System.out.println("open file");
		System.out.println("write file");
		try {
		 res=Exceptiondemo.div(10,2);
		}
		/*ae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}catch(ArithmeticException ae) {
			*/
		finally {
			 System.out.println("closed");
		}
	    System.out.println(res);
	}
public static int div(int a, int b)throws ArithmeticException {
	return a/b;
}
}


    