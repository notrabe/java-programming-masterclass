package section_05;

public class WhileStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		while(count != 5) {
			count++;
			System.out.println("count value is " + count);
		}
		
		count = 0;
		while(true) {
			if(count == 5) {
				break;
			} else {				
				count++;
				System.out.println("count value is " + count);
			}
		}
	}
}
