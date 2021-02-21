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
		BankAccount bankAccount=new BankAccount();

		bankAccount.setName("Evan Barton");
		bankAccount.setAccountNumber(123456789); 
		bankAccount.setBalance(100); 
		bankAccount.setEmail("email@email.com"); 
		bankAccount.setPhoneNumber(123456789); 
		bankAccount.deposit(500);
		System.out.println(bankAccount.getBalance());
		bankAccount.withdraw(300);
		System.out.println(bankAccount.getBalance());
		bankAccount.withdraw(400);
		System.out.println(bankAccount.getBalance());
	}
}
