package com.app;

import java.util.Scanner;

public class SuperElementInArrayApp {
		public static void main(String[] args) {
			int num, i, j, temp;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Number:- ");
			num = sc.nextInt();
			int arr[] = new int[num];
			System.out.println("Enter "+ num +" Integers:- ");
			for(i=0; i<num;i++) 
				arr[i] = sc.nextInt();	
				for(i=0; i<num-1;i++) {
					for(j=0;j<num-i-1;j++) {
						if(arr[j]>arr[j+1]) {
							temp = arr[j];
							arr[j]=arr[j+1];
							arr[j+1] = temp;
						}
					}
				}
			for(i=0;i<arr.length-2;i++) {
				if(arr[i]<arr[i+2]) {
					System.out.println(arr[i]);
				}
			}
			sc.close();
		}
	}

