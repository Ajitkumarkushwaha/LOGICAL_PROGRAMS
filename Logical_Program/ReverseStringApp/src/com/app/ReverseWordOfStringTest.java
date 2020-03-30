package com.app;

import java.util.Scanner;

public class ReverseWordOfStringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = "";
		String reversedString = "";
		System.out.println("Enter The String:-");
		inputString = sc.nextLine();
		String[] words = inputString.split(" ");
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			/* The charAt() function returns the character
			 * at the given position in a string
			 */
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(inputString);
		System.out.println(reversedString);
		sc.close();
	}

}
