package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question126_PrintShortestWord2_FromString {

	public static void main(String[] args) {
		// olcay // Jul 23, 2020
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write a string: ");
	    String str = scan.nextLine();
		
		String[] array = str.split(", ");
		
		int min = array[0].length();
		int index=0;
		int count=0;
		for(int i=1; i<array.length; i++) {
			
			if(array[i].length()<min) {
				
				index=i;
				min=array[i].length();
			}
		}
		
		for(int i=0; i<array.length; i++) {
			if(array[i].length()==array[index].length()) {
				count++;
			}			
		}
		
		
		String[] arrayShort = new String[count];
		int arr=0;
		for(int i=0; i<array.length; i++) {
			if(array[i].length()==min) {
				arrayShort[arr]=array[i];
				arr++;
			}			
		}
		
		Arrays.sort(arrayShort);
		System.out.println(Arrays.toString(arrayShort));
		
		
		
	}

}
