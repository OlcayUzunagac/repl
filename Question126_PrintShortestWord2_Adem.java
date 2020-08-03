package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question126_PrintShortestWord2_Adem {

	public static void main(String[] args) {
		// olcay // Jul 23, 2020
		
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String[] arr = str.split(", ");
		int min = arr[0].length();
		String newStr = "";
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < min) {
				min = arr[i].length();
				
			}
		}
		for(int i=0; i<arr.length;i++) {
			if(arr[i].length()== min) {
				newStr += arr[i] + " "; 
			}
		}
		
		
		String[] newArray = newStr.split(" ");
		Arrays.sort(newArray);
		System.out.println(Arrays.toString(newArray));
	}

}
