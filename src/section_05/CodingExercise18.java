package section_05;

public class CodingExercise18 {
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
	}
	
	public static boolean hasSharedDigit(int num1, int num2) {
		if(num1<10||num1>99||num2<10||num2>99) {
			return false;
		}
		
//		because the num1 and num2 can only be 2 digits, num/10 will retrieve the first digit of the number.
		int firstDigitNum1=num1/10;
		int firstDigitNum2=num2/10;
		int lastDigitNum1=num1%10;
		int lastDigitNum2=num2%10;
		
		if(firstDigitNum1==firstDigitNum2||lastDigitNum1==lastDigitNum2||firstDigitNum1==lastDigitNum2||lastDigitNum1==firstDigitNum2) {
			return true;
		}
		return false;
	}
}
