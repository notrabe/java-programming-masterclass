package IfKeywordAndCodeblocks;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Main{
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
//		if(score < 5000 && score > 1000) {
//			System.out.println("Your score was less than 5000 but greater than 1000");
//		} else if (score < 1000) {
//			System.out.println("Your scre was less than 1000");
//		} else {
//			System.out.println("Got here");
//		}
		
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