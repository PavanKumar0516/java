package com.exceptionhandling.app;
import java.time.LocalDate;
import java.util.Date;
public class Datedemo {

	public static void main(String[] args) {
     Date d1=new Date();
     Date d2=new Date(9999999L);
     Date d3=new Date();
     System.out.println(d1);
     //System.out.println(d3.minus);
     LocalDate d4=LocalDate.now();
     System.out.println(d4.getDayOfMonth());
     System.out.println(d4.getDayOfYear());
     System.out.println(d4.getDayOfWeek());
     //System.out.println(d4.getDay);
	}

}
