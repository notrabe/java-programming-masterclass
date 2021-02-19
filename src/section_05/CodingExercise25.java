package section_05;

public class CodingExercise25 {
	public static void main(String[] args) {
		System.out.println(getLargestPrime(217));	
		System.out.println(getLargestPrime(21));	
		System.out.println(getLargestPrime(0));	
	}
	
	public static int getLargestPrime(int number) {
		int i=0;
		int num=number;
		if(number<2) {
			return -1;
		}
		
		for(i=2;i<num;i++) {
			if(num%i==0) {
				num/=i;
				i--;
			}
		}
		return i;
	}
}
