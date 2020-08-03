package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question142_2D_LargestNumber {

	public static void main(String[] args) {
		// olcay // Jul 26, 2020
		
		
		/*Given a 2d array of ints, find the biggest number(int) in the array and print it.*/
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter rows and columns number: ");
		
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++) {
	    	
	      for(int j=0 ;j<=cols-1;j++){
	    	  
	    	System.out.println("Enter row " + (i+1) + " column " + (j+1));
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    int max =0;
	    for(int i=0; i<rows; i++) {
	    	for(int j=0;j<cols;j++) {
	    		if(arr[i][j]>max) {
	    			max=arr[i][j];
	    		}
	    	}
	    }
	    System.out.println(max);
	    
	}

}
