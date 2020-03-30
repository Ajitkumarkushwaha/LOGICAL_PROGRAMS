package com.app;

import java.util.Scanner;

public class FirstNonRepeatedCharacterFromStringTest { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = "";
		
		System.out.println("Enter The String:-");
		inputString = sc.nextLine();
		for (int i = 0; i < inputString.length(); i++) {
			   boolean nonrepeat = true;
			   for (int j = 0; j < inputString.length(); j++) {
				   if (i != j && inputString.charAt(i) == inputString.charAt(j)) {
					   nonrepeat = false;
			     break;
			    }
			   }
			   if (nonrepeat) {
			    System.out.println("The first non repeated character in String is: " + inputString.charAt(i));
			    break;
			   }
			  }
		sc.close();
	}

}
