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
package section_06.coding_exercises.coding_exercise_36;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Main {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(5, 10);
		System.out.println("rectangle.width= "+rectangle.getWidth());
		System.out.println("rectangle.length= "+rectangle.getLength());
		System.out.println("rectangle.area= "+rectangle.getArea());
		Cuboid cuboid=new Cuboid(5, 10, 5);
		System.out.println("cuboid.width= "+cuboid.getWidth());
		System.out.println("cuboid.length= "+cuboid.getLength());
		System.out.println("cuboid.area= "+cuboid.getArea());
		System.out.println("cuboid.height= "+cuboid.getHeight());
		System.out.println("cuboid.volume= "+cuboid.getVolume());
	}
	
}
