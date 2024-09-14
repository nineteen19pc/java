package day11;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

//import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoLocalDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate christmas= LocalDate.of(2024,12,25);
		Period timetoChristmas=today.until(christmas);
		System.out.println("time to christmas: "+ timetoChristmas.getYears()+" years, "+ 
		timetoChristmas.getMonths() + " months, "+timetoChristmas.getDays()+" days");
		
		LocalDate nextweek= today.plusWeeks(1);
		System.out.println(nextweek);
		
		LocalDate nextmonth=today.plus(1,ChronoUnit.MONTHS);
		System.out.println(nextmonth);
		
		if(today.isBefore(christmas))
		{
			System.out.println("Still have Time");
		}
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
//		System.out.println(today.getDayOfMonth());
		
		Stream<LocalDate>thisyear=LocalDate.of(2024, 1, 1).datesUntil(LocalDate.of(2025,1,1));
		Predicate<LocalDate> fridays=(dt)->dt.getDayOfWeek().equals(DayOfWeek.FRIDAY);
		Predicate<LocalDate> the13th=(dt)->dt.getDayOfMonth()==13;
		List<LocalDate> fridaythe13th= thisyear.filter(fridays).filter(the13th).
				collect(Collectors.toList());
		System.out.println(fridaythe13th);
		
		System.out.println("------------------------------");
		
		  LocalDateTime dateTime = LocalDateTime.now();
	        
	        // Accessing date parts
	        int year = dateTime.getYear();
	        int month = dateTime.getMonthValue(); // or dateTime.getMonth().getValue()
	        int dayOfMonth = dateTime.getDayOfMonth();
	        int dayOfWeek = dateTime.getDayOfWeek().getValue(); // 1 = Monday, 7 = Sunday

	        // Accessing time parts
	        int hour = dateTime.getHour();
	        int minute = dateTime.getMinute();
	        int second = dateTime.getSecond();
	        int nano = dateTime.getNano();
	        
	        System.out.println("Year: " + year);
	        System.out.println("Month: " + month);
	        System.out.println("Day of Month: " + dayOfMonth);
	        System.out.println("Day of Week: " + dayOfWeek);
	        System.out.println("Hour: " + hour);
	        System.out.println("Minute: " + minute);
	        System.out.println("Second: " + second);
	        System.out.println("Nano: " + nano);

	}


	}


