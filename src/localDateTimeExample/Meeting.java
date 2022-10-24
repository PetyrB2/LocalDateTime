package localDateTimeExample;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Meeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Title
		System.out.println("---------------------------");
		System.out.println("____My Meeting Example____ ");
		System.out.println("---------------------------");
		// Blank Line
		System.out.println("");
		
		// Begin code
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		LocalDateTime dateTime1= LocalDateTime.parse("2014-11-25 16:00:00", formatter);
		LocalDateTime dateTime2= LocalDateTime.parse("2014-11-25 19:59:00", formatter);

		long diffInMilli = java.time.Duration.between(dateTime1, dateTime2).toMillis();
		long diffInSeconds = java.time.Duration.between(dateTime1, dateTime2).getSeconds();
		long diffInMinutes = java.time.Duration.between(dateTime1, dateTime2).toMinutes();
		long diffInHours = java.time.Duration.between(dateTime1, dateTime2).toHours();
		
		// Intro
		System.out.println("____________________");
		System.out.println("");
		System.out.println("Fake Current Time: \n\t " + dateTime1);
		System.out.println("");
		
		System.out.println("Meeing Time: \n\t " + dateTime2);
		System.out.println("");
		System.out.println("____________________");
		// Milliseconds
		System.err.println("In MilliSeconds:");
		System.out.println("You have " + diffInMilli + " Seconds until your Meeting.");
		System.out.println("");
		// Seconds
		System.err.println("In Seconds:");
		System.out.println("You have " + diffInSeconds + " Seconds until your Meeting.");
		System.out.println("");
		// Minutes
		System.err.println("In Minutes:");
		System.out.println("You have " + diffInMinutes + " Minutes until your Meeting.");
		System.out.println("");
		// Hours
		
		
		System.err.println("In Hours:");
		System.out.println("You have " + diffInHours + " Hours until your Meeting.");
		System.out.println("");
		System.out.println("---------------");
		System.out.println("");
		System.out.println("");
		System.out.println("P.S. Hours is not very accurate - don't rely on that one. :)");
	}

}
