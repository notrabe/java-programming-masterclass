package CodingExercises;

public class CodingExercise05 {
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
		double num1ToInt = num1 * 1000;
		double num2ToInt = num2 * 1000;
		
		if((int)num1ToInt == (int)num2ToInt) {
			return true;
		} else {
			return false;
		}
	}
}
