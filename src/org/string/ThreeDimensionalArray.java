package org.string;

public class ThreeDimensionalArray {
	
	public static void main(String[] args) {
		
		int mark[][][] = new int[3][2][2];
		
		mark[0][0][0] = 10;
		mark[0][0][1] = 20;
		mark[0][1][0] = 30;
		mark[0][1][1] = 40;
		
		mark[1][0][0] = 50;
		mark[1][0][1] = 60;
		mark[1][1][0] = 70;
		mark[1][1][1] = 80;
		
		mark[2][0][0] = 85;
		mark[2][0][1] = 90;
		mark[2][1][0] = 95;
		mark[2][1][1] = 100;
		
		for(int[][] b:mark) {
			for(int[] c:b) {
				for(int d:c) {
					System.out.print(d + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
//----------------------------------------------------------
		
	/*	for(int i=0; i<=2; i++) {
			for(int j=0; j<=1; j++) {
				for(int k=0; k<=1; k++) {
					System.out.print(mark[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
