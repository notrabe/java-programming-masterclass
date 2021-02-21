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
public class Floor {
	private double width;
	private double length;	
	public Floor(double width, double length){
		this.width=width;
		this.length=length;
		if(this.width<0){
			this.width=0;
		}
		if(this.length<0){
			this.length=0;
		}
	}
	public double getArea(){
		return this.width*this.length;
	}
}
