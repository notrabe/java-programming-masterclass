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
package section_08.arrays;

import java.util.Scanner;

/**
 *
 * @author notrabe <github.com/notrabe>
 */
public class Main {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		int[] myInts = getInts(5);
		for(int i=0; i< myInts.length; i++){
			System.out.println("Element " + i +", type value was " +myInts[i]);
		}
		System.out.println("The average is " +getAverage(myInts));
	
	}
	public static int [] getInts(int number) {
		System.out.println("Enter "+number+" integer values. \r");
		int[] values = new int[number];
		for(int i=0; i<values.length; i++){
			values[i] = scanner.nextInt();
		}
		return values;
	}
	public static double getAverage(int[] array){
		int sum = 0;
		for(int i=0;i<array.length;i++){
			sum += array[i];
		}
		return (double) sum / (double)array.length;
	}
}
