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
package section_07.encapsulation;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Main {
	public static void main(String[] args) {
		
	//	Player player = new Player();
	//	player.fullName="Evan";
	//	player.health=20;
	//	player.weapon="Sword";

	//	int damage = 10;
	//	player.loseHealth(damage);
	//	System.out.println("Remaining health = " + player.healthRemaining());

	//	damage=11;
	//	player.health=200;
	//	player.loseHealth(damage);
	//	System.out.println("Remaining health = " + player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer("evan", 50, "Sword");
		System.out.println("Initial health is " + player.getHealth());
	}
}
