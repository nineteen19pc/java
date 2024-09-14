package day11;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

//import java.time.LocalDate;
//import java.time.DayOfWeek;
//import java.time.Period;
//import java.time.temporal.ChronoUnit;
//import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;


public class DemoLocalTime {
	
	public static void main(String[] args) {
		LocalTime now=LocalTime.now();
		System.out.println(now);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		dt= LocalDate.now().atTime(LocalTime.of(12, 00));
		System.out.println(dt);

	}
	
}
