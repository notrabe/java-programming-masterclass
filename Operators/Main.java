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
	}
}
