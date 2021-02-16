package section_04;

public class CodingExercise02 {
	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);
	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int megaBytes = (int)kiloBytes / 1024;
			int remainder = kiloBytes % 1024;  
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
		}
	}
}
