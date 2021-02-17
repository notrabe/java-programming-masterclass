package section_05;

public class ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
		System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3));
		System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4));
		System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5));
		
		int count = 0;
		
		for(int i = 2; i < 10; i++) {
			if(isPrime(i) == true) {
				count++;
				System.out.println(i);
				if(count == 3) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
	}
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate/100)); 
	}
}
