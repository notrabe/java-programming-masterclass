package IfKeywordAndCodeblocks;


public class Main{
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

		boolean gameOver2 = true;
		int score2 = 10000;
		int levelCompleted2 = 8;
		int bonus2 = 200;

		if(gameOver2 == true) {
			int finalScore = score2 + (levelCompleted2 * bonus2);
			System.out.println("Your final score was " + finalScore);
		}

	}
}