package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question174_PrintUniqueNumbers {

	public static void main(String[] args) {
		// olcay // Jul 26, 2020
		
		/*Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints.
		Every single unique int should be printed from the new line. 

		Example:
		input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
		output:
		2
		9
		34
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size = scan.nextInt();		
		int[] nums = new int[size];
		for(int i=0; i<nums.length; i++) {
			System.out.println("Enter your numbers: ");
			nums[i]=scan.nextInt();
		}
		
		printUniqueNumbers(nums);
	}
	
	public static void printUniqueNumbers(int[] numbers) {
		
		int count=0;
	    
	    for(int i=0; i<numbers.length; i++) {
	    	count = 0;
	    	for(int j=0; j<numbers.length;j++) {
	    		if(numbers[i]==numbers[j]) {
	    			count++;
	    		}	    		
	    	}
	    	if(count==1) {
	    		System.out.println(numbers[i]);	    		
	    	}
	    }
		
	}

}
