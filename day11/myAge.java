package day11;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.DayOfWeek;
import java.time.Period;
import java.time.Duration;

public class myAge {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2001, 3, 25); 
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        long totalDays = birthDate.until(currentDate).toTotalMonths() * 30 + period.getDays();
        System.out.printf("Age is: %d years, %d months, %d days.%n", period.getYears(), period.getMonths(), period.getDays());
        System.out.println("Total days lived: " + totalDays);

        int year = 2024;
        boolean isLeapYear = Year.isLeap(year);
        LocalDate programmersDay = LocalDate.of(year, Month.SEPTEMBER, isLeapYear ? 12 : 13);
        System.out.println("Programmer's Day in " + year + " is: " + programmersDay);

        for (Month month : Month.values()) {
            LocalDate firstOfMonth = LocalDate.of(year, month, 1);
            if (firstOfMonth.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println(month + " starts on a Sunday.");
            }
        }
        LocalTime departure = LocalTime.of(12, 0); 
        LocalTime arrival = LocalTime.of(16, 40); 
        Duration flightDuration = Duration.between(departure, arrival);
        System.out.println("Flight duration: " + flightDuration.toHours() + " hours and " + 
        flightDuration.toMinutesPart() + " minutes.");
    }
}
