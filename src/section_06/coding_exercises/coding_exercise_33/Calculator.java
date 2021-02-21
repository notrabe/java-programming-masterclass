/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section_06.coding_exercises.coding_exercise_33;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Calculator {
	public static void main(String[] args) {
		Carpet carpet=new Carpet(3.5);
		Floor floor=new Floor(2.75, 4.0);
		Calculator calculator=new Calculator(floor, carpet);
		System.out.println("total= "+calculator.getTotalCost());
		carpet=new Carpet(1.5);
		floor=new Floor(5.4, 4.5);
		calculator=new Calculator(floor, carpet);
		System.out.println("total= "+calculator.getTotalCost());
	}
	private Floor floor;
	private Carpet carpet;	
	public Calculator(Floor floor, Carpet carpet){
		this.floor=floor;
		this.carpet=carpet;
	}
	public double getTotalCost(){
		return this.floor.getArea()*this.carpet.getCost();
	}
}
