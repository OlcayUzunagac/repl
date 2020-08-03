package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question110_printFirstLastChar {

	public static void main(String[] args) {
		// olcay // Jul 19, 2020
		
		/*Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

		Example:

		words → ["hello", "why", "by", "apple" , "note"]
		print: 
		       ho
		       wy
		       by
		       ae
		       ne
		       */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 words: ");
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    
	    for(String value: words) {
	    	System.out.println(value.charAt(0) + "" + value.charAt(value.length()-1));
	    }
	   
	}

}
