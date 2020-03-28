package com.practice;

import java.time.*;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
// program to claculate years of dob
public class DateDemo {

	public static void main(String[] args) {
		String str=new Scanner(System.in).nextLine();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date=LocalDate.parse(str, format);
		LocalDate d1= LocalDate.of(2022,Month.JUNE,30);
		Period p= d1.until(date);
		//System.out.println(date.isLeapYear());
		//System.out.println(p.getYears());
		Long days=ChronoUnit.YEARS.between(date, d1);
		//Long days=ChronoUnit.MONTHS.between(date, d1); returns months
		//Long days=ChronoUnit.DAYS.between(date, d1); returns days
		System.out.println(days);

	}

}
