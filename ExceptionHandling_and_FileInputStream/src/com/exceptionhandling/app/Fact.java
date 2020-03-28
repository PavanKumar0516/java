package com.exceptionhandling.app;

import java.util.Scanner;

public class Fact {
	int s=1;
	public int Factofnum(int n) {
		for(int i=1; i<n;i++) {
			s+=s*i;
			
		}
		System.out.println(s);
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Fact obj=new Fact();
		obj.Factofnum(n);
		/*int k=obj.Factofnum(n);
		System.out.println(k); */

	}

}
