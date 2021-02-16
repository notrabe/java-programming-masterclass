package section_04;

public class CodingExercise11 {
	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
	}
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (summer == true) {
			if(temperature > 45 || temperature < 25) {
				return false;
			} else {
				return true;
			}
		} else if(summer == false) {
			if(temperature > 35 || temperature < 25) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
