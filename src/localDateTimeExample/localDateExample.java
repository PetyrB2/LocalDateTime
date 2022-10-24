package localDateTimeExample;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class localDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Current Date - NOW
		LocalDate currentDate = LocalDate.now();
		System.out.println("------------------------------------------------------");
		System.out.println("\tDate and Time Revisited by Peter Broadbent");
		System.out.println("------------------------------------------------------\n");
		System.out.println("Current Date: \n\t" + currentDate );
		System.out.println("------------------------------");
		// 10 Days From Now
		LocalDate after10days = currentDate.plusDays(10);
		System.out.println("\nTen Days from Now: \n\t" + after10days);
		System.out.println("------------------------------");
		// 1 Week Before now
		LocalDate oneWeekBefore = currentDate.minusWeeks(1);
		System.out.println("\nOne Week Before Now: \n\t" + oneWeekBefore);
		System.out.println("------------------------------");
		// 5 Days From Now
		System.out.println("\nDate Now: " + currentDate);
		
		currentDate = currentDate.plusDays(5);
		System.out.println("\nDate with 5 days added to IMMUTABLE: \n" + currentDate);
		
		// My Birthday
		LocalDate myBday = LocalDate.of(1901, Month.DECEMBER, 1);
		System.out.println("\n------------------------------\n");
		System.out.println("------> My Birthday <------- \n\t" + myBday);
	
		// isBefore - is my Bday Birthday NOW
		System.out.println("\n------------------------------\n");
		System.out.println("\n-------- Date Comparison ----------------\n");
		System.out.println("Is Birthday before NOW: " + myBday.isBefore(currentDate));
		
		// =============
		// Before JAVA 8 
		// =============
		System.out.println("\n------------------------------\n");
		System.out.println("\n------- Date Before Java 8 -------\n");
		
		Date myCurrentDate = new Date();
		
		System.out.println("Date before Java 8: \n\t" + myCurrentDate);

		Calendar myCalendar = Calendar.getInstance();
		
		myCalendar.set(1901, Calendar.DECEMBER, 3);
		
		Date myBirthday = myCalendar.getTime();
		
		System.out.println("My Birthday prior to Java 8 :\n " + myBirthday);
	
	}
}