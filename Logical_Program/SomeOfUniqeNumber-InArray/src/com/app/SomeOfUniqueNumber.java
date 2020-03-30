package com.app;
import java.util.Arrays;

public class SomeOfUniqueNumber { 
  
// Find the sum of all non-repeated elements     
    public static void main(String[] args) { 
        int arr[] = {1, 2, 3, 1, 1, 4, 5, 6}; 
        // sort all elements of array  
        Arrays.sort(arr); 
        int sum = arr[0];
        System.out.println("Some Of Unique Number In Given Array");
       for(int i=0; i<arr.length-1;i++) {
    	   if(arr[i] != arr[i+1]) {
    		   sum += arr[i+1];
    	   }
       }
       System.out.println(sum);
  
    } 
} 