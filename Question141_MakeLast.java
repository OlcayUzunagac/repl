package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question141_MakeLast {

	public static void main(String[] args) {
		// olcay // Jul 26, 2020
		
	/*	Given an int array, print a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
		Example:
		input: 4 5 6
		output: [0, 0, 0, 0, 0, 6]

		Example:
		input: 0
		output: [0, 0]

		Example:
		input: 1 2 3 4
		output: [0, 0, 0, 0, 0, 0, 0, 4]
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size=scan.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter number " + (i+1));
			array[i]=scan.nextInt();
		}
		
		int[] newArray = new int[size*2];
		for(int i=0;i<newArray.length-1;i++) {
			newArray[i]=0;
		}
		
		newArray[newArray.length-1]=array[array.length-1];
		System.out.println(Arrays.toString(newArray));
		
		
		
	}

}
