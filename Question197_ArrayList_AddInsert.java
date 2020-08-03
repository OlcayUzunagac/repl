package week7_Array_2D_ArrayList;

import java.util.ArrayList;

public class Question197_ArrayList_AddInsert {

	public static void main(String[] args) {
		// olcay // Jul 30, 2020
		
	/*	On the left, given an ArrayList of Strings called words, insert "hey" in the 0th index and then insert "yo" in the 3rd index.*/
		
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("Hello");
		temp.add("welcome");
		temp.add("you");
		
		
		test(temp);
	}
	
	public static void test(ArrayList<String> words) {
		
		words.add(0,"hey");
		words.add(3,"yo");
		
		System.out.println(words);
		
	}

}
