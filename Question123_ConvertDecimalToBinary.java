package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question123_ConvertDecimalToBinary {

	public static void main(String[] args) {
		// olcay // Jul 23, 2020
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter decimal: ");
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    //TODO: Write your code below.
	   
	    
	    int rest=0;
	    
	    for(int i=binary.length-1; i>=0; i--) {
	    	
	    	rest=decimal%2;
	    	binary[i]=rest;
	    	decimal=decimal/2;
	    }	   

	    System.out.println(Arrays.toString(binary));
	    
	}

}
