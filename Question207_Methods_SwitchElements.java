package week7_Array_2D_ArrayList;

import java.util.Arrays;

public class Question207_Methods_SwitchElements {

	public static void main(String[] args) {
		// olcay // Jul 26, 2020
		
		/*Switch the last element in an array with the first and return the array.

				example:

				do_switch([1,2,3,4])
				returns:[[4,2,3,1]

				do_switch([7,2,3,5])
				returns:[5,2,3,7]
				*/
		
		int[] x = {1,2,3,4};
		System.out.println(Arrays.toString(do_switch(x)));
	}
	public static int[] do_switch(int[] arr){

		
		
		int temp = arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		
		
		
		
		return arr;
	}
	

}
