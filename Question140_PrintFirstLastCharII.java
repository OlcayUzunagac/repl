package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question140_PrintFirstLastCharII {

	public static void main(String[] args) {
		// olcay // Jul 25, 2020
		
	/*	Given a String array words, iterate through each word and print first and last letter of each element in the format below.

		Example:

		words → ["hello", "why", "by", "apple" , "note"]
		print → [ho, wy, by, ae, ne] 
		*/
		
		Scanner input = new Scanner(System.in);
		String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(),};
		
		
		String str = "";
		
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			
			for(int j=0;j<word.length();j++) {
				
				words[i]=str+word.charAt(0)+word.charAt(word.length()-1);
			}
		}
		
		System.out.println(Arrays.toString(words));
		
		
	}

}
