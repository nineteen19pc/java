package day11;
import java.time.ZoneId;
//import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.util.Set;
import java.time.Duration;
//import java.time.LocalDate;
//import java.time.DayOfWeek;
//import java.time.Duration;
//import java.time.Period;
//import java.time.temporal.ChronoUnit;
//import java.util.Set;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class DemoZones {
	public static void main(String[] args) {
		Set<String> zones=ZoneId.getAvailableZoneIds();
		System.out.println(zones);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		ZonedDateTime newyork= ZonedDateTime.of(dt,ZoneId.of("America/New_Yoirk"));
		System.out.println(newyork);
		
		Instant nycurrent= newyork.toInstant();
		ZonedDateTime india= nycurrent.atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(india);
		
		LocalDateTime indialocal= india.toLocalDateTime();
		LocalDateTime nylocal= newyork.toLocalDateTime();
		
		Duration.between(indialocal, nylocal);


		
		
	}

}
