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
public class HealthyBurger extends Hamburger{

	private boolean onion;
	private boolean cheese;
	private boolean bacon;

	public HealthyBurger(boolean onion, boolean cheese, boolean bacon, boolean lettuce, boolean mayo, boolean ketchup, boolean pickle) {
		super(lettuce, mayo, ketchup, pickle);
		bun=setBun("Rye");
		basePrice=6.00;
		this.onion = onion;
		this.cheese = cheese;
		this.bacon = bacon;
	}

	@Override
	public double additionPrice() {
		int additionCount=0;
		if(onion){
			additionCount++;
		}
		if(cheese){
			additionCount++;
		}
		if(bacon){
			additionCount++;
		}
		if(lettuce){
			additionCount++;
		}
		if(mayo){
			additionCount++;
		}
		if(ketchup){
			additionCount++;
		}
		if(pickle){
			additionCount++;
		}
		return 0.25*additionCount;
	}

	
}
