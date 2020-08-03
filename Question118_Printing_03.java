package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question118_Printing_03 {

	public static void main(String[] args) {
		// olcay // Jul 20, 2020
		
	/*	The code provided in your main method will take in six Strings and save them into an array called arr.  
		Print out the 3 neighboring items of the array in one line until the last line
		each line should contain 3 neighboring items of array element as displayed below
		user for loop

		Example:
		arr -> ["apple", "banana","kiwi", "grape","milk","soda"] 
		 prints:  apple , banana , kiwi
		          banana , kiwi , grape
		          kiwi , grape , milk
		          grape , milk , soda
		          */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 6 Strings:");
		
		String[] arr = new String[6];
		
		for(int i=0;i<arr.length; i++) {
			arr[i]=scan.next();
		}
		
		
		for(int i=0;i<arr.length-2;i++) {
			
			System.out.println(arr[i] + " , " + arr[i+1] + " , " + arr[i+2]);
		}
		
	}

}
