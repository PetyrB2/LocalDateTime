package localDateTimeExample;

import java.time.LocalDate;

public class localDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Current Date
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate );
		
		// 10 days from now
		LocalDate after10days = currentDate.plusDays(10);
		System.out.println("Ten Days from Now: " + after10days);
	
		// 1 Week Before now
		LocalDate oneWeekBefore = currentDate.minusWeeks(1);
		System.out.println("One Week Before Now: " + oneWeekBefore);
			
	}

}