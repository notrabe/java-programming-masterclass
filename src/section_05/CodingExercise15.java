package section_05;

public class CodingExercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
	}
	
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int newNum = number;
		
		while(number != 0) {
			int lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number = number / 10;
		}
		
		
		if(reverse == newNum) {
			return true;
		} else {
			return false;
		}
	}

}
