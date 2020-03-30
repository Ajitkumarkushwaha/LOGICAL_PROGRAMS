package com.app;

import java.util.Scanner;

public class ReverseStringTest { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = "" , reverString = "";
		
		System.out.println("Enter The String:-");
		inputString = sc.nextLine();
		for(int i=inputString.length()-1;i>=0;i--) {
			reverString = reverString+ inputString.charAt(i);
		}
		System.out.println("Reverse String Is:- "+ reverString);
		sc.close();
	}

}
