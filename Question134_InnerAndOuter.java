package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question134_InnerAndOuter {

	public static void main(String[] args) {
		// olcay // Jul 24, 2020
		/*Given two arrays of ints sorted in increasing order, outer and inner, print out true if all of the numbers in inner appear in outer. Take advantage of the fact that both arrays are already in sorted order.
		Example:
		input (outer): 1, 2, 4, 6
		input (inner): 2, 4
		output: true

		Example:
		input (outer): 1, 2, 4
		input (inner): 6, 5
		output: false*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write size of the inner : ");
		int sizeInner = scan.nextInt();
		System.out.println("Write size of the Outer : ");
		int sizeOuter = scan.nextInt();
		
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		
		for(int i =0; i < sizeInner; i++) {
			System.out.println("Write the number "  + (i+1) +  " of the Inner");
			inner[i] = scan.nextInt();
		}
		for(int j =0; j < sizeOuter; j++) {
			System.out.println("Write the number "  + (j+1) +  " of the Outer");
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		//WRITE YOUR CODE HERE
		
		
		int count=0;
		for(int i=0;i<sizeInner; i++) {
			for(int j=0; j<sizeOuter;j++) {
				if(inner[i]==outer[j]) {
					count++;
					break;
					}
				}
				
			 }
		
		if(count==sizeInner) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	
		
	}

}
