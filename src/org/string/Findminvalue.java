package org.string;

public class Findminvalue {
	public static void main(String[] args) {
		
		int ab[][] = {{3,8,6},{4,6,5},{7,8,1}};
		
		int min = ab[0][0];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				if(ab[i][j]<min) {
					min = ab[i][j];
				}
			}
		}
			System.out.println(min);
	}

}
