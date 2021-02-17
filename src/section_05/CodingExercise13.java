package section_05;

public class CodingExercise13 {
	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2000));
		System.out.println(getDaysInMonth(1, 2020));
		System.out.println(getDaysInMonth(2, 2020));
		System.out.println(getDaysInMonth(2, 2018));
		System.out.println(getDaysInMonth(-1, 2020));
		System.out.println(getDaysInMonth(1, -2020));
	}

	public static boolean isLeapYear(int year) {
		if(year < 1|| year > 9999) {
			return false;
		} else if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
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

	public static int getDaysInMonth(int month, int year) {
		if(month < 1 || month > 12 || year < 1 || year > 9999) {
			return -1;
		} else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if(month == 2){
			if(isLeapYear(year) == true) {
				return 29;
			} else {
				return 28;
			}
		} else {
			return 30;
		}
	}
}
