package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question115_FindMax {

	public static void main(String[] args) {
		// olcay // Jul 20, 2020
		
		/*Given an array num, get the max number in nums and print out to console.

		nums → [2, 4, 2, 3, -2]) → 4
		nums → [2, 2, 5, 3, 0 ]) → 5
		nums → [1, 33, 5, 7, 9]) → 33
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter some numbers: ");
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		
		
		int max =0;
		
		for(int value:nums) {
			
			if(value>max) {
				max=value;
			}
		}
		System.out.println(max);
		
	}

}
