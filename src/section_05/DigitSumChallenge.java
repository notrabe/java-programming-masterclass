package section_05;

public class DigitSumChallenge {
	public static void main(String[] args) {
		System.out.println(sumDigits(321));
		System.out.println(-1);
	}
	
	public static int sumDigits(int number) {
		int sum = 0;
		
		if(number < 10) {
			return -1;
		}
		
		while(number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		
		return sum;
	}
}
