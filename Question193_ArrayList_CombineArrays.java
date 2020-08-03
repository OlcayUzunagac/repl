package week7_Array_2D_ArrayList;

import java.util.ArrayList;

public class Question193_ArrayList_CombineArrays {

	public static void main(String[] args) {
		// olcay // Jul 30, 2020
		
	/*	combine two String arrays into one arraylist and return it as a string.

				for example:

				combineRs(["f","o","o"],[" b","a","r"])
				returns "foo bar"


				combineRs(["1","2","3"],[" 4"])
				returns "1234"
				
				*/
		String[] arr1 = {"f","o","o"};
		String[] arr2 = {"b","a","r"};
		
		System.out.println(combineRs(arr1, arr2));
	}
	
	public static String combineRs(String[] r1,String[] r2) {
		
		ArrayList<String> newString = new ArrayList<String>();		
		String str="";
		
				
		for(int i=0;i<r1.length;i++) {
			newString.add(r1[i]);
		}
				
		for(String temp : r2) {
			newString.add(temp);
		}
		
		
				
		for(int i=0;i<newString.size();i++) {
			str+=newString.get(i);
		}
		
		return str;
	}

}
