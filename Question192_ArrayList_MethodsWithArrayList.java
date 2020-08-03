package week7_Array_2D_ArrayList;

import java.util.ArrayList;

public class Question192_ArrayList_MethodsWithArrayList {

	public static void main(String[] args) {
		// olcay // Jul 30, 2020
		
	/*	We will be manipulating elements of an ArrayList by using List methods.

		The first List method we will learn is .add()

		The following code will take an ArrayList of Strings called strs and add "Hello" to it.
		str.add("Hello");

		The syntax follows something like:
		arraylistvariable.add(data to add);

		In the space to the left, add three names (any names) to the ArrayList called names.
		*/
		
		System.out.println(test());
	}
	
	public static ArrayList<String> test(){
	
	ArrayList<String> names = new ArrayList<String>();
	
	names.add("Olcay");
	names.add("Meltem");
	names.add("Okan");
	
	return names;
	
	
	}

}
