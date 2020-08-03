package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question125_PrintShortestWord {

	public static void main(String[] args) {
		// olcay // Jul 23, 2020
		
	/*	Write a program that will print the shortest word in the given array str. 

		input: java, cable, red, vivid, remedy, grace
		output: red
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter words: ");
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	    
	    int index=0;
	    int min = str[0].length();
	    
	    for(int i=1; i<str.length; i++) {
	    	
	    	if(str[i].length()<min) {
	    		index=i;
	    		min=str[i].length();
	    	}
	    	
	    }
	    System.out.println(str[index]);
	    
	}

}
