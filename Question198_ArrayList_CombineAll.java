package week7_Array_2D_ArrayList;

import java.util.ArrayList;

public class Question198_ArrayList_CombineAll {

	public static void main(String[] args) {
		// olcay // Jul 30, 2020
		
		/*Create a static method that:
			is called combineAL
			returns an ArrayList
			takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

			This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, 
			then add all the words (in order) from wordList2.  In other words, it is combining all the elements from the two parameters.
			*/
		ArrayList<String> temp1 = new ArrayList<>();
		temp1.add("Hello");
		temp1.add("olcay");
		temp1.add("salla");
		ArrayList<String> temp2 = new ArrayList<>();
		temp2.add("Welcome");
		temp2.add("okan");
		
		
		
		
		System.out.println(combineAl(temp1, temp2));
		
	}
	
	public static ArrayList<String> combineAl(ArrayList<String> wordList1, ArrayList<String> wordList2){
		
		ArrayList<String> newList = new ArrayList<>();
		newList.addAll(wordList1);
		newList.addAll(wordList2);
		
		
		
		return newList;
		
		
	}

}
