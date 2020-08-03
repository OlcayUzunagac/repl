package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question137_ReverseSentence {

	public static void main(String[] args) {
		// olcay // Jul 25, 2020
		
	/*	Given a String variable sentence, write code to type each word in 
	 * separate lines in a reverse order.
		Example:
		sentence -> "Java is fun"
		Print
		fun
		is
		Java
		*/
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		
		String[] array = str.split(" ");
		for(int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
		
		
	}

}
