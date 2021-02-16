package MethodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newScore = calculateScore("Evan", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore(); 
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
}
