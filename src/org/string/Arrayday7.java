package org.string;

import java.util.*;

public class Arrayday7 {

	public static void main(String[] args) {

		int roll[] = {1,2,3,4,5,6,7,8,9,10};
//length		
				int length = roll.length;
				System.out.println(length);

//sum
				int sum = 0;
				for(int i=0; i<=roll.length; i++) {
					sum = sum +i;
				}
		System.out.println(sum);
		
//average
			int avg = 0;
			for(int f=0; f<=roll.length; f++) {
				avg = avg + f;
			}
			
		System.out.println(avg/roll.length);
	
//remove duplicates		
		int mark[] = {10,20,30,40,10,50,30,60,70,20};
		
		Arrays.sort(mark);
		int length2 = mark.length;
		System.out.println(length2);
		
		Set<Integer> a	= new LinkedHashSet();
		
		a.add(10);
		a.add(20);
		a.add(10);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
