package section_04;

public class CodingExercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(-1600));		
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1924));
	}

	public static boolean isLeapYear(int year) {
		if(year < 1 || year > 9999) {
			return false;
		} else if(year % 4 == 0) {
			if(year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}

	}
}
