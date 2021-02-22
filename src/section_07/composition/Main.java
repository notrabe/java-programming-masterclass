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
package section_07.composition;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Main {

	public static void main(String[] args) {

		Dimensions dimensions = new Dimensions(20, 20, 5);

		Case theCase = new Case("220B", "Dell", "240", dimensions);

		Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));

		Motherboard motherboard = new Motherboard("bj200", "Asus", 4, 6, "v2.44");

		PC thePC = new PC(theCase, theMonitor, motherboard);
		thePC.getMonitor().drawPixelAt(1500, 1200, "red");
		thePC.getMotherboard().loadProgram("Windows 1.0");
		thePC.getTheCase().pressPowerButton();

	}

}
