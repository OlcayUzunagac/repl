package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question120_FindingMaxLengthInStringArray {

	public static void main(String[] args) {
		// olcay // Jul 20, 2020
		
	/*	Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

		Example:
		words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
		prints jaaaaavvaaaaaaaaaa
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 String: ");
		String words[] = new String[5];
		
		for(int i=0; i<words.length; i++) {
			words[i] = input.next();
		}
		
		int max = words[1].length();
		String maxstr = "";
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>max) {
				 maxstr=words[i];
			}
		}
		System.out.println(maxstr);
		
		
		
	}

}
