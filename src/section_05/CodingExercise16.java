package section_05;

public class CodingExercise16 {
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
	}
	
	public static int sumFirstAndLastDigit(int num) {
		if(num < 0 ) {
			return -1;
		}
		
		int lastDigit = num % 10;
		
		while(num >= 10) {
			num = num / 10;
		}
		
		int sum = num + lastDigit;
		
		sum = lastDigit + num;
		return sum;
	}
}
