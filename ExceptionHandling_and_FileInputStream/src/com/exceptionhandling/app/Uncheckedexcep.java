package com.exceptionhandling.app;

public class Uncheckedexcep {

	public static void main(String[] args) {
		int account[] ={101,102,103,104,105};
		String[] names= {"KIng", "pavan", "nagendra" ,"chandu","kiran"};
		double amount[] ={9000,8000,7000,5200,6500};
		System.out.println("Acno Names Amount"); 
		for(int i=0;i<account.length;i++) {
			System.out.println(account[i]+"  "+names[i]+"  "+amount[i]);
			/*if(amount[i] < 1000) {
				try {
				throw new LowBalException();
				}
				catch( LowBalException()) {*/
					System.err.println("low balance");
				}
			}
		//}
	}


