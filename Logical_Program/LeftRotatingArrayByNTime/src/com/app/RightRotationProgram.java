package com.app;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotationProgram {

	/*
	 * int temp;
	 * 
	 * for (int i = 0; i < n; i++) { temp = inputArray[0];
	 * 
	 * for (int j = 0; j < inputArray.length-1; j++) { inputArray[j] =
	 * inputArray[j+1]; }
	 * 
	 * inputArray[inputArray.length - 1] = temp; }
	 * 
	 */
	public static void main(String[] args) {
		int num, i, j, temp , nrot;
		Scanner sc = null; 
		sc = new Scanner(System.in);
		System.out.println("Enter The Number:-");
		num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter " + num + "Integers:-");
		for (i = 0; i < num; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter The No Of Rotation");
		nrot = sc.nextInt(); 
		for(i=0; i< nrot; i++) { 
			temp = arr[arr.length-1]; 
				for(j=arr.length-1; j>0; j--) {
					arr[j]= arr[j-1];
				}
				arr[0]= temp; 
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]); 
		}
		System.out.println("After Rotation Of Array");
		System.out.println(Arrays.toString(arr)); 
		//close the resources sc.close();
		sc.close();

	}
}