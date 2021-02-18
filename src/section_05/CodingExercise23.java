package section_05;

public class CodingExercise23 {
	public static void main(String[] args) {
		System.out.println(reverse(123));
		numberToWords(123);
		System.out.println(getDigitCount(123));
		System.out.println();
		System.out.println(reverse(100));
		numberToWords(100);	
		System.out.println(getDigitCount(100));
		System.out.println(getDigitCount(0));
		numberToWords(0);
	}
	
	public static void numberToWords(int number) {		
		if(number<0) {
			System.out.println("Invalid Value");
		} else if(number==0) {
			System.out.println("Zero");
		}
		
		int revNum=reverse(number);
		int lastDigit=0;
		int digitCount=getDigitCount(number);
		int revDigitCount=getDigitCount(revNum);
		
		while(revNum!=0) {
			lastDigit=revNum%10;
			if(lastDigit==1) {
				System.out.println("One");
			} else if(lastDigit==2) {
				System.out.println("Two");
			} else if(lastDigit==3) {
				System.out.println("Three");
			} else if(lastDigit==4) {
				System.out.println("Four");
			} else if(lastDigit==5) {
				System.out.println("Five");
			} else if(lastDigit==6) {
				System.out.println("Six");
			} else if(lastDigit==7) {
				System.out.println("Seven");
			} else if(lastDigit==8) {
				System.out.println("Eight");
			} else if(lastDigit==9) {
				System.out.println("Nine");
			} else if(lastDigit==0) {
				System.out.println("Zero");
			}
			revNum/=10;
		}
		
		if(digitCount>revDigitCount) {
			for(int i=0;i<(digitCount-revDigitCount);i++) {
				System.out.println("Zero");
			}
		}
	}
	
	public static int reverse(int num) {
		int rev=0;
		int lastDigit=0;
		while(num!=0) {
			lastDigit=num%10;
			rev=rev*10+lastDigit;
			num/=10;
		}
		return rev;
	}
	
	public static int getDigitCount(int num) {
		int count=0;
		if(num<0) {
			return -1;
		} else if(num==0){
			return 1;
		}
		
		while(num!=0) {
			num/=10;
			count++;
		}
		return count;
	}
}
