package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question130_ShiftLeft {

	public static void main(String[] args) {
		// olcay // Jul 24, 2020
	/*	Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. 
		You may modify and print the given array, or print a new array*/
		
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    
	    int k=nums[0];
	    for(int i=0; i<nums.length-1; i++) {
	    	nums[i]=nums[i+1];
	    }
	    nums[nums.length-1]=k;
		System.out.println(Arrays.toString(nums));
		
	}

}
