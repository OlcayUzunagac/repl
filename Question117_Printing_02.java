package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question117_Printing_02 {

	public static void main(String[] args) {
		// olcay // Jul 20, 2020
		
/*		The code provided in your main method will take in eight Strings and save them into an array called arr.  
		Print out the 4 lines using for loop: 
		each line should contain a pair of array element as displayed below
		user for loop

		Example:
		arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"] 
		 prints:  apple , banana
		          kiwi , grape
		          milk, "soda"
		          juice, coffee
		          */
		Scanner scan = new Scanner(System.in);
		String[] arr=new String[8];
		System.out.println("Enter 8 Strings: ");
		
		for(int i=0; i<8; i++) {
		System.out.print((i+1) + ". ");
		
		arr[i] = scan.nextLine();
		}
		
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i] + " , " + arr[i+1]);
		}
		
	}

}
