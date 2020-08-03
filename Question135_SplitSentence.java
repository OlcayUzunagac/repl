package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question135_SplitSentence {

	public static void main(String[] args) {
		// olcay // Jul 25, 2020
		
		/*Given a String variable sentence, write code to type each word in separate lines.

		Example:
		sentence -> "Java is fun"
		Print
		Java
		is
		fun*/
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String[] sentenceArray = sentence.split(" ");
	    for(String value:sentenceArray) {
	    	System.out.println(value);
	    }
	    
	}

}
