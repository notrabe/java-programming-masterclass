/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section_06.Classes;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Main {
	public static void main(String[] args){
		Car porsche=new Car();
		Car holden=new Car();
        	porsche.setModel("Carrera");
		holden.setModel("Commodore");
		System.out.println("Model is "+porsche.getModel());
	}
}
