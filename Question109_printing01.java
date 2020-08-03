package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question109_printing01 {

	public static void main(String[] args) {
		// olcay // Jul 19, 2020
		
			/*The code provided in your main method will take in five Strings and save them into an array called arr.  
			Print out the first three letters of each element of arr, one per line.  
			You can assume that every element of arr is at least 3 letters long.
		
		Example:
			arr -> ["apple", "banana"] 
			 prints: app
			         ban
			         
			         */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five integer with at least 5 letters: ");
		String[] arr= new String[5];
		
		for(int i=0; i<5; i++) {
			
			arr[i]=input.next();
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(String value: arr) {
			
			System.out.println(value.substring(0, 3));
		}
		
		
	}

}
