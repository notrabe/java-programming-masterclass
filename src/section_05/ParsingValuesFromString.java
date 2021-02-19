package section_05;

public class ParsingValuesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberAsString = "2018.125";
		System.out.println("numberAsString = "+numberAsString);
		
		double number = Double.parseDouble(numberAsString);
		System.out.println("number = "+number);
		
		numberAsString+=1;
		number+=1;
		System.out.println("numberAsString = "+numberAsString);
		System.out.println("number = "+number);
	}
}
