package week7_Array_2D_ArrayList;

import java.util.Arrays;

public class Question143_2D_MultiplicationTable {

	public static void main(String[] args) {
		// olcay // Jul 26, 2020
		
		/*
		Two-dimensional Arrays - 2D array has a type such as 
		int[][] or String[][], with two pairs of square brackets. 
		The elements of a 2D array are arranged in rows and columns, 
		and the new operator for 2D arrays specifies both the number of rows and the number of columns.
		*/
		
		int [][] multiplicationTable = new int[10][10];
		
		for(int row=0; row<multiplicationTable.length; row++) {
			
			for(int column=0; column<multiplicationTable[row].length; column++) {
				
				multiplicationTable[row][column]=(row+1)*(column+1);
				System.out.print(multiplicationTable[row][column] + " ");
			
			}
			System.out.println();
		}
		
		
		
		
		
	
		
	}
	
	

}
