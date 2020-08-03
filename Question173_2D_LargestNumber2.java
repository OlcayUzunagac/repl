package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question173_2D_LargestNumber2 {

	public static void main(String[] args) {
		// olcay // Jul 26, 2020
		
		/*Given a 2d array of ints, find the biggest number(integer) and 
		replace all array values on biggest number in the array then print an array.
		Example:
		Given values: [[1, 2, 3], [5, 33, 9]]
		output: [[33, 33, 33], [33, 33, 33]]
		*/
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter your rows and columns: ");
		int rows = inp.nextInt();
		int cols = inp.nextInt();		
		int[][] arr = new int[rows][cols];		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols;j++) {				
				System.out.println("Enter row " + (i+1)  + " column " + (j+1));
				arr[i][j] = inp.nextInt();
			}
		}
		
		int max=0;
		for(int i=0;i<rows;i++) {
			for(int j=0; j<cols; j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j]=max;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
	

}
