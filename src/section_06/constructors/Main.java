/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section_06.constructors;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Main {
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount(12345, 100, "Evan Barton", "evan@evan.com", 12343456);

		System.out.println(bankAccount.getBalance());
		bankAccount.withdraw(300);
		System.out.println(bankAccount.getBalance());
		bankAccount.withdraw(400);
		System.out.println(bankAccount.getBalance());
	}
}
