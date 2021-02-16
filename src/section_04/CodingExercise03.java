package section_04;


public class CodingExercise03 {
	public static void main(String[] args) {
		System.out.println(shouldWakeUp(false, 2));
		System.out.println(shouldWakeUp(true, 1));
		System.out.println(shouldWakeUp(false, 2));
		System.out.println(shouldWakeUp(true, -1));
	}
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (barking == false) {
			return false;
		} else if (hourOfDay < 0 || hourOfDay > 23) {
			return false;
		} else if(barking == true && hourOfDay < 8 || barking == true && hourOfDay > 22) {
			return true;
		} else {
			return false;
		}
	}
}
