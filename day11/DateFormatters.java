package day11;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateFormatters {
	
	public static void main(String[] args) {
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now);
		String mydate = now.format(DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss"));
		System.out.println(mydate);
		
		mydate = now.format(DateTimeFormatter.ofPattern("dd/MM/YY HH:mm:ss"));
		System.out.println(mydate);
				
		mydate = now.format(DateTimeFormatter.ofPattern("E-MM-YYYY HH:mm:ss"));
		System.out.println(mydate);
				
		mydate="2024-09-14 11:27:00";
		
		LocalDateTime dt= LocalDateTime.parse(mydate,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(dt);
				
	}

}
