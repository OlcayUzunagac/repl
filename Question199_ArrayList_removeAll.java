package week7_Array_2D_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Question199_ArrayList_removeAll {

	public static void main(String[] args) {
		// olcay // Jul 30, 2020
		
	/*		Create a static method that:
			is called removeAll
			returns nothing
			takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord

			This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

			Example:

			ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("el","hey","hop","yon"));

			removeAll(wordList,"hid");

			now wordList is ["hey","yo"]
			*/
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo","hire"));
		
		String targetWord = "hey";
		
		removeAll(wordList, targetWord);
	}
	
	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		
		for(int i=0; i<wordList.size(); i++) {
			if(wordList.contains(targetWord)) {
				wordList.remove(targetWord);
			}
		}
		
		System.out.println(wordList.toString());
	}

}
