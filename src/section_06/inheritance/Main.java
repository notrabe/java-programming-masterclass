/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section_06.inheritance;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Main {
	public static void main(String[] args) {
		Animal animal=new Animal("Animal", 1, 1, 5, 5);
		Dog dog=new Dog("Yorke", 8, 20, 2, 4, 1, 20, "long silky");
		dog.eat();
//		dog.walk();
		dog.run();
	}
	
}
