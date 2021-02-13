package Methods;

public class Main {

    public static void main(String[] args) {    
        displayHighScorePosition("Evan", calculateHighScorePosition(1500));
        displayHighScorePosition("Bill", calculateHighScorePosition(900));
        displayHighScorePosition("Bob", calculateHighScorePosition(400));
        displayHighScorePosition("Joe", calculateHighScorePosition(50));
        System.out.println("Your final score was " + calculateScore(true, 800, 5, 100)); 
        System.out.println("Your final score was " + calculateScore(true, 10000, 8, 200));

        printConversion(1.5);
        printConversion(-2);
        printConversion(95.75);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;      
    }

    public static  void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if(score > 1000){
            return 1;
        } else if(score >= 500){
            return 2;
        } else if(score >= 100){
            return 3;
        } else {
            return 4;
        }
    }

    // write your code here

    //this is the correct function, directions say to use Math.round which rounds to the nearest whule number. Test for 95.75kmh is 59.03mph (rounded to 59) but the test expects 60mph.
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        } else {
            long i = Math.round(kilometersPerHour * .621371);
            return i;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else{
            long YY = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "kph = " + YY + "mph");
        }
    }
}
