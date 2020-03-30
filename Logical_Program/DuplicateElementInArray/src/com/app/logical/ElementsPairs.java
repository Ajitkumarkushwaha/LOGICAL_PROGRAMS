package com.app.logical;

import java.util.Scanner;

public class ElementsPairs {
	public static void main(String[] args) {
		int num, i, j, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:-");
		num = sc.nextInt();
		System.out.println("Enter The Number For Matching");
		sum = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter "+ num+"Integers:-");
		for(i=0; i<num;i++) 
			arr[i] = sc.nextInt();	
		for ( i = 0; i < arr.length; i++) {
			for ( j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == sum) {
					System.out.printf("(%d, %d) %n", arr[i], arr[j]);
				}
			}
		}
		sc.close();
	}
}
