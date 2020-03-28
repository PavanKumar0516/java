package com.exceptionhandling.app;

public class Checkedexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   System.out.println("wait....");
	Thread.sleep(2000);
	System.out.println("Done.....");
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
