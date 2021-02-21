/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section_06.coding_exercises;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class CodingExercise30Person {
	public static void main(String[] args) {
		CodingExercise30Person person = new CodingExercise30Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("fullName= "+person.getFullName());
		System.out.println("teen= "+person.isTeen());
	}
	private String firstName;	
	private String lastName;	
	private int age;

	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public int getAge(){
		return this.age;
	}
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	public void setAge(int age){
		if(age<0||age>100){
			this.age=0;
		}else{
			this.age=age;
		}
	}
	public boolean isTeen(){
		if(age>12&&age<20){
			return true;
		}else{
			return false;
		}
	}
	public String getFullName(){
		if(this.firstName.isEmpty()&&this.lastName.isEmpty()){
			return "";
		} else if(this.firstName.isEmpty()){
			return this.lastName;
		} else if(this.lastName.isEmpty()){
			return this.firstName;
		} else {
			return this.firstName+" "+this.lastName;
		}
	}
}
