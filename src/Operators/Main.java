package Operators;


public class Main {
	public static void main(String[] args) {
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		int prevResult = result;
		System.out.println("previous result = "  + prevResult);
		result = result - 1;
		System.out.println("3 - 1 = " + result);
		System.out.println("previous result = "  + prevResult);

		result = result * 10;
		System.out.println("2 * 10 = " + result);

		result = result / 5;
		System.out.println("20 / 5 = " + result);

		result = result % 3; // what is left over after 3 is put into the remainder? in this case it is 1.
		System.out.println("4 % 3 = " + result);

		//result = result + 1
		result++;
		System.out.println("1 + 1 = " + result);

		//result = result - 1
		result--;
		System.out.println("2 - 1 = " + result);
		
		//result = result + 2 
		result += 2;
		System.out.println("1 + 2 = " + result);

		//result = result * 10
		result *= 10;
		System.out.println("3 * 10 = " + result);
		
		//result = result / 10
		result /= 10;
		System.out.println("30 / 10 = " + result);
		
		boolean isAlien = false;
		if(isAlien == false) {
			System.out.println("it is not an alien!");
			System.out.println("and I am scared of aliens");
		}
		
		int topScore = 80;
		if(topScore < 100) {
			System.out.println("You got the high score!");
		}
		
		int secondTopScore = 81;
		if((topScore < secondTopScore) && (topScore < 100)) {
			System.out.println("top score is greater than second top score");
		}
		
		if((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("either one or both of the conditions are true");
		}
		
		int newValue = 50;
		if(newValue == 50) {
			System.out.println("this is true");
		}
		
		boolean isCar = false;
		if(isCar == true) {
			System.out.println("This is not supposed to happen");
		}
		if(!isCar) {
			System.out.println("This is supposed to happen");
		}
		if(isCar != true) {
			System.out.println(("This is supposed to happen"));
		}
		
		isCar = true;
		boolean wasCar = isCar ? true : false; //if isCar is true, set wasCar to true. Otherwise, set wasCar to false.
		if(wasCar) {
			System.out.println("wasCar is true");
		}
		
		double firstDouble = 20.00;
		double secondDouble = 80.00;
		double equation = (firstDouble + secondDouble) * 100;
		double remainder = equation % 40.00;
		boolean isTrue = (remainder == 0) ? true : false;
		System.out.println(remainder);
		if(!isTrue) {
			System.out.println("Got some remainder.");
		}
		
		System.out.println(isTrue);
	}
}
