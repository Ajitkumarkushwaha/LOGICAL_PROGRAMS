package com.app;

import java.util.Scanner;

public class RemoveSpecialCharacterFromStringTest { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = "" , outputString = "";
		
		System.out.println("Enter The String:-");
		inputString = sc.nextLine();
		for(int i=0;i<inputString.length();i++)  
		{  
		//comparing alphabets with their corresponding ASCII value  
		if (inputString.charAt(i)>64 && inputString.charAt(i)<=122) //returns true if both conditions returns true  
		{  
		//adding characters into empty string   
			outputString=outputString+inputString.charAt(i);  
		}  
		}  
		System.out.println("String after removing special characters: "+outputString);  
		sc.close();
	}

}
