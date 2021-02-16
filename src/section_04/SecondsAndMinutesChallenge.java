package section_04;

public class SecondsAndMinutesChallenge {
	
	public static void main(String[] args) {
		System.out.println(getDurationString(60, 0));
		System.out.println(getDurationString(45, 31));
		System.out.println(getDurationString(-1, 0));
		System.out.println(getDurationString(120, 0));
		System.out.println(getDurationString(45));
		System.out.println(getDurationString(121));
		System.out.println(getDurationString(100000));
	}
	
	public static String getDurationString(int minutes, int seconds) {
		if (minutes < 0 || seconds < 0 || seconds > 59) {
			return "Invalid Value";
		}
		
		int hours = 0;
		
		if(minutes > 59) {
			hours = minutes / 60;
			minutes = minutes % 60;
		}
		
		String hoursMinsSeconds = hours + "h " + minutes + "m " + seconds + "s";  
		
		return hoursMinsSeconds;
	}
	
	public static String getDurationString(int seconds) {
		if (seconds < 0) {
			return "Invalid Value";
		}
		
		int minutes = 0;
		
		if(seconds > 59) {
			minutes = seconds / 60;
			seconds = seconds % 60;
		}
		
		return getDurationString(minutes, seconds);
	}
}
