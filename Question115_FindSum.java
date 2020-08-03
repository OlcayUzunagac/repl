package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question115_FindSum {

	public static void main(String[] args) {
		// olcay // Jul 20, 2020
		
	/*	Given an array num, calculate the sum of all numbers in nums and print out to console.

		nums → [2, 1, 2, 3, 4]) → 12
		nums → [2, 2, 0, 3, 5]) → 12
		nums → [1, 3, 5, 7, 9]) → 25
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    int sum=0;
	    for(int value:nums) {
	    	sum+=value;
	    }
	    System.out.println(sum);
	}

}
