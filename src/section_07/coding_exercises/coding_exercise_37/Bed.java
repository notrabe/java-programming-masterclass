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
package section_07.coding_exercises.coding_exercise_37;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Bed {
	
	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;

	public Bed(String style, int pillows, int height, int sheets, int quilt) {
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}



	public void make(){
		System.out.println("Bed -> Making | ");
	}

	public String getStyle() {
		return style;
	}

	public int getPillows() {
		return pillows;
	}

	public int getHeight() {
		return height;
	}

	public int getSheets() {
		return sheets;
	}

	public int getQuilt() {
		return quilt;
	}


}
