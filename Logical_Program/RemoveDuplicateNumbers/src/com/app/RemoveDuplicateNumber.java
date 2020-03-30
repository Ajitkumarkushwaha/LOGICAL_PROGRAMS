package com.app;

import java.util.Arrays;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {

		 int [] arr = new int [] {1, 2, 5, 5, 6, 6, 7, 2};   
		int temp = arr[0];
		boolean found = false;
		  Arrays.sort(arr); 
		for (int i = 0; i < arr.length; i++) {
		    if (temp == arr[i] && !found) {
		        found = true;
		    } else if (temp != arr[i]) {
		        System.out.print(" " + temp);
		        temp = arr[i];
		        found = false;
		    }
		}
		System.out.print(" " + temp);
}
}

