package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question139_FrontPiece {

	public static void main(String[] args) {
		// olcay // Jul 25, 2020
		
	/*	Given an int array of any length, print a new array of its first 2 elements.
		If the array is smaller than length 2, use whatever elements are present.

		Example:
		input 1, 2, 3 
		output: [1, 2]

		Example:
		input 1,
		output: [1]
		*/
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i=0; i<size; i++) {
			num[i]=scan.nextInt();
		}
		
		int newSize=0;
		if(size==1) {
			newSize=1;
		}else if(size==0){
			newSize=0;
		}else {
			newSize=2;
		}
		
		int[] newArray = new int[newSize];
		for(int i=0; i<newSize; i++) {
			newArray[i]=num[i];
		}
		
		System.out.println(Arrays.toString(newArray));
		
	
	}

}
