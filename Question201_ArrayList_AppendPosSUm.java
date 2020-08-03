package week7_Array_2D_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Question201_ArrayList_AppendPosSUm {

	public static void main(String[] args) {
		// olcay // Aug 2, 2020
		/*Create a static method that:

			is called appendPosSum
			returns an ArrayList of Integers
			takes one parameter: an ArrayList of Integers
			 
			This method should:
			Create a new ArrayList of Integers
			Add only the positive Integers to the new ArrayList
			Sum the positive Integers in the new ArrayList and add the Sum as the last element

			For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
			the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  
			The original ArrayList should remain unchanged.
			*/
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,-6,3,-8,0,4,3));
//		arr.add(4);
//		arr.add(-6);
//		arr.add(3);
//		arr.add(-8);
//		arr.add(0);
//		arr.add(4);
//		arr.add(3);
//		
		
		
		System.out.println(appendPosSum(arr));
	}
	
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> array){
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		int sum=0;
//		for(int i=0; i<array.size(); i++) {
//			if(array.get(i)>0) {
//				newList.add(array.get(i));
//				
//			}
//		}
		
		for(Integer list:array) {
			if(list>0) {
				newList.add(list);
				sum+=list;
			}
		}
		
	
		newList.add(sum);
		return newList;
		
		
		
	}

}
