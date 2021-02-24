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
public class Hamburger {

	public String bun;
	private boolean meat=true;
	private boolean lettuce;
	private boolean mayo;
	private boolean ketchup;
	private boolean pickle;
	public double basePrice;

	public Hamburger(boolean lettuce, boolean mayo, boolean ketchup, boolean pickle) {
		this.bun = setBun("White");
		this.meat = meat;
		this.lettuce = lettuce;
		this.mayo = mayo;
		this.ketchup = ketchup;
		this.pickle = pickle;
		this.basePrice = setPrice(5);
	}

	public double additionPrice(){
		int additionCount=0;
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

	public double price(){
		return basePrice+additionPrice();
	}

	public String getBun() {
		return bun;
	}

	public boolean isMeat() {
		return meat;
	}

	public boolean isLettuce() {
		return lettuce;
	}

	public boolean isMayo() {
		return mayo;
	}

	public boolean isKetchup() {
		return ketchup;
	}

	public boolean isPickle() {
		return pickle;
	}

	public String setBun(String bun) {
		return this.bun = bun;
	}

	public double setPrice(double price){
		return this.basePrice=price;
	}
}
