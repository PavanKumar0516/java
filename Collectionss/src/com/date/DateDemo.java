package com.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class DateDemo {
	static LocalDateTime date2 = LocalDateTime.now();
public static int getExperienceByYears(LocalDateTime date1) {
	long years = ChronoUnit.YEARS.between(date1, date2);
	//int n = years.intValue(); 
	return (int)years;
}
public static int getExperienceByMonths(LocalDateTime date1) {
	long months = ChronoUnit.MONTHS.between(date1, date2);
	//int n = months.intValue(); 
	return (int)months;
	
}
public static int getExperienceByDays(LocalDateTime date1) {
	long days = ChronoUnit.DAYS.between(date1, date2);
	int n = (int)days; //days.intValue(); 
	return n;
	
}
public static int getExperienceByWeeks(LocalDateTime date1) {
	long weeks = ChronoUnit.WEEKS.between(date1, date2);
	int n = (int)weeks; //days.intValue(); 
	return n;
	
}
public static long getExperienceByHour(LocalDateTime date1) {
	long hour = ChronoUnit.HOURS.between(date1, date2);
	return  hour;
	
	//(int) d.get(ChronoUnit.MINUTES);
}
public static long getExperienceByMinutes(LocalDateTime date1) {
	long min = ChronoUnit.MINUTES.between(date1, date2);
	return  min;
	
	//(int) d.get(ChronoUnit.MINUTES);
}
public static long getExperienceBySeconds(LocalDateTime date1) {
	long sec = ChronoUnit.SECONDS.between(date1, date2);
	return  sec;
	
	//(int) d.get(ChronoUnit.MINUTES);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
		System.out.println("Enter your dob (DD-MM-YYYY):");
		String str = sc.next();
		// sc.nextLine();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime date1 = LocalDateTime.parse(str, format);
		System.out.println("years-"+getExperienceByYears(date1));
		System.out.println("months-"+getExperienceByMonths(date1));
		System.out.println("weeks-"+getExperienceByWeeks(date1));
		System.out.println("days-"+getExperienceByDays(date1));
		System.out.println("hours-"+getExperienceByHour(date1));
	System.out.println("minutes"+getExperienceByMinutes(date1));
	System.out.println("sec-"+getExperienceBySeconds(date1));
		} catch (DateTimeParseException e) {
			//e.printStackTrace();
			System.err.println("ENTER VALID DATE");
		}
	}

}
