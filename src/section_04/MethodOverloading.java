package section_04;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newScore = calculateScore("Evan", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore();
		System.out.println(calcFeetAndInchesToCentimeters(1, 10));
		System.out.println(calcFeetAndInchesToCentimeters(49));
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore() {
		System.out.println("No player name, no score.");
		return 0;
	}
	
	public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
		if (feet < 0 || inches < 0) {
			return -1;
		}
		
		int feetToInches = feet * 12;
		int totalInches = feetToInches + inches;
		double centimeters = totalInches * 2.54;
		
		return centimeters;
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches) {
		if (inches < 0) {
			return -1;
		}
		
		double centimeters = inches * 2.54;
		int feet = inches / 12;
		int remainingInches = inches % 12;

		calcFeetAndInchesToCentimeters(feet, remainingInches);
		
		return centimeters;
	}
}
