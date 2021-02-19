package section_05;

public class CodingExercise26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(8);
	}

	public static void printSquareStar(int number) {
		if(number<5) {
			System.out.println("Invalid Value");
		} else {
			for(int i=1;i<=number;i++) {
				for(int j=1;j<=number;j++) {
					if(i==1||i==number||j==1||j==number||i==j||i+j==number+i) {
						System.out.println("*");
					} else {
						System.out.println(" ");
					}
				}
				System.out.println();
			}
		}

	}

}
