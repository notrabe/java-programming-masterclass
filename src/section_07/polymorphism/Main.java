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
package section_07.polymorphism;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Main {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i
					+ " : " + movie.getName() + "\n"
					+ "Plot:" + movie.plot());
		}
	}

	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number generated was " + randomNumber);
		switch (randomNumber) {
			case 1:
				return new Jaws();

			case 2:
				return new IndependeceDay();

			case 3:
				return new MazeRunner();

			case 4:
				return new StarWars();

			case 5:
				return new Forgettable();
		}

		return null;
	}
}

class Movie {

	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String plot() {
		return "No plot here";
	}
}

class Jaws extends Movie {

	public Jaws() {
		super("Jaws");
	}

	public String plot() {
		return "A shark eats lots of people.";
	}
}

class IndependeceDay extends Movie {

	public IndependeceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		return "Aliends attempt to take over planet earth.";
	}

}

class MazeRunner extends Movie {

	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		return "Kids try and escape a maze"; //To change body of generated methods, choose Tools | Templates.
	}

}

class StarWars extends Movie {

	public StarWars() {
		super("Star  Wars");
	}

	@Override
	public String plot() {
		return "Imperial Forces try to take over the universe"; //To change body of generated methods, choose Tools | Templates.
	}

}

class Forgettable extends Movie {

	public Forgettable() {
		super("Forgettable");
	}

}
