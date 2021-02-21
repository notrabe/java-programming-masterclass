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
public class Carpet {
	private double cost;
	public Carpet(double cost){
		this.cost=cost;
		if(this.cost<0){
			this.cost=0;
		}
	}	
	public double getCost(){
		return this.cost;
	}
}
