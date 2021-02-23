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
package section_07.encapsulation.challenge;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Printer {
	
	private int toner;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(int toner, int pagesPrinted, boolean duplex) {
		this.toner = toner;
		this.pagesPrinted = pagesPrinted;
		this.duplex = duplex;
	}

	public void fillToner(int newToner){
		if((toner += newToner)>100){
			int unitsOfToner = 100 - toner;
			toner += unitsOfToner;
			System.out.println("You can only fill toner to 100. Toner has been filled.");
		} else {
			toner += newToner;
			System.out.println("Toner filled to level of " + toner);
		}
	}

	public void print(int pagesToPrint){
		pagesPrinted += pagesToPrint;
		toner = toner-pagesToPrint;
		if (toner<0){
			toner=0;
			int canPrint = pagesToPrint - toner;
			System.out.println("You are out of toner. You can only print " + canPrint + "pages");
		} else {
			System.out.println("Total pages printed = " + pagesPrinted + ", toner = " + toner);
		}
	}

	public int getToner() {
		return toner;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public boolean isDuplex() {
		return duplex;
	}
	
	
}
