package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question121_ReverseSentence2 {

	public static void main(String[] args) {
		// olcay // Jul 20, 2020
		
	/*	Given a String variable sentence, write code to get each word
	 *  and assign to String reversed in reverse order. 

		Example:
		sentence -> "Java is fun"
		reversed -> "fun is Java"
		
		*/
		
		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    String reversed = "";
		    //TODO: start your code here
		    
		   
		    String[] arr = sentence.split(" ");
		    
		   
		    
		    for(int i=arr.length-1; i>=0; i--){
		      
		      if(i==0){
		        reversed=reversed + arr[i];
		      }else{
		        reversed=reversed + arr[i] + " ";
		      }
		       
		       
		    }
		    
		    
		    
		    //End your code here. do not modify below statement
		    System.out.println(reversed);
	}

}
