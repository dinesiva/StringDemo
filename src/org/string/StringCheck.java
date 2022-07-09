package org.string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StringCheck {

	public static void main(String[] args) {

		int a[] = new int[10];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[2] = 50;
		a[5] = 30;

		int length = a.length;
		System.out.println("Number oof value in array is " + length);

		for (int i = 0; i < length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
//------------------------------------------------------------Array concept

		int b[] = new int[4];

		b[0] = 20;
		b[1] = 40;
		b[2] = 60;
		b[3] = 80;

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
System.out.println();
//--------------------------------------------------------iteration using for loop
		for (int c : b) {
			System.out.println(c);
		}
		System.out.println();
//--------------------------------------------------------iteration using enchaned forloop
	
	//qustn 01 Write a Java program to sum values of an array
		
		int i[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		int length2 = i.length;
		for (int j = 0; j <= i.length; j++) {
			sum = sum + j;
		}
		
		System.out.println(sum);
		
//--------Write a Java program to calculate the average value of array elements.------
		
		int avg[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int value = 0;
		for (int z = 0; z < avg.length; z++) 
			value = value + avg[z];
			double average = value / avg.length;

			System.out.println(average);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
