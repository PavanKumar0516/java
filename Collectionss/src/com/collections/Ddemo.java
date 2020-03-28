package com.collections;

public class Ddemo {
	static int v;
	public Ddemo() {
		v=99;
		System.out.println(v);
	}
	public static void main(String[] args) {
		 int a=33;
		Ddemo d=new Ddemo();
System.out.println("this is main");
	}
	static {
		System.out.println("hi static");
	}
	{
		System.out.println("out block");
	}

}
