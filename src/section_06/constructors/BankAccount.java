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
public class BankAccount {
	private int accountNumber;
	private double balance;
	private String name;
	private String email;
	private int phoneNumber;

	public int getAccountNumber(){
		return this.accountNumber;
	}
	public double getBalance(){
		return this.balance;
	}
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
	public int getPhoneNumber(){
		return this.phoneNumber;
	}
	public void setAccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public double deposit(double funds){
		return this.balance+=funds;
	}
	public double withdraw(double funds){
		return this.balance-=funds;
	}
}
