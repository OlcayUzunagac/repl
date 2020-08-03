package week7_Array_2D_ArrayList;

import java.util.Scanner;

public class Question199_SplitEmail {

	public static void main(String[] args) {
		// olcay // Jul 20, 2020
		
		/*Given a String variable email, write code using split method to print email id and domain in separate lines.

		Example:
		email -> info@cybertekschool.com
		Print:  
		Email id: info
		Email domain: cybertekschool.com


		If email contains no @ character or multiple @ characters then print invalid email:

		email -> hello-gmail.com
		print:  
		invalid email

		email -> my@fancy@email.com
		print:  
		invalid email*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter e-mail address: ");
		String email = input.next();		
		
		String[] arr = email.split("@");
		
		if(arr.length>2) {
			System.out.println("invalid email");
		}else if(!email.contains("@")) {
			System.out.println("invalid email");
		}else {
			String emailId=arr[0];
			String domain=arr[1];
		
			System.out.println("Email id: " + emailId + "\nEmail domain: " + domain);
		}
		
		
		
		
		
		
	}

}
