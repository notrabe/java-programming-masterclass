package section_04;

public class CodingExercise06 {
	public static void main(String[] args) {
		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, -1, 0));
	}
	
	public static boolean hasEqualSum(int num1, int num2, int sum) {
		if(num1 + num2 == sum) {
			return true;
		} else {
			return false;
		}
	}
}
