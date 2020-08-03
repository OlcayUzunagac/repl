package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question138_ReverseSentence2 {

	public static void main(String[] args) {
		// olcay // Jul 25, 2020
		
		/*Given a String variable sentence, write code to get each word 
		 * and assign to String reversed in reverse order. 

		Example:
		sentence -> "Java is fun"
		reversed -> "fun is Java"
		*/
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    String[] array = sentence.split(" ");
	    for(int i=array.length-1; i>=0; i--) {
	    	reversed = reversed+array[i]+" ";
	    			
	    }
	   reversed=reversed.trim();
	    
	    
	    
	    System.out.println(reversed);
	}

}
