package section_05;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class CodingExercise19 {
	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
	}
	
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		if(num1<10||num2<10||num3<10||num1>1000||num2>1000||num3>1000) {
			return false;
		}
		
		int lastDig1=num1%10;
		int lastDig2=num2%10;
		int lastDig3=num3%10;
		
		if(lastDig1==lastDig2||lastDig1==lastDig3||lastDig2==lastDig3) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isValid(int number) {
		if(number<10||number>1000) {
			return false;
		} else {
			return true;
		}
	}
}
