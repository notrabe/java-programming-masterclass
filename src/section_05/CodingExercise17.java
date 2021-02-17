package section_05;

public class CodingExercise17 {
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));
	}
	
	public static int getEvenDigitSum(int number) {
		int sum = 0;
		if(number < 0) {
			return -1;
		}
//			while loop to iterate through number
		while(number!=0) {
			
//			number%10 = last digit from number, %2 checks if it is even, if it is even, add it to the sum
			if((number%10)%2==0) {
				sum = sum + number%10;
			}
			
//			number/10 moves to next digit in the number
			number=number/10;
		}
		return sum;
	}
}
