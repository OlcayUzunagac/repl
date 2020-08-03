package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question172_2D_DiagonalDifference {

	public static void main(String[] args) {
		// olcay // Jul 26, 2020
		
	/*	Given a square matrix, calculate the absolute difference between the sums of its diagonals.
		For example, the square matrix  is shown below:
		1 2 3
		4 5 6
		9 8 9  

		The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal =  3+5+9 = 17. 
		Their absolute difference is |15-17| = 2.
		*/
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your matrix numbers: ");
		    int[][] matrix = new int[][]{ 
		    	{scan.nextInt(), scan.nextInt(), scan.nextInt()},
		        {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		        {scan.nextInt(), scan.nextInt(), scan.nextInt()} };
		        
		    int result = 0;
		    int sum1=0;
		    int sum2=0;
		    
		    for(int i=0; i<matrix.length; i++) {
		    	for(int j=i; j<i+1; j++) {
		    		
		    		sum1+=matrix[i][j];
		    	}
		    }
		    System.out.println(sum1);
		   
		    for(int i=0; i<matrix.length; i++) {
		    	for(int j=matrix.length-1-i; j<matrix.length-i; j++) {
		    		
		    		sum2+=matrix[i][j];
		    	}
		    }
		    
		    System.out.println(sum2);
		    
		    result=sum1-sum2;
		    
		    // FINAL PRINT
		    System.out.println(Math.abs(result));
	}

}
