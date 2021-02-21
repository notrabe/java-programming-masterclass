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
public class CodingExercise31WallArea {
	public static void main(String[] args) {
		CodingExercise31WallArea wall = new CodingExercise31WallArea(5, 4);
		System.out.println("area= "+wall.getArea());
		CodingExercise31WallArea wall2 = new CodingExercise31WallArea(-1,-1);
		System.out.println("area2= "+wall2.getArea());
	}
	private double width;
	private double height;
	public CodingExercise31WallArea(){
		this(123, 123);
	}
	public CodingExercise31WallArea(double width, double height){
		this.width=width;
		this.height=height;
		if(this.width<0){
			this.width=0;
		} 
		if(this.height<0){
			this.height=0;
		}
	}
	public double getWidth(double width){
		return this.width;
	}
	public double getHeight(double height){
		return this.height;
	}
	public void setWidth(double width){
		this.width=width;
		if(this.width<0){
			this.width=0;
		}
	}
	public void setHeight(double height){
		this.height=height;
		if(this.height<0){
			this.height=0;
		}
	}
	public double getArea(){
		return this.width*this.height;
	} 
}
