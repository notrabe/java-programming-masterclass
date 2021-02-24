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
package section_07.oop_master_challenge;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Main {
	
	public static void main(String[] args) {
		
		Hamburger hamburger = new Hamburger(true, true, true, true);
		System.out.println(hamburger.price());
		System.out.println(hamburger.getBun());

		HealthyBurger healthyBurger = new HealthyBurger(true, true, true, true, true, true, true);
		System.out.println(healthyBurger.price());
		System.out.println(healthyBurger.getBun());
		System.out.println(hamburger.getBun());

		DeluxeBurger deluxeBurger = new DeluxeBurger(true, true, true, true, true, true);
		System.out.println(deluxeBurger.price());
		System.out.println(deluxeBurger.getBun());

		Hamburger hamburger2 = new Hamburger(false, true, true, false);
		System.out.println(hamburger2.price());
		System.out.println(hamburger2.getBun());
	}
}
