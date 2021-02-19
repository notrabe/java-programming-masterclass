package section_05;

import java.util.Scanner;

public class CodingExercise27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputThenPrintSumAndAverage();
	}
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		int count=0;
		int avg=0;
		while(true) {
			boolean isInt=scanner.hasNextInt();
			if(isInt) {
				int num=scanner.nextInt();
				sum+=num;
				count++;
			} else {
				break;
			}
			scanner.nextLine();
		}
		avg=(int)Math.round((double)sum/count);
		System.out.println("SUM = "+sum+" AVG = "+avg);
		scanner.close();
	}
}
