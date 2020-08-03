package week7_Array_2D_ArrayList;

import java.util.Arrays;

public class Question129_CopyCertainValues {

	public static void main(String[] args) {
		// olcay // Jul 24, 2020
	/*	Given a String array arr with the following elements
		["zero", "one", "two","three","four"]

		Create another array fewValues and copy words that have letter "e" in them

		You need to know how many element contain "e" and create array accordingly

		Values in fewValues array need to be["zero", "one","three"]
		*/
		
		System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {
	    
		  int count=0; 
		  for(String values : arr) {
			  if(values.contains("e")) {
			   count++;
			  }		   
		  }
		  String[] fewValues = new String[count];  
		  
		  String str="";
		  for(String values : arr) {
			  if(values.contains("e")) {
				  str+=values+" ";
			  }		   
		  }
		  
		  fewValues = str.split(" ");
		  
	    
	    return fewValues;
		
		
		
		
		
		
		
		
		
		
		
	}

}
