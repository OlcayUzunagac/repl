package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question122_FindNonDuplicate {

	public static void main(String[] args) {
		// olcay // Jul 21, 2020
		
		/*Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

		Example:

		nums -> [1, 1, 2, 3, 4, 3, 4]
		         	1,1,2,3,4,3,4
		         */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 7 integer: ");
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    int count=0;
	    
	    for(int i=0; i<nums.length; i++) {
	    	count = 0;
	    	for(int j=0; j<nums.length;j++) {
	    		if(nums[i]==nums[j]) {
	    			count++;
	    		}	    		
	    	}
	    	if(count<2) {
	    		System.out.println(nums[i]);
	    		break;
	    	}
	    }
	  
	    
	    
	    
	}

}
