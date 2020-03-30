package com.app;
import java.util.Arrays; 
  
public class SomeOfDuplicateNumber { 
  /*
   * 
   *   Find the sum of all non-repeated elements 
   *  
   */
   
    public static void main(String[] args) { 
        int arr[] = {1, 2, 3, 1, 2, 4, 5, 6, 4}; 
        int i=0;
          
        // sort all elements of array  
        Arrays.sort(arr); 
        int sum = 0; 
        System.out.println("Sum Of Duplicate Number");
        for ( i = 0; i < arr.length-1; i++) { 
            if (arr[i] == arr[i + 1]) { 
                sum = sum + arr[i]; 
            } 
        }
        System.out.println(sum);
  
    } 
} 