package com.exceptionhandling.app;

import java.util.Scanner;



public class Palindrom {
	String res="";
  public void findpalind(String str) {
	  StringBuffer sb=new StringBuffer(str);
	  res=sb.reverse().toString();
	if(str.equals(res)) {
		System.out.println("The given String is Plaindrome");
	}else {
		System.out.println("The given String is not Plaindrome");
	}
	
	  
  }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String :");
		String str=scan.nextLine();
		
		Palindrom p=new Palindrom();
		p.findpalind(str);
		

	}

}
