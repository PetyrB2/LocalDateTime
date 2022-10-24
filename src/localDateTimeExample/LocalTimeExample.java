package localDateTimeExample;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Title
		System.out.println("---------------------------");
		System.out.println("____Local Time Example____ ");
		System.out.println("---------------------------");
		// Blank Line
		System.out.println("");
		
		// Begin code
		// Set Time as currentTime
		LocalTime currentTime = LocalTime.now();
		
		// Print Current Time
		System.out.println("Current Time: \n\t" + currentTime);
		//Breaker
		System.out.println("\t_____________");
		//Blank Line
		System.out.println("");
			
		// Time  hours from now
		LocalTime threeHourFromNow = currentTime.plusHours(3);
		System.out.println("Three hours from Now: \n\t" + threeHourFromNow);
		//Breaker
		System.out.println("\t_____________");
		//Blank Line
		System.out.println("");
		
				
		// Ten Minutes Ago
		LocalTime tenMinutesAgoFromNow = currentTime.minusMinutes(10);
		System.out.println("Current Time: \n\t" + currentTime);
		System.out.println("Ten Minutes ago: \n\t" + tenMinutesAgoFromNow);
		//Breaker
		System.out.println("\t_____________");
		//Blank Line
		System.out.println("");
	
		
		// New vailable to currenttime object
		currentTime = currentTime.plusHours(2);
		System.out.println("CurrentTime edited 2 Hours ahead: \n\t" + currentTime);
		System.out.println("CurentTime() now equals two hours forward");
	
	}

}
