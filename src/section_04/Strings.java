package section_04;

public class Strings {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more";
        System.out.println("My string is equal to: " + myString);
        myString = myString + " ©2019";
        System.out.println("My string is equal to: " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to "+ lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
