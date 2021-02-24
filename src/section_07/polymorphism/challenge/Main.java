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
package section_07.polymorphism.challenge;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Main {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {

			Car car = randomCar();
			System.out.println("The car randomly generated was " + car.getName() + "\n" + car.acclerate());
		}

	}

	public static Car randomCar() {

		int randomNumber = (int) (Math.random() * 3) + 1;
		switch (randomNumber) {
			case 1:
				return new HondaCivic();
			case 2:
				return new JeepCherokee();
			case 3:
				return new Beater();
			default:
				return null;
		}
	}
}

class Car {

	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;

	public Car(String name, boolean engine, int cylinders, int wheels) {
		this.name = name;
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
	}

	public String name() {
		return name;
	}

	public boolean isEngine() {
		return engine;
	}

	public String getName() {
		return name;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public void startEngine() {
		System.out.println("Engine has been started");
	}

	public String acclerate() {
		return "You are accelerating";
	}

	public String brake() {
		return "You are braking";
	}
}

class HondaCivic extends Car {

	public HondaCivic() {
		super("Honda Civic", true, 4, 4);
	}

	@Override
	public String acclerate() {
		return "Your Civic is acclerating!"; //To change body of generated methods, choose Tools | Templates.
	}
}

class JeepCherokee extends Car {

	public JeepCherokee() {
		super("Jeep Cherokee", true, 6, 4);
	}

	@Override
	public String brake() {
		return "Your Jeep is braking!"; //To change body of generated methods, choose Tools | Templates.
	}
}

class Beater extends Car {

	public Beater() {
		super("Beater Car.", true, 0, 4);
	}
}
