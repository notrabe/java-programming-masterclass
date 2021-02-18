package section_05;

public class CodingExercise20 {
	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));
		System.out.println(getGreatestCommonDivisor(12, 30));
		System.out.println(getGreatestCommonDivisor(9, 18));
	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		int greatestCommonDivisor=0;
		
		if(first<10||second<10) {
			return -1;
		}
		
//		check if first or second number is higher, use that to make sure you loop for the correct length
		if(first>second) {
			for(int i=1;i<first;i++) {
//				if we reach a number that both numbers are divisible by, that number is assigned to a variable. This will continue until we reach the end of the loop, meaning that eventually that greatest common divior will be reached.
				if(first%i==0&&second%i==0) {
					greatestCommonDivisor=i;
				}
			}
		} else if(second>first) {
			for(int j=1;j<second;j++) {
				if(second%j==0&&first%j==0) {
					greatestCommonDivisor=j;
				}
			}
		}
		return greatestCommonDivisor;
	}
}
