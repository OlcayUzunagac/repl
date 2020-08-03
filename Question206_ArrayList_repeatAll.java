package week7_Array_2D_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Question206_ArrayList_repeatAll {

	public static void main(String[] args) {
		// olcay // Aug 3, 2020
			/*Create a static method that:
			is called repeatAL
			returns nothing
			takes in a single parameter - an ArrayList of Booleans

			This method should modify its ArrayList parameter by repeating its ArrayList values.  

			For example, if the parameter is 
			(true, false, false)
			The modified ArrayList should be
			(true, false, false, true, false, false)
			*/
		
		ArrayList<Boolean> arr1 = new ArrayList<Boolean>(Arrays.asList(false, true, true));

		
		repeatAL(arr1);
		
	}
	public static void repeatAL(ArrayList<Boolean> arr) {
		
		ArrayList<Boolean> newList = new ArrayList<Boolean>();
		for(Boolean list : arr) {
			newList.add(list);
		}
		
		for(Boolean list : arr) {
			newList.add(list);
		}
		
		
		System.out.println(newList.toString());
		
		
	}

}
