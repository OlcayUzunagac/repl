package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question124_ReverseArray {

	public static void main(String[] args) {
		// olcay // Jul 23, 2020
	/*	Given an array nums with 7 integers already assigned, write code to reverse it.
		Do not use any additional arrays or Strings.

		Example:

		nums -> [4, 3, 2, 44, 1, 100, 55]
		change it to:
		nums -> [55, 100, 1, 44, 2, 3, 4]
		*/
		
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter 7 numbers: ");
		 int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		
			 
		for(int i=0;i<nums.length/2;i++) {
			
			int temp=nums[i];
			nums[i]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
			
		}
		
//		int first=nums[0]; 
//		nums[0]=nums[6];
//		nums[6]=first;
//		
//		int second = nums[1];
//		nums[1]=nums[5];
//		nums[5]=second;
//		
//		int third = nums[2];
//		nums[2]=nums[4];
//		nums[4]=third;
		
		
		 System.out.println(Arrays.toString(nums));

	}

}
