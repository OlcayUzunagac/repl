package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question_144_2D_MatchTwo {

	public static void main(String[] args) {
		// olcay // Jul 26, 2020
		
	/*	Like in a match 3 game but not.

		You get a 2d array and you need to find how many two matches there are.
		and return the number(int) of matches you found.

		For example : 1 and 2 are not a match, 2 and 2 are a match.
		a match in this case is two numbers in a row that are equal .

		for example:
		[2,2,1,3,4,5]
		[5,2,3,3,4,5]
		[3,2,3,1,4,5]

		print
		matches: 2
		*/
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter rows and columns number: ");
		int rowsLength = inp.nextInt();
		int colsLength = inp.nextInt();
		
		int[][] arr = new int[rowsLength][colsLength];
		
		for(int i=0; i<rowsLength; i++) {
			for(int j=0; j<colsLength; j++) {
				System.out.println("Enter rows " + (i+1) + " columns " + (j+1));
				arr[i][j]=inp.nextInt();
			}
		}
		
		int matches = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				
				if(arr[i][j]==arr[i][j+1]) {
					matches++;
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("matches: " + matches);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 	}

}
