package CodingExercises;

public class CodingExercise09 {
	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
		printYearsAndDays(-561600);
	}
	
	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {			
			long totalHours = minutes / 60;
			long totalDays = totalHours / 24;
			long years = totalDays / 365;
			long remainingDays = totalDays % 365;
			
			System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d" );
		}
		
	}
}
