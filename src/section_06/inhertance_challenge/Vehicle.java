/*
 * The MIT License
 *
 * Copyright 2021 notrabe <github.com/notrabe>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package section_06.inhertance_challenge;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Vehicle {
	private int engine;

	public Vehicle(int engine, int wheels, int transmission) {
		this.engine = engine;
	}

	public void steering(int steer){
		String s="";
		if(steer<5&&steer>0){
			s="left";
		}
		if(steer>0&&steer<5){
			s="right";	
		}
		System.out.println("Vehicle.steering() called. This vehicle is steering "+s);
	}	

	public void gears(int gear){
		System.out.println("Vehicle.gears() called. This vehicle is currently at gear "+gear);
	}

	public void speed(int speed){
		System.out.println("Vehicle.speed() called. This vehicle is moving at "+speed);
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

}
