package com.app;

import java.util.Scanner;

public class FindOccuranceOfDuplicateStringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = "";
		System.out.println("Enter The String:-");
		inputString = sc.nextLine();
		int counter[] = new int[256]; 

		//String length
		int len = inputString.length(); 

		for (int i = 0; i < len; i++) 
			counter[inputString.charAt(i)]++; 
		char array[] = new char[inputString.length()]; 
		for (int i = 0; i < len; i++) { 
			array[i] = inputString.charAt(i); 
			int flag = 0; 
			for (int j = 0; j <= i; j++) { 

				if (inputString.charAt(i) == array[j])  
					flag++;                 
			} 

			if (flag == 1)  
				System.out.println("Occurrence of char " + inputString.charAt(i)
				+ " in the String is:" + counter[inputString.charAt(i)]);             
		} 
		sc.close();
	}

}
